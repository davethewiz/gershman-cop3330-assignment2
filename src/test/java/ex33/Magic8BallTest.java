package ex33;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class Magic8BallTest
{
    @Test
    public void RandomizerTest()
    {
        Magic8Ball magic8Ball = new Magic8Ball(new String[] {"No", "Yes", "Maybe", "Ask Again Later."});
        assertTrue(Arrays.binarySearch(magic8Ball.responses, magic8Ball.GetRandomResponse()) != -1);
    }
}
