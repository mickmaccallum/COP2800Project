/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Strings section and
*   a program to execute them.
*/


package pkgfinal.project;
import java.util.Scanner;
import java.io.*;   

public class Strings {
//  Iterates over array of exercise names and selects method to run.    
    public static boolean startSection() throws IOException {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Upper to Lower Case", "Find the Length of a String",
            "Capitalization", "Palindrone Check",
            "Longest Word"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: changingUppercaseToLowercase();
                break;
            case 1: findTheLengthOfAString();
                break;
            case 2: capitalization();
                break;
            case 3: palindroneCheck();
                break;
            case 4: longestWord();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }    
    
    private static void changingUppercaseToLowercase() {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an Uppercase letter:");
                
        String input = scanner.next();
        String lowercaseInput = input.toLowerCase();

        System.out.println("Output:");
        System.out.println(lowercaseInput);
    }
    
    private static void findTheLengthOfAString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = scanner.next();
        int length = input.length();

        System.out.println("Length of the string is:" + length);
    }
    
    private static void capitalization() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        String upper = line.toUpperCase();
        
        System.out.println("Output:");
        System.out.println(upper);
    }
    
    private static void palindroneCheck() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        String reversed = new StringBuilder(line).reverse().toString();
        
        boolean same = line.equals(reversed);
        String out = same ? "is" : "is not";
        
        System.out.println("Entered string " + out + " a palindrome.");
    }   
    
    private static void longestWord() throws IOException {
        System.out.println("Enter a sentence:");
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String s1 = br.readLine();
        String longestWord = "";

        String[] words = s1.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word in the sentence is:"
            + longestWord); 
    }
}