/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Arithmetic section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arithmetic {
    
//  Iterates over array of exercise names and selects method to run.
    public static boolean startSection() throws IOException {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Absolute Equals", "Floor & Ceiling of Number",
            "Square & Quadratic Roots", "Multiples of 3 or 5 Below N",
            "Sum Limit"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: absoluteEquals();
                break;
            case 1: floorAndCeilingOfNumber();
                break;
            case 2: squareAndQuadraticRoots();
                break;
            case 3: multiplesOfThreeOrFiveBelowN();
                break;
            case 4: sumLimit();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }    
    
    // Asks for two numbers and compares their absolute values
    public static void absoluteEquals() {
        Scanner scanner = new Scanner(System.in);
        boolean equal = false;
        
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        
        equal = Math.abs(num1) == Math.abs(num2);
        
        System.out.println("Result is:" + equal);
    }
    
    // Outputs a given number both rounded up and down.
    public static void floorAndCeilingOfNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        double dob = scanner.nextDouble();
        
        System.out.println((int)Math.ceil(dob));
        System.out.println((int)Math.floor(dob));
    }
    
    // Outputs the square and quadratic roots of a given number.
    public static void squareAndQuadraticRoots() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        double x = scan.nextDouble();
        double sqrt = Math.sqrt(x);
        double qdrt = Math.sqrt(sqrt);
        
        System.out.println(String.format("%.5f",sqrt));
        System.out.println(String.format("%.5f",qdrt));
    }
    
    // Iterates up to a given number and sums up multiples of 3 and 5.
    public static void multiplesOfThreeOrFiveBelowN() throws IOException {
        int sum = 0, num = 0;
        System.out.println("Enter a number");
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        
        String s1 = br.readLine();
        num = Integer.parseInt(s1);
        
        for (int i = num; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i != num) {
                    sum += i;
                }
            }
        }
        
        System.out.println(sum);
    }
    
    // Outputs the sum or first number if the digits add up to the same value.
    public static void sumLimit() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();
        
        sum = num1 + num2;
        
        if (Integer.toString(sum).length() == Integer.toString(num1).length()) {
            System.out.println(sum);
        } else {
            System.out.println(num1);
        }
    }
}