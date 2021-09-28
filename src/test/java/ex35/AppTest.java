package ex35;

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
    public void RandomSelectTest() {
        assertTrue(App.names.contains(App.SelectRandomName()));
    }

    @Test
    public void AddNameTest() {
        String nameToAdd = "Dave Gershman";
        App.AddName(nameToAdd);
        assertTrue(App.names.contains(nameToAdd));
    }
}