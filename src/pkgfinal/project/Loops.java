/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Loops section and
*   a program to execute them.
*/


package pkgfinal.project;
import java.util.Scanner;

public class Loops {
//  Iterates over array of exercise names and selects method to run.   
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Sum of Five Integers", "Factorial Value",
            "Printing A Box of Number Signs", "Dynamic Adding",
            "Reverse A Number"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: sumOfFiveIntegers();
                break;
            case 1: factorialValue();
                break;
            case 2: printingABoxOfNumberSigns();
                break;
            case 3: dynamicAdding();
                break;
            case 4: reverseANumber();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
    
    // Asks for five integers and sums them up.
    public static void sumOfFiveIntegers() {
        int total = 0;

        System.out.println("Enter 5 integers.");
                
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; ++i) {
            total += scan.nextInt();
        }
        
        System.out.println("Total is: " + total);
    }
    
    // Asks for an int and then finds its factorial value.
    public static void factorialValue() {
        System.out.println("Enter an integer.");
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int total = 1;
        
        for (int index = 1; index <= number; ++index) {
            total *= index;
        }
        
        System.out.println(total);
    }    
    
    // 2D loops print a box of number signs.
    public static void printingABoxOfNumberSigns() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        
        for (int y = 0; y < height; ++y) {
            
            StringBuilder row = new StringBuilder();
            
            for (int x = 0; x < width; ++x) {
                row.append("#");
            }
            
            System.out.println(row.toString());
        }
    }
    
    // Runs a counter from ints entered by user in loops.
    public static void dynamicAdding() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("How many numbers should be added?");
        int number = scanner.nextInt();
        
        for (int i = 0; i < number; ++i) {
            sum += scanner.nextInt();
        }
        
        System.out.println("The total is: " + sum);
    }
    
    // Converts int to a String, reverses it and converts back to int.
    public static void reverseANumber() {
        Scanner scanner = new Scanner(System.in);
        int rnum = 0;
        
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        
        String numAsStr = Integer.toString(num);
        String reversed = new StringBuilder(numAsStr).reverse().toString();
        
        rnum = Integer.parseInt(reversed);
        
        System.out.println("Reverse is: " + rnum);
    }
}
