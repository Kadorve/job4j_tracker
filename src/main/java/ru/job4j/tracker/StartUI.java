package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init (Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Add new item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                System.out.println(Arrays.toString(items)); //вывод выполнить в соответствии с примечанием 1.
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.println("Enter ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    //вывод об успешности операции
                } else {
                    //вывод об ошибке
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.println("=== Enter ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                tracker.delete(id);
                if (tracker.delete(id)) {
                    //вывод об успешной операции
                } else {
                    //вывод об ошибке
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID===");
                System.out.println("Enter ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                /* Валидировать результаты работы метода findById, т.к. метод может вернуть null.
                Если заявка не равна null, то печатаем в консоль заявку, иначе  - "Заявка не найдена."
                 */
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                /*Необходимо валидировать, т.к. метод может вернуть пустой массив.
                Если длина массива больше 0, то выводим массив в соответствии с примечанием 1, иначе - "Заявки с таким именем не найдены."
                 */

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by ID");
        System.out.println("5. Find items bu name");
        System.out.println("6. Exit program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
