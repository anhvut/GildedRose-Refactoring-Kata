package com.gildedrose

class AgedBrieItem(val n: String, val s: Int, val q: Int) extends Item(n, s, q) {

  override protected def updateAfterExpiration(): Unit = {
    increaseQuality()
  }

  override protected def updateExpiration(): Unit = {
    decreaseSellIn()
  }

  override protected def updateQuality(): Unit = {
    increaseQuality()
  }
}