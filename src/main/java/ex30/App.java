package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Arrays;
import CustomUtils.*;

public class App
{
    public static String GetRowString(int multiple) {
        String rowString = "";

        for (int x = 1; x <= 12; x++) {
            int mult = multiple * x;

            if (mult < 10)
                rowString += "  ";
            else if (mult < 100)
                rowString += " ";

            rowString += mult;
            rowString += " ";
        }

        return rowString;
    }

    public static String GetMultiplicationTableString() {
        String table = "";

        for (int y = 1; y <= 12; y++) {
            table += GetRowString(y) + "\n";
        }

        return table;
    }

    public static void main( String[] args )
    {
        String table = GetMultiplicationTableString();
        System.out.print(table);
    }
}
