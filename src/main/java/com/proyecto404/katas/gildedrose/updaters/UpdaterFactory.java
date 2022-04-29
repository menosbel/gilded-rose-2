package com.proyecto404.katas.gildedrose.updaters;

public class UpdaterFactory {
    public ProductUpdater create(String itemName) {
        switch (itemName) {
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasUpdater();
            case "Aged Brie":
                return new AgedBrieUpdater();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesUpdater();
            default:
                return new RegularItemUpdater();
        }
    }
}
