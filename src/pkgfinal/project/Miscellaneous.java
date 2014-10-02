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
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the array elements[" + i + "]:");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void sumOfOddNumbers() {
        long max = 0;
        long sum = 0;

        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        for (int i = 1; i <= max; i += 2) {
            sum += i;
        }

        System.out.println("Sum of Odd no. is:" + sum);
    }
    
    public static void triangleOfAsterisksUsingLoops() {
        int num = 3;
        
        for(int i = 1; i <= num; i ++) {
            System.out.println(String repeated = StringUtils.repeat("*", i));
        }
    }
}
