package com.wkaczurba.CollectionsSimple;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(19, 2, 3, 5, 10, 11, 12));

        // Print only odd values:
        list.stream().filter(i -> i % 2 == 1).forEach(System.out::println);

        // Map into letters (0 for 'a', 1 for 'b' etc.):
        list.stream().map(i -> 'a' + i).forEach(System.out::println);

        // Sort:
        list.stream().sorted().forEach(System.out::println);

        // Count dividable by 5
        long count = list.stream().filter(i -> i % 5 == 0).count();

        // Map Hash...
        Map<String, Integer> keys = new HashMap<>();
        keys.put("abc", 123);
        keys.put("ghi", 493);
        keys.put("zzz", 999);

        // Print entries only:
        keys.keySet().forEach(System.out::println);
    }
}
