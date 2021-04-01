package ru.job4j.oop.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +
                " - железнодорожный транспорт.");
    }

    @Override
    public void speed() {
        System.out.println(getClass().getSimpleName() +
                " может достигать скорости 200 км/ч.");
    }
}
