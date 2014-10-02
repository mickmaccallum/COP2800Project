/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;
import java.util.Scanner;
import java.io.*;   

/**
 *
 * @author Mick
 */
public class Strings {
    public static void changingUppercaseToLowercase() {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an Uppercase letter:");
                
        String input = scanner.next();
        String lowercaseInput = input.toLowerCase();

        System.out.println("Output:");
        System.out.println(lowercaseInput);
    }
    
    public static void findTheLengthOfAString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = scanner.next();
        int length = input.length();

        System.out.println("Length of the string is:" + length);
    }
    
    public static void capitalization() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        String upper = line.toUpperCase();
        
        System.out.println("Output:");
        System.out.println(upper);
    }
    
    public static void palindroneCheck() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        String reversed = new StringBuilder(line).reverse().toString();
        
        boolean same = line.equals(reversed);
        String out = same ? "is" : "is not";
        
        System.out.println("Entered string " + out + " a palindrome.");
    }   
    
    public static void longestWord() throws IOException {
        System.out.println("Enter a sentence:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String longestWord = "";

        String[] words = s1.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word in the sentence is:" + longestWord); 
    }
}
