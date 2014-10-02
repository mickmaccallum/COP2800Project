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
public class Operators {
    static void arithmeticOperators() {
        int a, b;
        int resulta, results, resultm;
        float resultd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        
        resulta = a + b;
        results = a - b;
        resultm = a * b;
        resultd = (float)a / b;
        
        System.out.println("The result of adding is " + resulta);
        System.out.println("The result of subtracting is " + results);
        System.out.println("The result of multiplying is " + resultm);
        System.out.println("The result of dividing is " + resultd);
        
    }
    
    public static void degreeToFahrenheitConverter() {
        
        System.out.println("Enter a temperature in Celsius: ");
        Scanner scanCelsius = new Scanner(System.in);
        double fahrenheit = scanCelsius.nextDouble() * 9d / 5d + 32d;
        
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
    
    public static void largestOfThreeNumbers(){
        Scanner scanner=new Scanner(System.in);
        int x, y, z;
        
        System.out.println("Enter three integers:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        
        
        if (x > y && x > z) {
            System.out.println("First number is largest.");
            } else if (y > x && y > z) {
            System.out.println("Second number is largest.");
            } else if (z > x && z > y) {
            System.out.println("Third number is largest.");
            } else {
            System.out.println("Entered numbers are not distinct.");
        }
    }
    
    public static void simpleInterest(){
        
        double principal;  // the value of the investment
        double rate;       // the annual interest rate
        double interest;   // the interest earned during the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial investment: ");
        principal = scanner.nextDouble();
        
        System.out.println("Enter the annual interest rate: ");
        rate = scanner.nextDouble();
        
        interest = principal * rate / 100.0;
        principal += interest;
        
        System.out.println("The value of the investment after one year is: "+principal);
    }
    
    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to be checked: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(isLeapYear);
    }
}