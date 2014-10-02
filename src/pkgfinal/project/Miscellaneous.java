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
public class Miscellaneous {
    private static int i;
    public static void quadrantOfAngle() {			
        int angle = 0;

        System.out.println("Type an integer angle (in degrees) and press Enter:");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextInt();

        int quadrant = (int) (Math.ceil((double) angle) / 90.0);

        if (quadrant == 0) {
            quadrant = 1;
        }

        System.out.println("Quadrant is:" + quadrant);
    }
    
    public static void reverseArray() {
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int iterator = 0; iterator < 10; iterator++) {
            System.out.println("Enter the array elements[" + iterator + "]:");
            arr[iterator] = scan.nextInt();
        }

        for (int iterator = 0; iterator < arr.length / 2; iterator++) {
            int temp = arr[iterator];
            arr[iterator] = arr[arr.length - 1 - iterator];
            arr[arr.length - 1 - iterator] = temp;
        }

        for (int iterator = 0; iterator < 10; iterator++) {
            System.out.print(arr[iterator] + " ");
        }
    }
    
    public static void sumOfOddNumbers() {
        long max = 0;
        long sum = 0;

        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        for (int iterator = 1; iterator <= max; iterator += 2) {
            sum += iterator;
        }

        System.out.println("Sum of Odd no. is:" + sum);
    }
    
    public static void triangleOfAsterisksUsingLoops() {
	int num = 3;
	        
	for(int iterator = 1; iterator <= num; iterator ++) {         
            String repeated = new String(new char[iterator]).replace("\0", "*");               
            System.out.println(repeated);
        }
    }
    
    public static void sumOfNaturalsDivisibleByThreeAndFive() {
        int max=0;
        int sum = 0;

        System.out.println("Enter the maximum no:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        for (int iterator = 2; iterator < max; ++iterator) {
            if (iterator % 3 == 0 || iterator % 5 == 0) {
                sum += iterator;
            }
        }
        
        System.out.println("Total is: " + sum);
    }
}
