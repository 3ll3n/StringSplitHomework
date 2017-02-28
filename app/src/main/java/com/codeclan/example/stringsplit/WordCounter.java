package com.codeclan.example.stringsplit;

/**
 * Created by user on 27/02/2017.
 */

public class WordCounter {

    String[] words;

    public WordCounter() {

    }

    public int getCount(String input) {
//        returns an array
        words = input.split("[,\\s]+");
        return words.length;
    }
}
