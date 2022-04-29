package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

class AgedBrieUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        updateQuality(item);
    }

    private void updateQuality(Item item) {
        increaseQualityBy(item, 1);
        if (isExpired(item)) increaseQualityBy(item, 1);
    }
}
