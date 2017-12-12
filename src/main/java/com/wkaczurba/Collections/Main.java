package com.wkaczurba.Collections;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {

    private Main() {
        List<Element> bom = generateBom();

        printBom(bom);

        // Does BOM contain R 100 ohm?
        System.out.println("Is there a resistor 100?: " +
                bom.contains(new Element("Resistor", 100)));

        // Get unique elements only:
        Set<Element> unique = new HashSet<>(bom);
        System.out.println("Unique elements: " + unique);

        // Print Resistors only:
        System.out.println("Resistors only: " + unique);
        bom.stream()
           .filter(e -> e.getName().equals("Resistor"))
           .forEach(System.out::println);

        // Create a sorted set with TreeSet:
        Set<Element> sortedBom = new TreeSet<>(bom);
        System.out.println("Bom sorted by name, then by value: ");
        sortedBom.forEach(System.out::println);
    }

    public void printBom(List<Element> bom) {
        bom.forEach(System.out::println);
    }

    public List<Element> generateBom() {
        List<Element> bom = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            bom.add(new Element("Resistor", 100));
            bom.add(new Element("Capacitor", 22));
            bom.add(new Element("Inductor", 430));
        }
        bom.add(new Element("Resistor", 330));
        bom.add(new Element("Resistor", 1000));
        bom.add(new Element("Resistor", 110));
        bom.add(new Element("Resistor", 480));
        bom.add(new Element("Capacitor", 47));
        bom.add(new Element("Inductor", 680));
        bom.add(new Element("Inductor", 680));
        return bom;
    }

    public static void main(String[] args) {
        new Main();
    }
}
