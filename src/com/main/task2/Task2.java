package com.main.task2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {

    /*
        1. Stwórz kolekcję wypełnioną Integerami z użyciem var.
        2. Na jej podstawię utwórz niemodyfikowalną kolekcję.
        3. Przy pomocy stream() pobierz dodatnie elementy.
        4. Spróbuj dodać element do nowej kolekcji.
     */


    public static void main(String[] args) {
        var list = Arrays.asList(-2, -1, 0, 1, 2, 3, 4);
        System.out.println(list);

        var unModifiableList = list.stream()
                .filter((el) -> el > 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(unModifiableList);


        unModifiableList.add(5);

    }
}
