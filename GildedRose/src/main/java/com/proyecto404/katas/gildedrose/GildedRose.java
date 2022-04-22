package com.proyecto404.katas.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private static int MAX_QUALITY = 50;

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality(items);

        for (Item item : items) {
            System.out.println("Item: " + item.name + ",Quality: " + item.quality + ",SellIn: " + item.sellIn);
        }

    }

    public static void updateQuality(List<Item> items) {
        for (Item item: items) {
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) continue;
            if (item.name.equals("Aged Brie")) {
                item.setSellIn(item.getSellIn() - 1);
                increaseAgedBrieQuality(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() < MAX_QUALITY) increaseBackstagePassesQuality(item);
                item.setSellIn(item.getSellIn() - 1);
                if (item.getSellIn() < 0) { item.setQuality(0); }
            } else {
                item.setSellIn(item.getSellIn() - 1);
                decreaseRegularItemQuality(item);
            }
        }
    }

    private static void decreaseRegularItemQuality(Item item) {
        if (item.getQuality() > 0) item.setQuality(item.getQuality() - 1);
        if (item.getSellIn() < 0 && item.getQuality() > 0) item.setQuality(item.getQuality() - 1);
    }

    private static void increaseAgedBrieQuality(Item item) {
        if (item.getQuality() < MAX_QUALITY) item.setQuality(item.getQuality() + 1);
        if (item.getSellIn() < 0 && item.getQuality() < MAX_QUALITY) item.setQuality(item.getQuality() + 1);
    }

    private static void increaseBackstagePassesQuality(Item item) {
        item.setQuality(item.getQuality() + 1);
        if (item.getQuality() > MAX_QUALITY) return;
        if (item.getSellIn() < 11) item.setQuality(item.getQuality() + 1);
        if (item.getSellIn() < 6) item.setQuality(item.getQuality() + 1);
    }
}
