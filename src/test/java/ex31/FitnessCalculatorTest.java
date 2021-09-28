package ex31;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class FitnessCalculatorTest
{
    @Test
    public void HeartRateCalculateTest()
    {
        FitnessCalculator calc = new FitnessCalculator(65, 22);

        assertEquals(138, calc.CalculateTargetHeartRate(55));
        assertEquals(165, calc.CalculateTargetHeartRate(75));
        assertEquals(191, calc.CalculateTargetHeartRate(95));
    }
}
