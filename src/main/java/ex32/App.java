package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.*;

import java.util.Random;

public class App
{
    public static int currentNumber = 0;
    public static int guessCount = 0;

    public static void SetCurrentNumber(int difficulty) {
        int bound = 0;

        if (difficulty <= 1) bound = 10;
        if (difficulty == 2) bound = 100;
        if (difficulty >= 3) bound = 1000;

        Random rand = new Random();
        currentNumber = rand.nextInt(bound);
    }

    public static String GetGuessCountString() {
        return "You got it in " + guessCount + " guesses! \n";
    }

    public static void StartGame() {
        System.out.println("Lets play Guess the Number! \n");

        int difficulty = Input.GetInt("Enter the difficulty level (1, 2, or 3): ");

        SetCurrentNumber(difficulty);
        guessCount = 0;

        if (MakeGuess("I have my number. What's your guess? "))
            System.out.println(GetGuessCountString());

        String response = Input.GetString("Would you like to play again? (Y/N) ");
        if (response.equals("Y"))
            StartGame();
    }

    public static boolean MakeGuess(String message) {
        guessCount++;
        int guess = Input.GetInt(message);

        if (guess < currentNumber)
            return MakeGuess("Too Low! Guess again: ");
        else if (guess > currentNumber)
            return MakeGuess("Too high! Guess again: ");

        return true;
    }


    public static void main( String[] args )
    {
        StartGame();
    }
}
