package ex37;

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
    public void PasswordTest() {
        String password = App.GeneratePassword(8, 2, 2);

        assertTrue(password.length() >= 8);

        int numCount = 0;
        int specCount = 0;
        char[] passArr = password.toCharArray();
        for (char c : passArr) {
            if (App.specialCharacters.contains(Character.toString(c))) specCount++;
            if (Character.isDigit(c)) numCount++;
        }

        assertTrue(numCount == 2);
        assertTrue(specCount == 2);
    }
}