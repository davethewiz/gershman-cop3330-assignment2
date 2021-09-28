package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import CustomUtils.*;

public class App
{
    public static ArrayList<Integer> GetNumberList(int n) {
        ArrayList numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(Input.GetInt("Enter a number: "));
        }

        return numList;
    }

    public static int SumNumbers(ArrayList<Integer> nums) {
        int total = 0;

        for (int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }

        return total;
    }

    public static void main( String[] args )
    {
        ArrayList<Integer> nums = GetNumberList(5);
        int total = SumNumbers(nums);

        System.out.println("The total is " + total + ".");
    }
}
