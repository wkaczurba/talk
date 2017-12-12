package com.wkaczurba.Files;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Path dir = Paths.get(".");
        try {
            Stream<Path> paths = Files.list(dir);
            paths.forEach(System.out::println); // print all files.

        } catch (IOException e) {
            // Need to handle checked IOException when dealing with operations on files/HDD
            e.printStackTrace();
            throw e;
        }

    }
}
