package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

class AgedBrieUpdater extends ProductUpdater {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        updateQuality(item);
    }

    private void updateQuality(Item item) {
        increaseQuality(item);
        if (isExpired(item)) increaseQuality(item);
    }
}
