package ru.job4j.tracker;

public class StartUI {

    public static void addItem (Input input, Tracker tracker) {
        System.out.println("=== Add new item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem (Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item current : items) {
            System.out.println(current);
        }
    }

    public static void replaceItem (Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter ID: ");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Заявка успешно заменена");
        } else {
            System.out.println("Ошибка при замене заявки");
        }
    }

    public static void deleteItem (Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("=== Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка по указанному ID не найдена. Удаление невозможно.");
        }
    }

    public static void findIdItem (Input input, Tracker tracker) {
        System.out.println("=== Find item by ID===");
        int id = input.askInt("Enter ID: ");
        Item newItem = tracker.findById(id);
        if (newItem != null) {
            System.out.println(newItem);
        } else {
            System.out.println("Заявка не найдена.");
        }
    }

    public static void findNameItem (Input input, Tracker tracker) {
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
    }

    public void init (Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println();
        System.out.println("Menu");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ShowAction(), new ReplaceAction(),
                new DeleteAction(), new FindItemByIdAction(), new FindItemByNameAction(), new Exit()};
        /* Вызов нестатического метода. Необходимо обратиться через объект. */
        new StartUI().init(input, tracker, actions);
        /* Вызов статического метода. Обращаемся через класс. */
        //StartUI.addItem(input, tracker);
    }
}