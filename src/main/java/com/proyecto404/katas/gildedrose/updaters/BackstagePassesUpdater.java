package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

class BackstagePassesUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        updateQuality(item);
        decreaseSellIn(item);
        if (isExpired(item)) item.setQuality(0);
    }

    private void updateQuality(Item item) {
        if (fiveDaysOrLessToConcert(item)) {
            increaseQualityBy(item, 3);
        }
        if (betweenFiveAndTenDaysToConcert(item)) {
            increaseQualityBy(item, 2);
        }
        if (moreThanTenDaysToConcert(item)) {
            increaseQualityBy(item, 1);
        }
    }

    private boolean fiveDaysOrLessToConcert(Item item) { return item.getSellIn() <= 5; }

    private boolean betweenFiveAndTenDaysToConcert(Item item) {
        return item.getSellIn() <= 10 && item.getSellIn() > 5;
    }

    private boolean moreThanTenDaysToConcert(Item item) { return item.getSellIn() > 10;}
}
