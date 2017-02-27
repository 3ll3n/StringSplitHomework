package com.codeclan.example.stringsplit;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitter {

    private String input;

    public StringSplitter(String input) {
        this.input = input;
    }

    public int countWords() {
        String[] words = input.split(" ");
        int counter = 0;
        for (String s : words) {
            counter ++;
        }
        return counter;
    }
}
