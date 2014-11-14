/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Exceptions section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.*;

public class ExceptionHandling {
    
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
    
    public static void askForACertainNumber() {
        Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter a number:"); 
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

class Point {
    
    private final int x;
    private final int y;
    
    public Point(int num1, int num2) {
        x = num1;
        y = num2;
    }
            
    public int slope(int num3, int num4) throws ArithmeticException {
        int numerator = num4 - y;
        int denominator = num3 - x;
        int slope = (numerator) / (denominator);
            
        return Math.abs(slope);
    }
}

class SlopePoint {

    public static void main() {
        
        Scanner scanner=new Scanner(System.in);
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
            } catch (ArithmeticException e) {
                System.out.println("Zero is an invalid denominator. Please try again.");
            }
        }
    }
}