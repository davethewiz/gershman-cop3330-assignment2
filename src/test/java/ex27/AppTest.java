package ex27;

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
    public void ValidateNameTests() {
        assertEquals("The first name must be at least 2 characters long. \n", App.ValidateName("J", "first"));
        assertEquals("The last name must be at least 2 characters long. \n" +
                "The last name must be filled in. \n", App.ValidateName("", "last"));
        assertEquals("", App.ValidateName("John", "first"));
    }

    @Test
    public void ValidateZipCodeTests() {
        assertEquals("The zipcode must be a 5 digit number.\n", App.ValidateZipCode("ZIPPY"));
        assertEquals("The zipcode must be a 5 digit number.\n", App.ValidateZipCode(""));
        assertEquals("", App.ValidateZipCode("32826"));
    }

    @Test
    public void ValidateEmployeeIdTests() {
        assertEquals("", App.ValidateEmployeeID("AA-1234"));
        assertEquals("The employee ID must be in the format of AA-1234.\n", App.ValidateEmployeeID("Aa-1234"));
        assertEquals("The employee ID must be in the format of AA-1234.\n", App.ValidateEmployeeID("A12-43ab"));
        assertEquals("The employee ID must be in the format of AA-1234.\n", App.ValidateEmployeeID(""));
    }
}
