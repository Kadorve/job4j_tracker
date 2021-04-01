package ru.job4j.oop.poly;

public class TransportVehicle {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle kukuruznik = new Kukuruznik();
        Vehicle train = new Train();
        Vehicle teplovoz = new Teplovoz();
        Vehicle bus = new BusTransport();
        Vehicle ikarus = new Ikarus();

        Vehicle[] transport = new Vehicle[] {airplane, train, bus,
        kukuruznik, ikarus, teplovoz};
        for (int i = 0; i < transport.length; i++) {
            Vehicle tr = transport[i];
            tr.move();
            tr.speed();
            System.out.println();
        }
    }
}
