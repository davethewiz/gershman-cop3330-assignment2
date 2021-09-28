package ex32;

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
    public void RandomNumberTest() {
        App.SetCurrentNumber(2);
        assertTrue(App.currentNumber < 101 && App.currentNumber > 0);
    }

    @Test
    public void GuessCountTest() {
        App.guessCount = 10;
        assertEquals("You got it in 10 guesses! \n", App.GetGuessCountString());
    }
}