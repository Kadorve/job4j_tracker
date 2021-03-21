package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book jackLondon = new Book("Martin Eden", 500);
        Book herbSchildt = new Book("Java. The complete reference.", 1500);
        Book josephU = new Book("Cortex - M3 core", 535);
        Book robMartin  = new Book("Clean code", 600);
        Book[] books = new Book[4];
        books[0] = jackLondon;
        books[1] = herbSchildt;
        books[2] = josephU;
        books[3] = robMartin;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPages());
        }
        System.out.println("\nChange position of books");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPages());
        }
        System.out.println("\nClean code name");
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if ("Clean code".equals(b.getName())) {
                System.out.println(index);
            }
        }
    }
}
