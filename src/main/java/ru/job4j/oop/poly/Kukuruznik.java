package ru.job4j.oop.poly;

public class Kukuruznik implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " летает на небольшой высоте.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " имеет невысокую скорость полёта.");
    }
}
