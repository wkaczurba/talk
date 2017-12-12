package com.wkaczurba.Variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String assigned = "someString";
        String fromArgsInput; // this variable will be taken from input args.

        int primitiveInt = 10;
        Integer boxedInteger = 20; // this is an object;

        long primitiveLong = 1L;
        Long boxedLong = 217L; // this is an object;

        byte aByte = 117; // Invalid
        // byte anotherByte = 196; // Invalid. byte is a signed value (-128...127);
        byte yetAnotherByte = -32;
        float aFloat = -8.23f; // need to add "f";
        // float anohterFloat = -8.0; // fails, -8.0 is a "double" (64-bit). -8.0f is float(32bit)
        double aDouble = -8.9E3;
        // There is also "Boxed" Byte, Float, Double.

        char aChar = 33213; // char is 16-bit; (because of UTF-8);
        Character boxedCharacter = 32213;
        char anotherChar = 'a';

        String stringWithUnicode = "Something with unicode \u0320";

        // Taking input from String:
        if (args.length > 0) { // if there is something on the input...
            fromArgsInput = args[0]; // take the first element
        } else {
            fromArgsInput = "<nothing on the input>";
        }

        // Lets print...
        System.out.println("Now taking a String from the StdIn:");
        Scanner scanner = new Scanner(System.in); // assigning scanner for the input;
        String stringFromInput = scanner.next(); // take in next string.

        // Lets print
        System.out.println("Now we will build a string and print everything...");

        // Combine string using String Builder (more code!);
        StringBuilder sb = new StringBuilder();
        sb.append("String assigned = ").append(assigned).append(System.lineSeparator())
          .append("String fromArgsInput = ").append(fromArgsInput).append(System.lineSeparator())
          .append("int primitiveInt = ").append(primitiveInt).append(System.lineSeparator())
          .append("Integer boxedInteger = ").append(boxedInteger).append(System.lineSeparator());

        sb.append("long primitiveLong = ").append(primitiveLong).append(System.lineSeparator())
          .append("Long boxedLong = ").append(boxedLong).append(System.lineSeparator())
          .append("byte yetAnotherByte = -32").append(yetAnotherByte).append(System.lineSeparator());

        sb.append("float aFloat = ").append(aFloat).append(System.lineSeparator())
          .append("double aDouble = ").append(aDouble).append(System.lineSeparator())
          .append("char aChar = ").append(aChar).append(System.lineSeparator())
          .append("Character boxedCharacter = ").append(boxedCharacter).append(System.lineSeparator())
          .append("char anotherChar = ").append(anotherChar).append(System.lineSeparator())
          .append("String stringWithUnicode = ").append(stringWithUnicode).append(System.lineSeparator());

        sb.append("float aFloat = -8.23f").append(aFloat).append(System.lineSeparator())
          .append("String fromArgsInput = ").append(fromArgsInput).append(System.lineSeparator())
          .append("String stringFromInput = ").append(stringFromInput).append(System.lineSeparator());

        System.out.println(sb.toString());

        // Or w/o simplier:
        System.out.format("String assigned = %s\n" +
                "String fromArgsInput = %s\n" +
                "int primitiveInt = %d\n" +
                "Integer boxedInteger = %d\n" +
                "long primitiveLong = %d\n" +
                "Long boxedLong = %d\n" +
                "byte yetAnotherByte = %d\n" +
                "float aFloat = %f\n" +
                "float aDouble = %f\n" +
                "char aChar = %c\n" +
                "Character boxedCharacter = %c\n" +
                "char anotherChar = %c\n" +
                "String stringWithUnicode = %s\n" +
                "float aFloat = %f\n" +
                "String fromArgsInput = %s\n" +
                "String stringFromInput = %s\n",
                assigned,
                fromArgsInput,
                primitiveInt,
                boxedInteger,
                primitiveLong,
                boxedLong,
                yetAnotherByte,
                aFloat,
                aDouble,
                aChar,
                boxedCharacter,
                anotherChar,
                stringWithUnicode,
                aFloat,
                fromArgsInput,
                stringFromInput);
    }
}
