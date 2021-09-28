package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Arrays;
import CustomUtils.*;

public class App
{
    public static double DoubleTime(double rate) {
        return 72d / rate;
    }

    public static void main( String[] args )
    {
        double rate = Input.GetPositiveDouble("What is the rate of return? ");
        double doubleTime = DoubleTime(rate);

        System.out.printf("It will take %.0f years to double your initial investment.", doubleTime);
    }
}
