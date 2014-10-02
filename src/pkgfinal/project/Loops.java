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
public class Loops {
    public void sumOfFiveIntegers() {
        int total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 5; ++i) {
            total += scan.nextInt();
        }
        
        System.out.println("Total is: " + total);
    }
    
    public void factorialValue() {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int total = 1;
        
        for (int index = 1; index <= number; ++index) {
            total *= index;
        }
        
        System.out.println(total);
    }    
    
    public void printingABoxOfNumberSigns() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        
        for (int y = 0; y < height; ++y) {
            
            StringBuilder row = new StringBuilder();
            
            for (int x = 0; x < width; ++x) {
                row.append("#");
            }
            
            System.out.println(row.toString());
        }
    }
    
    public void dynamicAdding() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("How much numbers to add?"); // Same funny typo as on programmr.
        int number = scanner.nextInt();
        
        for (int i = 0; i < number; ++i) {
            sum += scanner.nextInt();
        }
        
        System.out.println("The total is: " + sum);
    }
    
    public void reverseANumber() {
        Scanner scanner = new Scanner(System.in);
        int rnum = 0;
        
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        
        String numAsStr = Integer.toString(num);
        String reversed = new StringBuilder(numAsStr).reverse().toString();
        
        rnum = Integer.parseInt(reversed);
        
        System.out.println("Reverse is: " + rnum);
    }
}
