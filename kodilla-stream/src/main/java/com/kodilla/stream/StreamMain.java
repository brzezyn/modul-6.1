package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("This should be uppercased.", text -> text.toUpperCase());
        poemBeautifier.beautify("This should be in \"ABC\" braces.", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("While this should be underlined and yellow.", text ->"\033[4;33m" + text + "\033[0m");
        poemBeautifier.beautify("This should be simply written in cyan.", text -> "\033[0;36m" + text + "\033[0m");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
