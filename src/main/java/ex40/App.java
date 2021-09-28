package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Gershman
 *
 *
 */

import CustomUtils.*;

import java.util.*;

public class App
{
    public static Map<String, Employee> employees = new HashMap<>();

    public static void InitEmployees() {
        employees.put("Johnson", new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employees.put("Xiong", new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employees.put("Michaelson", new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employees.put("Jacobson", new Employee("Jake", "Jacobson", "Programmer", ""));
        employees.put("Jackson", new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employees.put("Webber", new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));
    }

    public static void PrintEmployeeTable() {
        ArrayList<String> columnNames = new ArrayList<>();
        columnNames.add("Name");
        columnNames.add("Position");
        columnNames.add("Separation Date");

        Table table = new Table(columnNames);

        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee value = entry.getValue();

            ArrayList<String> rowData = new ArrayList<>();
            rowData.add(value.firstName + " " + value.lastName);
            rowData.add(value.position);
            rowData.add(value.seprationDate);
            table.AddRow(rowData);
        }

        table.PrintTable();
    }

    public static void FilterBySearch(String search) {
        ArrayList<String> removedKeys = new ArrayList<String>();

        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            Employee value = entry.getValue();
            String fullName = value.firstName + " " + value.lastName;

            if (!fullName.contains(search))
                removedKeys.add((entry.getKey()));
        }

        for (String s : removedKeys) {
            employees.remove(s);
        }
    }

    public static void main( String[] args )
    {
        InitEmployees();
        FilterBySearch(Input.GetString("Enter a search string: "));
        PrintEmployeeTable();
    }
}