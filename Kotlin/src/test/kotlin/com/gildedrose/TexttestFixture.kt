package com.gildedrose

import org.approvaltests.Approvals
import org.junit.After
import org.junit.Before
import org.junit.Test

fun main(args: Array<String>) {

    println("OMGHAI!")

    val items = arrayOf(createItem("+5 Dexterity Vest", 10, 20), //
            createItem("Aged Brie", 2, 0), //
            createItem("Elixir of the Mongoose", 5, 7), //
            createItem("Sulfuras, Hand of Ragnaros", 0, 80), //
            createItem("Sulfuras, Hand of Ragnaros", -1, 80),
            createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            createItem("Conjured Mana Cake", 3, 6))

    val app = GildedRose(items)

    var days = 2
    if (args.size > 0) {
        days = Integer.parseInt(args[0]) + 1
    }

    for (i in 0..days - 1) {
        println("-------- day $i --------")
        println("name, sellIn, quality")
        for (item in items) {
            println(item)
        }
        println()
        app.updateQuality()
    }
}



class TestGoldenMaster {

    private val originalSysOut: java.io.PrintStream = System.out
    private var capturedStream: java.io.ByteArrayOutputStream = java.io.ByteArrayOutputStream()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        this.capturedStream = java.io.ByteArrayOutputStream()
        val printStream = java.io.PrintStream(this.capturedStream)
        System.setOut(printStream)
    }

    @Test
    fun itShouldGoldenMaster() {
        main(emptyArray())
        Approvals.verify(capturedStream);
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        System.setOut(this.originalSysOut)
    }
}