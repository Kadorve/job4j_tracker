package ru.job4j.oop.poly;

public class Ikarus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " - гармошка.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " может достигать скорости.");
    }
}
