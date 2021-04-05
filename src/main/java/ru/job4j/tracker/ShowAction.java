package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return  "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item current : items) {
            System.out.println(current);
        }
        return true;
    }
}
