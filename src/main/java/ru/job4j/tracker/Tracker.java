package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(Item item) {
        Item[] itemsWithoutNull = new Item[items.length];
        int sizeNotNull = 0;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                itemsWithoutNull[sizeNotNull++] = items[index];
            }
        }
        return Arrays.copyOf(itemsWithoutNull, sizeNotNull);
    }

    public Item[] findByName(String key) {
        Item[] itemsEqualsKey = new Item[size];
        int equalsSize = 0;
        for (int index = 0; index < size; index++) {
            Item it = this.items[index];
            if (key.equals(it.getName())) {
                itemsEqualsKey[equalsSize++] = it;
            }
        }
        return Arrays.copyOf(itemsEqualsKey, equalsSize);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}