/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Exceptions section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.*;

public class ExceptionHandling {
//  Iterates over array of exercise names and selects method to run.    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "ID Number Machine", "Ask For a Certain Number",
            "Slope Point"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: IDNumberMachine();
                break;
            case 1: askForACertainNumber();
                break;
            case 2: SlopePoint.main();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }   
        
    // Tries to get an ID number and throws and exception for invalid input.
    public static void IDNumberMachine() {
        Scanner scanner = new Scanner(System.in); 
        String input;
	int num = 0; 
		  
	System.out.println("Enter the ID number:");  
	input = scanner.next(); 
		
        try {
            num = Integer.parseInt(input);

            if (input.length() != 10) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("incorrect");
        } finally {
            if (num != 0) {
               System.out.println("correct");
            }
        }
    }
    
    // Throws an exception if number entered isn't divisible by 2 and 5.
    public static void askForACertainNumber() {
        Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter a number divisible by 2 and 5:"); 
	int input = scanner.nextInt(); 

	try {
            if (input % 2 == 0 && input % 5 == 0) {
		System.out.println("correct");
            } else {
		throw new Exception();
            }
	} catch (Exception e) {
            System.out.println("wrong");
	}
    }
}

// Finds slope between two points. Throws exception on division by zero.
class Point {
    
    private final int x;
    private final int y;
    
    public Point(int num1, int num2) {
        x = num1;
        y = num2;
    }
            
    public double slope(double num3, double num4) throws ArithmeticException {
        double numerator = num4 - y;
        double denominator = num3 - x;
        double slope = (numerator) / (denominator);
            
        return Math.abs(slope);
    }
}

class SlopePoint {

    public static void main() {
        
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Enter x coordinate of current point:");
            int x1 = scanner.nextInt();
            
            System.out.println("Enter y coordinate of current point:");
            int y1 = scanner.nextInt();
            
            System.out.println("Enter x coordinate of target point:");
            int x2 = scanner.nextInt();
            
            System.out.println("Enter y coordinate of target point:");    
            int y2 = scanner.nextInt();

            Point p = new Point(x1, y1);
    
            try {
                System.out.println(p.slope(x2, y2));
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.out.println("Zero is an invalid denominator. Please try again.");
            }
        }
    }
}