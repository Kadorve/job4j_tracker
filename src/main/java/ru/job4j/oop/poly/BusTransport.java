package ru.job4j.oop.poly;

public class BusTransport implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " - колёсный транспорт, предназначенный для скоростных трасс.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " может достигать скорости 100 км/ч.");
    }
}
