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
public class Variables {
        
    public static void multiplyTwoNumbers(){
        Scanner scanner=new Scanner(System.in);
        int product=0;
        
        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();
        
        product = num1 * num2;
        
        System.out.println("The product of the two numbers is:"+product);
    }
    
    public static void evenOrOdd(){
        Scanner scanner=new Scanner(System.in);
        int product=0;
        
        System.out.println("Enter the 1st number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=scanner.nextInt();
        
        product = num1 * num2;
        
        System.out.println("The product of the two numbers is:"+product);
    }
    
    public static void declaringVariable(){
        
        int a1 = 63;
        double b1 = 45.0;
        double c1 = 67.675586;
        
        System.out.println("The value of first variable is "+a1);
        System.out.println("The value of second variable is "+b1);
        System.out.println("The value of third variable is "+c1);
    }
    
    public static void variableMaxValue(){
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    
    public static void testingYourVariableKnowledge(){
        int a = 10;
        int b = 100 - a;                         //dynamically initialize this
        
        System.out.println("Output is:" + a);
        System.out.println("Output is:" + b);
    }   
}