/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Miscellaneous section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Miscellaneous {
//  Iterates over array of exercise names and selects method to run.    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Quadrant of Angle", "Reverse Array",
            "Sum of Odd Numbers", "Triangle of Asterisks Using Loops",
            "Sum of Natural Numbers Divisible by 3 & 5"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: quadrantOfAngle();
                break;
            case 1: reverseArray();
                break;
            case 2: sumOfOddNumbers();
                break;
            case 3: triangleOfAsterisksUsingLoops();
                break;
            case 4: sumOfNaturalsDivisibleByThreeAndFive();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
        
    // Finds the quadrant that a given int angle is in.
    private static int i;
    public static void quadrantOfAngle() {			
        int angle = 0;

        System.out.println("Type an integer angle (in degrees)");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextInt();

        int quadrant = (int) (Math.ceil((double) angle) / 90.0);

        if (quadrant == 0) {
            quadrant = 1;
        }

        System.out.println("Quadrant is:" + quadrant);
    }
    
    // Iterates of array and reverses its elements.
    public static void reverseArray() {
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for (int iterator = 0; iterator < 10; iterator++) {
            System.out.println("Enter the array elements[" + iterator + "]:");
            arr[iterator] = scan.nextInt();
        }

        for (int iterator = 0; iterator < arr.length / 2; iterator++) {
            int temp = arr[iterator];
            arr[iterator] = arr[arr.length - 1 - iterator];
            arr[arr.length - 1 - iterator] = temp;
        }

        for (int iterator = 0; iterator < 10; iterator++) {
            System.out.print(arr[iterator] + " ");
        }
    }
    
    // Iterates over array and sums values if they are odd.
    public static void sumOfOddNumbers() {
        long max = 0;
        long sum = 0;

        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        for (int iterator = 1; iterator <= max; iterator += 2) {
            sum += iterator;
        }

        System.out.println("Sum of Odd no. is:" + sum);
    }
    
    // Iterates up to a number and prints that many * per line.
    public static void triangleOfAsterisksUsingLoops() {
	int num = 3;
	        
	for(int iterator = 1; iterator <= num; iterator ++) {         
            String repeated = new String(new char[iterator]).replace("\0", "*");               
            System.out.println(repeated);
        }
    }
    
    // Iterates up to a number and sums all natural numbers divisible by 3 and 5
    public static void sumOfNaturalsDivisibleByThreeAndFive() {
        int max=0;
        int sum = 0;

        System.out.println("Enter the maximum no:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        for (int iterator = 2; iterator < max; ++iterator) {
            if (iterator % 3 == 0 || iterator % 5 == 0) {
                sum += iterator;
            }
        }
        
        System.out.println("Total is: " + sum);
    }
}
