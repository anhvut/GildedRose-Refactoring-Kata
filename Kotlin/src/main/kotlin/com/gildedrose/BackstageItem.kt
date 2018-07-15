package com.gildedrose

class BackstageItem(override val name: String, override var sellIn: Int, override var quality: Int) : Item(name, sellIn, quality) {

    override fun updateQuality() {
        increaseQuality()
        if (this.sellIn < 11) {
            increaseQuality()
        }

        if (this.sellIn < 6) {
            increaseQuality()
        }
    }

    override fun updateSellIn() {
        decreaseSellIn()
    }

    override fun updateQualityWhenExpired() {
        dropQuality()
    }
}