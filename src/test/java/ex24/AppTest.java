package ex24;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class AppTest 
{
    @Test
    public void SortTests()
    {
        assertEquals("adev", App.SortString("dave"));
        assertEquals("abcdefghijk", App.SortString("kjihgfedcba"));
        assertEquals("belu", App.SortString("blue"));
    }

    @Test
    public void IsAnagramTest()
    {
        assertTrue(App.isAnagram("dave", "evad"));
        assertTrue(App.isAnagram("tone", "note"));
        assertFalse(App.isAnagram("toney", "note"));
        assertFalse(App.isAnagram("racecar", "racekar"));
    }
}
