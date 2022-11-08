package com.java8.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[5] = "Kumar";
        Optional<String> nullCheck = Optional.ofNullable(words[5]);
        if(nullCheck.isPresent()){
            System.out.println(nullCheck.get());
        }else {
            System.out.println("Value not present.");
        }
    }
}
