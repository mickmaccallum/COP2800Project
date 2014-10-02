/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;
import java.util.Scanner;

/**
 *
 * @author Mick
 */
public class Methods {
    private static double number, answer;
    
    public static void calculateSquare(double number) {
        double sqrt = Math.sqrt(number);
        System.out.println("The square root is: " + (int)sqrt);
    }
    
    public void squareRootOfNumber() { // main
        Methods challenge = new Methods();
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextDouble();
        Methods.calculateSquare(number);
    }
    
    static final double PI = 3.14;
    
    void getArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        
        double radius = scanner.nextDouble();
        double area = PI * Math.pow(radius, 2.0);
        
        System.out.print("Area of circle is: " + area);
    }
    
    public void areaOfCircle() { // main
        Methods c1 = new Methods();
        c1.getArea();
    }
    
    public static boolean multiples(int x, int y) {
        return y % x == 0;
    }
    
    public void multipleOrNot() { // main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        
        System.out.println(multiples(x, y));
    }
    
    public static String lowerCase(String x) {
        return x.toLowerCase();
    }
    
    public static void convertUpperToLowerCase() { // main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter from the alphabet:");
        
        String input;
        
        input = scanner.next();
        input = lowerCase(input);
        
        System.out.println(input);
    }
    
    private static void Sum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }

    private static void Difference(int x, int y) {
        System.out.println("Difference: " + (x - y));
    }

    private static int Product(int x, int y) {
        return x * y;
    }
    
    public static void arithmeticOperations() { // main
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
