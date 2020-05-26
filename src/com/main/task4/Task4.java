package com.main.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Task4 {

    /*
        Stwórz dwa pliki wypełnione teksem i porównaj je za pomocą
        metody Files.mismatch(path,path):
        1. Przypadek gdy pliki powinny identyczne
        2. Przypadek gdy pliki mają różną zawartość
        następnie wypisz ich tekst przy pomocy Files.readString(path);.
     */


    public static void main(String[] args) throws IOException {
        final var text = "Same text";
        final var file1 = "file1";
        final var file2 = "file2";
        Path path1 = Files.writeString(Files.createTempFile(file1, ".txt"), text);
        Path path2 = Files.writeString(Files.createTempFile(file2, ".txt"), text);

        System.out.println(Files.mismatch(path1, path2));
        System.out.println(file1 + ": " + Files.readString(path1));
        System.out.println(file2 + ": " + Files.readString(path2));

        Files.writeString(path2, "new text", StandardOpenOption.APPEND);

        System.out.println(Files.mismatch(path1, path2));
        System.out.println(file1 + ": " + Files.readString(path1));
        System.out.println(file2 + ": " + Files.readString(path2));


    }
}
