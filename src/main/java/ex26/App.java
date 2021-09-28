package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Arrays;
import CustomUtils.*;

public class App
{
    //What is your balance? 5000
    //What is the APR on the card (as a percent)? 12
    //What is the monthly payment you can make? 100
    //It will take you 70 months to pay off this card.

    public static void main( String[] args )
    {
        double balance = Input.GetDouble("What is your balance? ");
        double APR = Input.GetDouble("What is your APR on the card (as a percent)? ");
        double dailyRate = APR / 365d / 100d;

        double monthlyPayment = Input.GetDouble("What is your monthly payment on the card? ");

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(dailyRate, balance, monthlyPayment);

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
