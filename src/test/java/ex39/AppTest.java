package ex39;

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
    public void SortedTest() {
        App.InitEmployees();
        App.SortByLastName();

        String[] sortedNames = new String[]{"Jackson", "Jacobson", "Johnson", "Michaelson","Weber","Xiong"};
        String[] sortedNamesFromApp = App.employees.keySet().toArray(new String[0]);


        assertTrue(sortedNames[0] == sortedNamesFromApp[0]);
        assertTrue(sortedNames[1] == sortedNamesFromApp[1]);
        assertTrue(sortedNames[2] == sortedNamesFromApp[2]);
        assertTrue(sortedNames[3] == sortedNamesFromApp[3]);
    }
}