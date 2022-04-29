package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

class RegularItemUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        updateQuality(item);
    }

    private void updateQuality(Item item) {
        decreaseQuality(item);
        if (isExpired(item)) decreaseQuality(item);
    }

    private void decreaseQuality(Item item) {
        int newQuality = Math.max(item.getQuality() - 1, 0);
        item.setQuality(newQuality);
    }
}
