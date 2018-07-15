package com.gildedrose

object Factory {
  def createItem(name: String, sellIn: Int, quality: Int): Item = {
    name match {
      case "Aged Brie" => new AgedBrieItem(name, sellIn, quality)
      case "Backstage passes to a TAFKAL80ETC concert" => new BackstageItem(name, sellIn, quality)
      case "Sulfuras, Hand of Ragnaros" => new SulfurasItem(name, sellIn, quality)
      case _ => new Item(name, sellIn, quality)
    }
  }
}

class Item(val name: String, var sellIn: Int, var quality: Int) {

  final def updateItem(): Unit = {
    updateQuality()
    updateExpiration()
    if (isExpired) {
      updateAfterExpiration()
    }
  }

  protected def updateAfterExpiration(): Unit = {
    decreaseQuality()
  }

  protected def updateExpiration(): Unit = {
    decreaseSellIn()
  }

  protected def updateQuality(): Unit = {
    decreaseQuality()
  }

  final protected def isExpired: Boolean = sellIn < 0

  final protected def decreaseSellIn(): Unit = {
    sellIn = sellIn - 1
  }

  final protected def decreaseQuality(): Unit = {
    if (quality > 0) {
      quality = quality - 1
    }
  }

  final protected def dropQuality(): Unit = {
    quality = 0
  }

  final protected def increaseQuality(): Unit = {
    if (quality < 50) {
      quality = quality + 1
    }
  }
}