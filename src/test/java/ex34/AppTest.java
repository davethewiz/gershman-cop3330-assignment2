package ex34;

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
    public void RemovalTest() {
        App.names.add("John Smith");
        App.names.add("Jackie Jackson");
        App.names.add("Chris Jones");
        App.names.add("Amanda Cullen");
        App.names.add("Jeremy Goodwin");

        App.RemoveName("John Smith");
        assertFalse(App.names.contains("John Smith"));
    }
}