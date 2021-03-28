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

    public Item[] findAll() {
        Item[] items1 = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            if (items1[index] != null) {
                items1[size++] = items1[index];
            }
        }
        return Arrays.copyOf(items1, size);
    }

    public Item[] findByName(String key) {
        Item[] items2 = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item it = this.items[index];
            if (key.equals(it.getName())) {
                items2[count++] = it;
            }
        }
        return Arrays.copyOf(items2, count);
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