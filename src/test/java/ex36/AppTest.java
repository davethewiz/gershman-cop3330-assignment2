package ex36;

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
    public void StatsTest() {
        App.numbers.add(100);
        App.numbers.add(200);
        App.numbers.add(1000);
        App.numbers.add(300);

        assertEquals(400, App.CalculateAverage(), 0.0);
        assertEquals(1000, App.CalculateMax());
        assertEquals(100, App.CalculateMin());
        assertEquals(353.5533905932738, App.CalculateStd(), 0.0);
    }
}