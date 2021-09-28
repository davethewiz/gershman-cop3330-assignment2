package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App
{
    public static void main( String[] args )
    {
        Magic8Ball magic8Ball = new Magic8Ball(new String[]{"Yes", "No", "Maybe", "Ask Again Later"});
        magic8Ball.AskForQuestion();
    }
}
