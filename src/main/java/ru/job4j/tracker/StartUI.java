package ru.job4j.tracker;

public class StartUI {

    public void init (Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Add new item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                for (Item current : items) {
                    System.out.println(current);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                int id = input.askInt("Enter ID: ");
                String name = input.askStr("Enter name: ");
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Заявка успешно заменена");
                } else {
                    System.out.println("Ошибка при замене заявки");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                int id = input.askInt("=== Enter ID: ");
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена");
                } else {
                    System.out.println("Заявка по указанному ID не найдена. Удаление невозможно.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID===");
                int id = input.askInt("Enter ID: ");
                Item newItem = tracker.findById(id);
                if (newItem != null) {
                    System.out.println(newItem);
                } else {
                    System.out.println("Заявка не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item current : items) {
                        System.out.println(current);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by ID");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
        System.out.println();
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}