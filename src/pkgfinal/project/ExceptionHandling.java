/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Arithmetic section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.*;

public class ExceptionHandling {
    
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
    
    public static void slopePoint() {
        
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
        int slope = (numerator)/(denominator);
            
        return Math.abs(slope);
    }
}

class SlopePoint {

    public static void main(String args[]) {
        
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
// Unsubmitted
class ConvertToCentimeters {
    private static double height(int feet, int inches) {
        return (feet * 30.48) + (inches * 2.54);
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
 
        Loop: do {
            try {
                System.out.println("Enter height in feet:");
                int feet = scanner.nextInt();
        
                System.out.println("and in inches:");
                int inches = scanner.nextInt();
        
                if (feet < 0 || inches < 0) {
                    throw new Exception();
                }

                double result = height(feet,inches);
                System.out.println("Result:" + result + " cm");
        
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println();
                continue Loop;   
            } catch (Exception e) {
                System.out.println("Please enter positive values only.");
            }
        } while (continueLoop);
    }
}