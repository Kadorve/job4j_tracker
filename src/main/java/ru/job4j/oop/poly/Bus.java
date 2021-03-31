package ru.job4j.oop.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Поездка возможна только при заправленном бензобаке");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Количество пассажиров равно " + amount);
    }

    @Override
    public int fill(int fuel) {
        int passengers = 5;
        int cost = 0;
        if (fuel > 0) {
            cost = fuel / passengers;
        }
        return cost;
    }
}
