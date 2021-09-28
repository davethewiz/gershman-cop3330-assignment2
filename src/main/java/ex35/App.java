package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import CustomUtils.*;

public class App
{
    public static List<String> names = new ArrayList<>();

    public static void AddName(String name) {
        names.add(name);
    }

    public static void AddNameInput() {
        String inputName = Input.GetString("Enter a name: ");

        if (inputName == "") {
            DisplayWinner();
        }
        else {
            AddName(inputName);
            AddNameInput();
        }
    }

    public static String SelectRandomName() {
        Random rand = new Random();
        int index = rand.nextInt(names.size());

        return names.get(index);
    }

    public static void DisplayWinner() {
        System.out.println("The winner is... " + SelectRandomName() + ".");
    }

    public static void main( String[] args )
    {
        AddNameInput();
    }
}
