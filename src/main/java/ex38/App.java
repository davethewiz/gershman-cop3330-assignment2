package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.Input;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static List<Integer> GetIntegerInput() {
        List<Integer> numbers = new ArrayList<>();

        String numbersString = Input.GetString("Enter a list of numbers, separated by spaces: ");

        for (String s : numbersString.split(" ")) {
            numbers.add(Integer.parseInt(s));
        }

        return numbers;
    }

    public static List<Integer> FilterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNums = new ArrayList<>();

        for (int i : numbers) {
            if (i % 2 == 0)
                evenNums.add(i);
        }

        return evenNums;
    }

    public static String GetNumberListString(List<Integer> numbers) {
        String s = "";

        for (int i : numbers) {
            s += " " + i;
        }

        return s;
    }

    public static void main( String[] args )
    {
        List<Integer> numbers = GetIntegerInput();
        List<Integer> evenNums = FilterEvenNumbers(numbers);

        System.out.println("The even numbers are" + GetNumberListString(evenNums) + ".");
    }
}
