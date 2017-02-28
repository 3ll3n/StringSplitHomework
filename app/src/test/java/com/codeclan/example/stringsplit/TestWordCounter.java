package com.codeclan.example.stringsplit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class TestWordCounter{

    WordCounter counter;

    @Before
    public void before() {
        counter = new WordCounter();
    }

    @Test
    public void testCountWords() {
        assertEquals(2, counter.getCount("Sake man"));
    }
}
