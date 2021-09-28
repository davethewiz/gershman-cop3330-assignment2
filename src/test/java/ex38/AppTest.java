package ex38;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class AppTest
{

    @Test
    public void EvenTest() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        List<Integer> evens = new ArrayList<>();
        evens.add(2);
        evens.add(4);
        evens.add(6);
        evens.add(8);

        assertEquals(evens, App.FilterEvenNumbers(numbers));
        assertEquals(" 2 4 6 8", App.GetNumberListString(evens));
    }
}