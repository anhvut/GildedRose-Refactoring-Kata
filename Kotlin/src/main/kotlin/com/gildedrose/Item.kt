package com.gildedrose

abstract class Item(open val name: String, open var sellIn: Int, open var quality: Int) {

    fun updateItem() {
        updateQuality()
        updateSellIn()
        if (isExpired()) {
            updateQualityWhenExpired()
        }
    }

    protected abstract fun updateQuality()

    protected abstract fun updateSellIn()

    protected abstract fun updateQualityWhenExpired()

    protected fun isExpired(): Boolean = this.sellIn < 0

    protected fun decreaseSellIn() {
        this.sellIn--
    }

    protected fun dropQuality() {
        this.quality = 0
    }

    protected fun decreaseQuality() {
        if (this.quality > 0) {
            this.quality--
        }
    }

    protected fun increaseQuality() {
        if (this.quality < 50) {
            this.quality++
        }
    }

    override fun toString(): String {
        return "Item(name=$name, sellIn=$sellIn, quality=$quality)"
    }

}