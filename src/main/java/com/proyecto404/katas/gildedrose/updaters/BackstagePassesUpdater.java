package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

class BackstagePassesUpdater extends ProductUpdater {
    @Override
    public void update(Item item) {
        updateQuality(item);
        decreaseSellIn(item);
        if (isExpired(item)) item.setQuality(0);
    }

    private void updateQuality(Item item) {
        increaseQuality(item);
        if (tenDaysOrLessToConcert(item)) increaseQuality(item);
        if (fiveDaysOrLessToConcert(item)) increaseQuality(item);
    }

    private boolean fiveDaysOrLessToConcert(Item item) {
        return item.getSellIn() <= 5;
    }

    private boolean tenDaysOrLessToConcert(Item item) {
        return item.getSellIn() <= 10;
    }
}
