package ru.job4j.tracker;

public class FindItemByIdAction implements  UserAction {
    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by ID===");
        int id = input.askInt("Enter ID: ");
        Item newItem = tracker.findById(id);
        if (newItem != null) {
            System.out.println(newItem);
        } else {
            System.out.println("Заявка не найдена.");
        }
        return true;
    }
}
