/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Flow Control section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class FlowControl {
    
        public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "No Multiples of 3 or 4", "Right or Wrong",
            "Lucky Sum", "Devry Admission Program",
            "Sleep"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: noMultiplesOfThreeOrFour();
                break;
            case 1: rightOrWrong();
                break;
            case 2: luckySum();
                break;
            case 3: devryAdmissionProgram();
                break;
            case 4: sleep();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }    
    
    public static void noMultiplesOfThreeOrFour() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        
        int input = scanner.nextInt();
        
        for (int i = 1; i <= input; i++) {
            if (i % 3 != 0 && i % 4 != 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void rightOrWrong() {
        Scanner scanner=new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        System.out.println(input == 24);
    }
    
    public static void luckySum() {
        Scanner scanner=new Scanner(System.in);
        int a, b, c, s;
        System.out.println("Enter 3 values:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        s = findSum(a, b, c);
        System.out.println("Lucky sum:" + s);
    }
    
    private static int findSum(int a,int b,int c) {
        int total = 0;
        int[] numbers = new int[] {a, b, c};
        
        for (int i : numbers) {
            if (i == 13) {
                break;
            }
            total += i;
        }
        
        return total;
    }
    
    public static void devryAdmissionProgram() {
        Scanner scanner = new Scanner(System.in);
        double gpa;
        int sat_score;
        System.out.println("Devry University Admission Program");
        System.out.print("Enter your GPA out of 5:");
        gpa = scanner.nextDouble();
        System.out.print("Enter your SAT Score:");
        sat_score = scanner.nextInt();
        
        if (gpa < 1.8) {
            System.out.println("Your GPA is too low");
            return;
        }
        
        if (sat_score < 900) {
            System.out.println("Your SAT score is too low");
            return;
        }
        
        System.out.println("You were accepted");
    }
    
    public static void sleep() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is it a weekday today?(true or false):");
        boolean w = scanner.nextBoolean();
        System.out.print("Are you on a vacation?(true or false):");
        boolean v = scanner.nextBoolean();
        
        System.out.println(!w || v ? "You can sleep." : "You cannot sleep.");
    }
}