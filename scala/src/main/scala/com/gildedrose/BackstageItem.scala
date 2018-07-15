package com.gildedrose

class BackstageItem(val n: String, val s: Int, val q: Int) extends Item(n, s, q) {

  override protected def updateAfterExpiration(): Unit = {
    dropQuality()
  }

  override protected def updateExpiration(): Unit = {
    decreaseSellIn()
  }

  override protected def updateQuality(): Unit = {
    increaseQuality()

    if (sellIn < 11) {
      increaseQuality()
    }

    if (sellIn < 6) {
      increaseQuality()
    }
  }
}