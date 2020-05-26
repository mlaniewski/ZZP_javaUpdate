package com.main.task1;

public class Task1 implements SimpleInterface {

    /*
        1. Utworz interfejs z prywatną metodą zwracającą List<Integer>
        oraz domyślną metodę void.
        2. W metodzie prywatnej stwórz kolekcję wypełnioną Integerami
        za pomocą Immutable Collections.
        3. W metodzie domyślnej przy pomocy stream() użytego na
        wyniku prywatnej metody pobierz oraz wypisz pierwszy dodatni
        element.
        4. Stwórz nową klasę implementujący interfejs i wywołaj metodę
        domyślną interfejsu.
     */

    public static void main(String[] args) {
        new Task1().getFirstPositiveNumberFromList();
    }
}
