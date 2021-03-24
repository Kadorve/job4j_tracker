package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                '}';
    }

    private int id;
    private static String name;
    //private final LocalDateTime created = LocalDateTime.now();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    /*public static LocalDateTime getCreated() {
        return LocalDateTime.now();
    }*/

}