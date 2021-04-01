package ru.job4j.oop.poly;

public class Teplovoz implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " тянет за собой множество вагонов.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " движется медленно.");
    }
}
