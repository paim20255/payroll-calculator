package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.println("Employee Name: ");
        String Name = myScanner.nextLine();

        System.out.println("Hours worked: ");
        Float hoursWorked = myScanner.nextFloat();

        myScanner.nextLine();

        System.out.println("Employee pay rate: ");
        Float payRate = myScanner.nextFloat();

        myScanner.nextLine();

        System.out.println("Your gross pay is: " + (payRate * hoursWorked));









    }
}
