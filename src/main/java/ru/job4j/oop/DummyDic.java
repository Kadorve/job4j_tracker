package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic engword = new DummyDic();
        String undefined = engword.engToRus("carrot");
        System.out.println(undefined);
    }
}
