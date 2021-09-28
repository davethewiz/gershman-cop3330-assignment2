package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.*;

public class App
{
    public static void main( String[] args )
    {
        int restingPulse = Input.GetInt("Resting Pulse: ");
        int age = Input.GetInt("Age: ");

        FitnessCalculator fitnessCalc = new FitnessCalculator(restingPulse, age);

        fitnessCalc.PrintHeartRateTable(55, 95, 5);
    }
}
