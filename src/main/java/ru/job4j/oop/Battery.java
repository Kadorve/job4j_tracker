package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstPart = new Battery(75);
        Battery secondPart = new Battery(25);
        secondPart.exchange(firstPart);
        System.out.println("First part of charge: " + firstPart.load + ". Second part of charge: " + secondPart.load);
    }
}
