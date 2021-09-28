package ex40;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import CustomUtils.Employee;
import CustomUtils.Input;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class AppTest
{
    @Test
    public void FilterTest() {
        App.InitEmployees();
        App.FilterBySearch("Jac");

        for (Map.Entry<String, Employee> entry : App.employees.entrySet()) {
            Employee value = entry.getValue();
            String fullName = value.firstName + " " + value.lastName;

            if (!fullName.contains("Jac"))
                assertTrue(App.employees.containsValue(value));
        }
    }
}