/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Arrays section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Arrays {

//  Iterates over array of exercise names and selects method to run.
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Add Elements of an Array", "Even Numbers Only",
            "Product of Greatest and Smallest", "Swap Ends",
            "Locate the Largest Number in the Array"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: addElementsOfAnArray();
                break;
            case 1: evenNumbersOnly();
                break;
            case 2: productOfGreatestAndSmallest();
                break;
            case 3: swapEnds();
                break;
            case 4: locateTheLargestNumberInTheArray();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }    
    
    // Iterates over an int array and sums up the value of the elements.
    public static void addElementsOfAnArray() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a[];
        a = new int[10];
        
        System.out.println("Enter elements of array: ");
        
        for (int i = 0; i < a.length; ++i) {
            a[i] = scanner.nextInt();
        }
        
        for (int i : a) {
            sum += i;
        }
        
        System.out.println("The sum of the elements in the array is: " + sum);
    }
    
    // Outputs only the even numbers in a given int array.
    public static void evenNumbersOnly() {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        
        for (int i = 0; i < 5; ++i) {
            arr[i] = scanner.nextInt();
        }
        
        int evens = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
                ++evens;
            }
        }
        
        if (evens == 0) {
            System.out.println("Even number not found in array.");
        }
    }
    
    // Outputs the product of highest and lowest numerical values in the array.
    public static void productOfGreatestAndSmallest() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a[];
        int max = 0, min = 0;
        a = new int[10];
        
        System.out.println("Enter elements of array: ");
    
        for (int i = 0; i < 10; ++i) {
            int newest = scanner.nextInt();
            a[i] = newest;
            
            if (i == 0) {
                min = newest;
                max = newest;
            }else if (newest < min) {
                min = newest;
            } else if (newest > max) {
                max = newest;
            }
        }
        
        System.out.println("Result is: " + (max * min));
    }
    
    // Gets the first/last items in an array and reverses them.
    public static void swapEnds() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter size of the array:");
        size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter integers into the array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;

        System.out.println("Printing the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    // Iterates over and array to find the index of the highest value.
    public static void locateTheLargestNumberInTheArray() {
        int[] a = new int[10];
        int maxPos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values:");

        int largest = 0;
        int largestIndex = 0;

        for (int i = 0; i < 10; ++i) {
            a[i] = sc.nextInt();

            if (a[i] > largest) {
                largest = a[i];
                largestIndex = i;
            }
        }

        System.out.print("Array:");

        for (int i : a) {
            System.out.print(" " + i);
        }

        System.out.print("\n");

        System.out.println("The largest element is: " + largest);
        System.out.println("Its location: " + largestIndex);
    }
}
