/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Variables section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Variables {
//  Iterates over array of exercise names and selects method to run.    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Multiply Two Numbers", "Even or Odd",
            "Declaring Variables", "Variable Max Values",
            "Testing Your Variable Knowledge"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: multiplyTwoNumbers();
                break;
            case 1: evenOrOdd();
                break;
            case 2: declaringVariables();
                break;
            case 3: variableMaxValue();
                break;
            case 4: testingYourVariableKnowledge();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
        
    private static void multiplyTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int product = 0;
        
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        
        product = num1 * num2;
        
        System.out.println("The product of the two numbers is:" + product);
    }
    
    private static void evenOrOdd() {
        System.out.println("Enter a number");
                
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        String output = number % 2 == 0 ? "even" : "odd";

        System.out.println("The number is " + output);
    }
    
    private static void declaringVariables() {
        // Creates 3 variables and prints their values.
        int a1 = 63;
        double b1 = 45.0;
        double c1 = 67.675586;
        
        System.out.println("The value of first variable is " + a1);
        System.out.println("The value of second variable is " + b1);
        System.out.println("The value of third variable is " + c1);
    }
    
    private static void variableMaxValue() {
        // Prints the min and max values of signed int32
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    
    private static void testingYourVariableKnowledge() {
        int a = 10;
        int b = 100 - a;
        
        System.out.println("Output is: " + a);
        System.out.println("Output is: " + b);
    }   
}