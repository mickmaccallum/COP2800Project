/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package pkgfinal.project;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
* @author Mick
*/
public class Arithmetic {
    public static void absoluteEquals(){
        Scanner scanner=new Scanner(System.in);
        boolean equal = false;
        
        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();
        
        equal = Math.abs(num1) == Math.abs(num2);
        
        System.out.println("Result is:"+equal);
    }
    
    public static void floorAndCeilingOfNumber(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        double dob=scanner.nextDouble();
        
        System.out.println((int)Math.ceil(dob));
        System.out.println((int)Math.floor(dob));
    }
    public static void squareAndQuadraticRoots(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double x = scan.nextDouble();
        double sqrt = Math.sqrt(x);
        double qdrt = Math.sqrt(sqrt);
        
        System.out.println(String.format("%.5f",sqrt));
        System.out.println(String.format("%.5f",qdrt));
    }
    
    public static void multiplesOfThreeOrFiveBelowN() throws IOException {
        int sum=0,num=0;
        System.out.println("Enter a number below which sum must be calculated:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
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
    
    public static void sumLimit(){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        
        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();
        
        sum = num1 + num2;
        
        if (Integer.toString(sum).length() == Integer.toString(num1).length()) {
            System.out.println(sum);
            } else {
            System.out.println(num1);
        }
    }
}