package ex25;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class AppTest
{
    @Test
    public void PasswordValidatorTests()
    {
        assertEquals(1, App.passwordValidator("12345"));
        assertEquals(2, App.passwordValidator("abcdef"));
        assertEquals(3, App.passwordValidator("abc123xyz"));
        assertEquals(4, App.passwordValidator("1337h@xor!"));
    }

    @Test
    public void PasswordLevelStringTests()
    {
        assertEquals("very weak", App.getPasswordLevelString(-1000));
        assertEquals("very weak", App.getPasswordLevelString(1));
        assertEquals("weak", App.getPasswordLevelString(2));
        assertEquals("strong", App.getPasswordLevelString(3));
        assertEquals("very strong", App.getPasswordLevelString(4));
        assertEquals("very strong", App.getPasswordLevelString(1000));
    }
}
