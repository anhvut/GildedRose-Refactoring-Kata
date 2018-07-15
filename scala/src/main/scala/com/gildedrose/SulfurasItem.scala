package com.gildedrose

class SulfurasItem(val n: String, val s: Int, val q: Int) extends Item(n, s, q) {

  override protected def updateAfterExpiration(): Unit = {
  }

  override protected def updateExpiration(): Unit = {
  }

  override protected def updateQuality(): Unit = {
  }
}