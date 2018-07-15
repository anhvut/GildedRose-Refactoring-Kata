package com.gildedrose

import java.io.{ByteArrayOutputStream, PrintStream}

import org.approvaltests.Approvals
import org.junit.Test

object TexttestFixture {
  def main(args: Array[String]): Unit = {
    var items = Array[Item](
      Factory.createItem("+5 Dexterity Vest", 10, 20),
      Factory.createItem("Aged Brie", 2, 0),
      Factory.createItem("Elixir of the Mongoose", 5, 7),
      Factory.createItem("Sulfuras, Hand of Ragnaros", 0, 80),
      Factory.createItem("Sulfuras, Hand of Ragnaros", -1, 80),
      Factory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
      Factory.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
      Factory.createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
      // this conjured item does not work properly yet
      Factory.createItem("Conjured Mana Cake", 3, 6)
    )
    val app = new GildedRose(items)
    val days = if (args.length > 0) args(0).toInt + 1 else 2
    for (i <- 0 until days) {
      System.out.println("-------- day " + i + " --------")
      System.out.println("name, sellIn, quality")
      for (item <- items) {
        System.out.println(item.name + ", " + item.sellIn + ", " + item.quality)
      }
      System.out.println()
      app.updateQuality()
    }
  }
}

class GoldenMasterTest {
  @Test
  def goldenMasterTest() {
    val originalSysOut = System.out
    val capturedStream = new ByteArrayOutputStream
    val printStream: PrintStream = new PrintStream(capturedStream)
    System.setOut(printStream)

    TexttestFixture.main(Array[String]())
    System.setOut(originalSysOut)

    Approvals.verify(capturedStream.toString)
  }
}