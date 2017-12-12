package com.wkaczurba.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    /**
     * Public constructor
     */
    public Main() {

        arithmeticException();

        try {
            canThrowCheckedException();
        } catch (IOException e) {
            System.out.println(" -- In Main: Function canThrowCheckedException threw a Checked Exception: " + e + "\n");
        }

        canThrowAndCatchCheckedException();

        try {
            tryWithResources();
        } catch (IOException e) {
            System.out.println(" -- In Main: Funciton tryWithResources threw a Checked Exception " + e + "\n");
        }
    }

    /**
     * Example of catching unchecked exception;
     */
    private void arithmeticException() {
        int value = 5;
        int divider = 5;
        System.out.println("In: arithmeticException()");
        try {
            for (divider = 5; divider > -5; divider--) {
                System.out.format("Trying -> divison %d / %d -> gets: ", value, divider);
                System.out.println(value / divider);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + "; Details: " + e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("The loop has finished. If no exception - the divider value should be -5;");
            System.out.println("Currently it is: " + divider + "\n");
        }
    }

    /**
     * Tries to read nonexisting file.
     * The funciton does not handle IOException;
     * @throws IOException
     */
    private void canThrowCheckedException() throws IOException {
        System.out.println("In: canThrowCheckedException()");
        Files.readAllLines(Paths.get("z:", "onexisting file"));
    }

    /**
     * Tries to read nonexisting file.
     * The funciton does not handle IOException;
     * @throws IOException
     */
    private void canThrowAndCatchCheckedException() {
        System.out.println("In: canThrowAndCatchCheckedException()");
        try {
            Files.readAllLines(Paths.get("z:", "onexisting file"));
        } catch (IOException e) {
            System.out.println("Threw exception: " + e.getClass() + " : " + e.getMessage());
        }
    }

    /**
     * Try with resources;
     */
    private void tryWithResources() throws IOException {
        System.out.println("tryWithResources()");
        try (BufferedReader br = Files.newBufferedReader(Paths.get(""))) {
            //
            br.read();
        } finally {
            System.out.println("tryWithResources - Finishing");
        }
    }


    /**
     * Main
     * @param args are unused.
     */
    public static void main(String[] args) {
        new Main();
    }
}
