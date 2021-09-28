package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Arrays;
import CustomUtils.*;

public class App
{
    public static String SortString(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        return new String(inputArray);
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        str1 = SortString(str1);
        str2 = SortString(str2);

        return str1.equals(str2);
    }

    public static void main( String[] args )
    {
        System.out.println("Enter two strings and I'll tell you if the are anagrams: ");
        String word1 = Input.GetString("Enter the first string: ");
        String word2 = Input.GetString("Enter the second string: ");

        String isNot = "";

        if (!isAnagram(word1, word2))
            isNot = "not ";

        System.out.printf("\"%s\" and \"%s\" are %sanagrams", word1, word2, isNot);
    }
}
