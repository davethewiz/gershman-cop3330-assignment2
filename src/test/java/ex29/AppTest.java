package ex29;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class AppTest
{
    @Test
    public void DoubleTimeTest() {
        assertTrue(1f == App.DoubleTime(72));
        assertTrue(0.5f == App.DoubleTime(144));
    }
}