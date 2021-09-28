package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.Input;

import java.util.Random;

public class App
{
    public static String specialCharacters = "~`!@#$%^&*()-_+={}[]|\\/:;\"'<>,.?";
    public static String letters = "abcdefghijklmnopqrstuvwxyz";

    public static String GeneratePassword(int minLength, int numCount, int specCount) {
        int length = minLength + new Random().nextInt(10);

        if (length < numCount + specCount) {
            length = (numCount + specCount) * 2;
        }

        int letterCount = length - numCount - specCount;

        String password = "";

        for (int i = 0; i < numCount; i++) {
            password += new Random().nextInt(10);
        }

        for (int j = 0; j < specCount; j++) {
            password += specialCharacters.toCharArray()[new Random().nextInt(specialCharacters.length())];
        }

        for (int k = 0; k < letterCount; k++) {
            password += letters.toCharArray()[new Random().nextInt(letters.length())];
        }

        return password;
    }

    public static void main( String[] args )
    {
        int minLength = Input.GetInt("What's the minimum length? ");
        int specCount = Input.GetInt("How many special characters? ");
        int numCount = Input.GetInt("How many numbers? ");

        String password = GeneratePassword(minLength, specCount, numCount);

        System.out.println("Your password is " + password);
    }
}
