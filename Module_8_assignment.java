/*
Jim Lilley
11/27/2022
Module 8 Assignment

In this assignment, I allow users to calculate their total annual service costs for their vehicles.
*/

package com.mycompany.module_8_assignment;
import java.util.*;


public class Module_8_assignment {
    
    //First, I establish my main class and set it up to receive the returned values from my overloaded parameters.

    public static void main(String[] args) {
        greeting();
        Scanner input = new Scanner(System.in); 
        var choice = input.nextLine();
        
        if (choice.contains("1")){
            double charge = yearlyService(100.00);
            System.out.println("The total annual cost is: $" + charge);
        }
        else if (choice.contains("2")){
            double charge = yearlyService(100.00, 50.00);
            System.out.println("The total annual cost is: $" + charge);
        }
        else if (choice.contains("3")){
            double charge = yearlyService(100.00, 50.00, 35.00);
            System.out.println("The total annual cost is: $" + charge);
        }
        else if (choice.contains("4")){
            double charge = yearlyService(100.00, 50.00, 35.00, 0.80);
            System.out.println("The total annual cost is: $" + charge);
        }
          
    //I then establish my greeting and input prompt.    
    }
    
    public static void greeting() {
        System.out.println("Hello! Please enter: \n'1' for standard service, \n'2' for standard service and an oil change, \n'3' for standard service, an oil change and rotation, or \n '4'for all three with coupon!");
    }
    
    //Finally, I set up my overloaded parameter statements to determine which service will be required.
    public static double yearlyService(double a){
        return a;
    }
    
    public static double yearlyService(double a, double b){
        return a + b;
    }
    public static double yearlyService(double a, double b, double c){
        return a + b + c;
    }
    public static double yearlyService(double a, double b, double c, double d){
        return (a + b + c)*d;
    }
}
