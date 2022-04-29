package com.proyecto404.katas.gildedrose.updaters;

import com.proyecto404.katas.gildedrose.Item;

public abstract class ItemUpdater {
    protected final int MAX_QUALITY = 50;

    public abstract void update(Item item);

    protected boolean isExpired(Item item) { return item.getSellIn() < 0;}

    protected void decreaseSellIn(Item item) { item.setSellIn(item.getSellIn() - 1); }

    protected void increaseQualityBy(Item item, int amount) {
        item.setQuality(Math.min(item.getQuality() + amount, MAX_QUALITY));
    }
}
