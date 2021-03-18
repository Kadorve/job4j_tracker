package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI extends Item {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = formatter.format(getCreated());
        System.out.println(currentDateTimeFormat);
    }
}
