package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void  main(String[] args) {
        System.out.println("There are Gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are Black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
