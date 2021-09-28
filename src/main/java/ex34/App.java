package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 *
 * John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin
 */

import CustomUtils.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static List<String> names = new ArrayList<>();

    public static void PrintNames() {
        System.out.println("\nThere are " + names.size() + " employees: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    public static void RemoveName(String name) {
        names.remove(name);
    }

    public static String InputRemove() {
        String nameToRemove = Input.GetString(" \nEnter an employee name to remove: ");

        if (names.contains(nameToRemove)) {
            RemoveName(nameToRemove);
            return nameToRemove;
        }
        else {
            System.out.println("Name not found, try again.");
            return InputRemove();
        }
    }

    public static void main( String[] args )
    {
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        PrintNames();
        InputRemove();
        PrintNames();
    }
}
