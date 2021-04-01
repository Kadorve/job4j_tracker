package ru.job4j.oop.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " - воздушный транспорт.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " может достигать скорости 1000 км/ч.");
    }
}
