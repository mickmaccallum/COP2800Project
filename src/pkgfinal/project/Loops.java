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
    
    public static void sumOfFiveIntegers() {
        int total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; ++i) {
            total += scan.nextInt();
        }
        
        System.out.println("Total is: " + total);
    }
    
    public static void factorialValue() {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int total = 1;
        
        for (int index = 1; index <= number; ++index) {
            total *= index;
        }
        
        System.out.println(total);
    }    
    
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
