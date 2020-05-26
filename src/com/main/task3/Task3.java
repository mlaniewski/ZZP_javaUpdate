package com.main.task3;

public class Task3 {

    /*
        Sprawdz uzycie metod na określonych przypadkach:
        „ ”.isBlank();
        „ ”.isEmpty();
        „AB\nAB\nAB”.lines();
        „ DB ”.strip();
        „ DB ”.stripLeading();
        „ DB ”.stripTrailing();
        „==”.repeat(5);
     */

    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

        "AB\nAB\nAB".lines()
                .forEach(System.out::println);

        System.out.println(" DB ".strip());
        System.out.println(" DB ".stripLeading());
        System.out.println(" DB ".stripTrailing());

        System.out.println("==".repeat(5));
    }
}
