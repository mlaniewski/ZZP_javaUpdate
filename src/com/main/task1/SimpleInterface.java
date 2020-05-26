package com.main.task1;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public interface SimpleInterface {

    private List<Integer> privateMethod() {
        return Arrays.asList(-2, -1, 0, 1, 2, 3, 4);
    }

    default void getFirstPositiveNumberFromList() {
        List<Integer> list = privateMethod();
        Optional<Integer> result = list.stream()
                .filter((el)-> el > 0)
                .findFirst();
        try {
            System.out.println(result.get());
        } catch (NoSuchElementException e) {
            System.out.println("The array does not contain any positive number.");
            e.printStackTrace();
        }
    }
}
