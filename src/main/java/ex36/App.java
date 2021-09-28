package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.Input;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static List<Integer> numbers = new ArrayList<>();

    public static void AddNumberInput() {
        String input = Input.GetString("Enter a number: ");

        if (input.equals("done")) {
            DisplayStats();
        }
        else {
            try {
                numbers.add(Integer.parseInt(input));
            }
            catch (NumberFormatException e) {
                System.out.println("Input was not an integer, try again.");
            }
            AddNumberInput();
        }
    }

    public static int CalculateMin() {
        int min = 1000000000;
        for (int i : numbers) {
            if (i < min)
                min = i;
        }

        return min;
    }

    public static int CalculateMax() {
        int max = -1000000000;
        for (int i : numbers) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public static double CalculateAverage() {
        int total = 0;
        for (int i : numbers) {
            total += i;
        }

        return (double) total / (double)numbers.size();
    }

    public static double CalculateStd() {
        double average = CalculateAverage();

        double diff = 0;
        for (int i : numbers) {
            diff += Math.pow(i - average, 2);
        }

        return Math.sqrt(diff / (double)numbers.size());
    }

    public static void DisplayStats() {
        System.out.print("Numbers:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(" " + numbers.get(i));

            if (i < numbers.size() - 1) {
                System.out.print(",");
            }
        }

        System.out.println();
        System.out.println("The average is " + CalculateAverage());
        System.out.println("The minimum is " + CalculateMin());
        System.out.println("The maximum is " + CalculateMax());
        System.out.println("The standard deviation is " + CalculateStd());
    }

    public static void main( String[] args )
    {
        AddNumberInput();
    }
}
