package com.proyecto404.katas.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static com.proyecto404.katas.gildedrose.GildedRose.updateQuality;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GildedRoseTests {
    @ParameterizedTest
    @CsvSource({"10, 20, 9, 19"})
    public void regular_item(Integer sellIn, Integer quality, Integer expectedSellIn, Integer expectedQuality) {
        Item item = new Item("+5 Dexterity Vest", sellIn, quality);
        List<Item> items = new ArrayList<>();
        items.add(item);

        updateQuality(items);

        assertThat(item.quality).isEqualTo(expectedQuality);
        assertThat(item.sellIn).isEqualTo(expectedSellIn);
    }

    @Test
    public void general_output() {
        List<Item> items = new ArrayList<>();

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        for (int i = 0; i < 30; i++) {
            updateQuality(items);

            for (Item item : items) {
                output += "Item: " + item.name + ",Quality: " + item.quality + ",SellIn: " + item.sellIn + "\n";
            }
        }

        assertThat(output).isEqualTo(expectedOutput);
    }

    private String output = "";
    private String expectedOutput = "Item: +5 Dexterity Vest,Quality: 19,SellIn: 9\n" +
            "Item: Aged Brie,Quality: 1,SellIn: 1\n" +
            "Item: Elixir of the Mongoose,Quality: 6,SellIn: 4\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 21,SellIn: 14\n" +
            "Item: Conjured Mana Cake,Quality: 5,SellIn: 2\n" +
            "Item: +5 Dexterity Vest,Quality: 18,SellIn: 8\n" +
            "Item: Aged Brie,Quality: 2,SellIn: 0\n" +
            "Item: Elixir of the Mongoose,Quality: 5,SellIn: 3\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 22,SellIn: 13\n" +
            "Item: Conjured Mana Cake,Quality: 4,SellIn: 1\n" +
            "Item: +5 Dexterity Vest,Quality: 17,SellIn: 7\n" +
            "Item: Aged Brie,Quality: 4,SellIn: -1\n" +
            "Item: Elixir of the Mongoose,Quality: 4,SellIn: 2\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 23,SellIn: 12\n" +
            "Item: Conjured Mana Cake,Quality: 3,SellIn: 0\n" +
            "Item: +5 Dexterity Vest,Quality: 16,SellIn: 6\n" +
            "Item: Aged Brie,Quality: 6,SellIn: -2\n" +
            "Item: Elixir of the Mongoose,Quality: 3,SellIn: 1\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 24,SellIn: 11\n" +
            "Item: Conjured Mana Cake,Quality: 1,SellIn: -1\n" +
            "Item: +5 Dexterity Vest,Quality: 15,SellIn: 5\n" +
            "Item: Aged Brie,Quality: 8,SellIn: -3\n" +
            "Item: Elixir of the Mongoose,Quality: 2,SellIn: 0\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 25,SellIn: 10\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -2\n" +
            "Item: +5 Dexterity Vest,Quality: 14,SellIn: 4\n" +
            "Item: Aged Brie,Quality: 10,SellIn: -4\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -1\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 27,SellIn: 9\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -3\n" +
            "Item: +5 Dexterity Vest,Quality: 13,SellIn: 3\n" +
            "Item: Aged Brie,Quality: 12,SellIn: -5\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -2\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 29,SellIn: 8\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -4\n" +
            "Item: +5 Dexterity Vest,Quality: 12,SellIn: 2\n" +
            "Item: Aged Brie,Quality: 14,SellIn: -6\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -3\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 31,SellIn: 7\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -5\n" +
            "Item: +5 Dexterity Vest,Quality: 11,SellIn: 1\n" +
            "Item: Aged Brie,Quality: 16,SellIn: -7\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -4\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 33,SellIn: 6\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -6\n" +
            "Item: +5 Dexterity Vest,Quality: 10,SellIn: 0\n" +
            "Item: Aged Brie,Quality: 18,SellIn: -8\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -5\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 35,SellIn: 5\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -7\n" +
            "Item: +5 Dexterity Vest,Quality: 8,SellIn: -1\n" +
            "Item: Aged Brie,Quality: 20,SellIn: -9\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -6\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 38,SellIn: 4\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -8\n" +
            "Item: +5 Dexterity Vest,Quality: 6,SellIn: -2\n" +
            "Item: Aged Brie,Quality: 22,SellIn: -10\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -7\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 41,SellIn: 3\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -9\n" +
            "Item: +5 Dexterity Vest,Quality: 4,SellIn: -3\n" +
            "Item: Aged Brie,Quality: 24,SellIn: -11\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -8\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 44,SellIn: 2\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -10\n" +
            "Item: +5 Dexterity Vest,Quality: 2,SellIn: -4\n" +
            "Item: Aged Brie,Quality: 26,SellIn: -12\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -9\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 47,SellIn: 1\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -11\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -5\n" +
            "Item: Aged Brie,Quality: 28,SellIn: -13\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -10\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 50,SellIn: 0\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -12\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -6\n" +
            "Item: Aged Brie,Quality: 30,SellIn: -14\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -11\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -1\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -13\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -7\n" +
            "Item: Aged Brie,Quality: 32,SellIn: -15\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -12\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -2\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -14\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -8\n" +
            "Item: Aged Brie,Quality: 34,SellIn: -16\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -13\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -3\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -15\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -9\n" +
            "Item: Aged Brie,Quality: 36,SellIn: -17\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -14\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -4\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -16\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -10\n" +
            "Item: Aged Brie,Quality: 38,SellIn: -18\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -15\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -5\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -17\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -11\n" +
            "Item: Aged Brie,Quality: 40,SellIn: -19\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -16\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -6\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -18\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -12\n" +
            "Item: Aged Brie,Quality: 42,SellIn: -20\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -17\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -7\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -19\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -13\n" +
            "Item: Aged Brie,Quality: 44,SellIn: -21\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -18\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -8\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -20\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -14\n" +
            "Item: Aged Brie,Quality: 46,SellIn: -22\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -19\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -9\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -21\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -15\n" +
            "Item: Aged Brie,Quality: 48,SellIn: -23\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -20\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -10\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -22\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -16\n" +
            "Item: Aged Brie,Quality: 50,SellIn: -24\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -21\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -11\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -23\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -17\n" +
            "Item: Aged Brie,Quality: 50,SellIn: -25\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -22\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -12\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -24\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -18\n" +
            "Item: Aged Brie,Quality: 50,SellIn: -26\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -23\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -13\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -25\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -19\n" +
            "Item: Aged Brie,Quality: 50,SellIn: -27\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -24\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -14\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -26\n" +
            "Item: +5 Dexterity Vest,Quality: 0,SellIn: -20\n" +
            "Item: Aged Brie,Quality: 50,SellIn: -28\n" +
            "Item: Elixir of the Mongoose,Quality: 0,SellIn: -25\n" +
            "Item: Sulfuras, Hand of Ragnaros,Quality: 80,SellIn: 0\n" +
            "Item: Backstage passes to a TAFKAL80ETC concert,Quality: 0,SellIn: -15\n" +
            "Item: Conjured Mana Cake,Quality: 0,SellIn: -27\n";
}
