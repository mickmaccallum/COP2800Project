/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Arithmetic section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner; 

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
    int x;
    int y;
    
    public Point(int theX, int theY) {
        x = theX;
        y = theY;
    }
    
    public int Slope(int x2, int y2) {
        return (y2 - y) / (x2 - x);
    }
}