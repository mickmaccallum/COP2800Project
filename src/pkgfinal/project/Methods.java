/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Methods section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Methods {
//  Iterates over array of exercise names and selects method to run.    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Square Root of Number", "Area of Circle",
            "Multiple or Not", "Convert To Lowercase",
            "Arithmetic Operations"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: squareRootOfNumber();
                break;
            case 1: areaOfCircle();
                break;
            case 2: multipleOrNot();
                break;
            case 3: convertUpperToLowerCase();
                break;
            case 4: arithmeticOperations();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
    
    private static double number, answer;
    
    // Finds the square root of a number
    private static void calculateSquare(double number) {
        double sqrt = Math.sqrt(number);
        System.out.println("The square root is: " + (int)sqrt);
    }
    
    // Calls the calculateSquare() instance method.
    public static void squareRootOfNumber() {
        Methods challenge = new Methods();
        final Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        
        calculateSquare(number);
    }
    
    // Finds the area of a circle.
    private void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2.0);
        
        System.out.println("Area of circle is: " + area);
    }
    
    public static void areaOfCircle() {
        Methods c1 = new Methods();
        c1.getArea();
    }
    
    // Determines if x is a multiple of y
    private static boolean multiples(int x, int y) {
        return y % x == 0;
    }
    
    public static void multipleOrNot() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        
        System.out.println(multiples(x, y));
    }
    
    // Methods to convert a string to lowercase...
    private static String lowerCase(String x) {
        return x.toLowerCase();
    }
    
    public static void convertUpperToLowerCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter from the alphabet:");
        
        String input;
        
        input = scanner.next();
        input = lowerCase(input);
        
        System.out.println(input);
    }
    
    // Returns the sum of 2 ints.
    private static void Sum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }

    // Returns the difference between two ints.
    private static void Difference(int x, int y) {
        System.out.println("Difference: " + (x - y));
    }

    // Returns the product of two ints.
    private static int Product(int x, int y) {
        return x * y;
    }
    
    public static void arithmeticOperations() {
        int num1 = 0;
        int num2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        Sum(num1, num2);
        Difference(num1, num2);
        
        System.out.println(Product(num1, num2));
    }
}
