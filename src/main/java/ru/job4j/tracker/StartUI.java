package ru.job4j.tracker;

public class StartUI extends Item {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("1");
        item.setId(1);
        tracker.add(item);
        System.out.println(item);
    }
}
