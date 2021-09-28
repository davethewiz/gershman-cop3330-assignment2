package ex26;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class PaymentCalculatorTest
{
    @Test
    public void CalculateMonthsTilPaidOffTest()
    {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(12d / 365d / 100d, 5000,100));
    }
}
