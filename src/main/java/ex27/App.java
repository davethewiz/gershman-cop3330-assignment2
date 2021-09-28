package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 */

import CustomUtils.*;


public class App
{

    // Returns a response (or none if all is correct) depending on a given name
    // nameType refers to what kind of name is being used which will be mentioned in the responses
    public static String ValidateName(String name, String nameType) {
        String response = "";

        if (name.length() < 2) {
            response += "The " + nameType + " name must be at least 2 characters long. \n" ;
        }

        if (name.length() == 0) {
            response += "The " + nameType + " name must be filled in. \n";
        }

        return response;
    }

    public static String ValidateZipCode(String zipCode) {
        if (zipCode.length() == 5) {
            try {
                int intValue = Integer.parseInt(zipCode);
                return "";
            } catch (NumberFormatException e) {}
        }

        return "The zipcode must be a 5 digit number.\n";
    }

    public static String ValidateEmployeeID(String id) {
        char[] idArr = id.toCharArray();

        boolean validated = true;

        if (idArr.length == 7) {
            for (int i = 0; i < idArr.length; i++) {
                if (i <= 1 && !Character.isUpperCase(idArr[i])) validated = false;
                if (i == 2 && idArr[i] != '-') validated = false;
                if (i >= 3 && !Character.isDigit(idArr[i])) validated = false;
            }
        }
        else {
            validated = false;
        }

        if (!validated)
            return "The employee ID must be in the format of AA-1234.\n";
        else
            return "";
    }

    // Returns a response string depending on the input
    public static String ValidateInput(String firstName, String lastName, String zipCode, String employeeId) {
        String response = "";

        response += ValidateName(firstName, "first");
        response += ValidateName(lastName, "last");
        response += ValidateEmployeeID(employeeId);
        response += ValidateZipCode(zipCode);

        if (response == "")
            response += "There were no errors found.\n";

        return response;
    }

    public static void main( String[] args )
    {
        String firstName = Input.GetString("Enter the first name: ");
        String lastName = Input.GetString("Enter the last name: ");
        String zipCode = Input.GetString("Enter the ZIP code: ");
        String employeeId = Input.GetString("Enter the employee id: ");

        String validationString = ValidateInput(firstName, lastName, zipCode, employeeId);
        System.out.println(validationString);
    }
}
