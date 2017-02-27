package com.codeclan.example.stringsplit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class TestStringSplitter {

    @Test
    public void testCountWords() {
        StringSplitter splitter = new StringSplitter("Hello world");
        assertEquals(2, splitter.countWords());
    }
}
