
package pkgfinal.project;
import java.util.Scanner;
import java.util.ArrayList;

public class Collections {

    public static void largestValueInArrayList() {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

	System.out.println("Enter the number of integers that will be inserted: ");
	int size = scanner.nextInt();
	System.out.println("Enter some integers to insert to the ArrayList: ");
		
        while (size-- > 0) {	
            list.add(scanner.nextInt());
	}

        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < list.size(); ++i) {
            int x = list.get(i);
            
            if (x > max) {
                max = x;
            }
        }
     
        System.out.println("The largest value: " + max);
    }
    
    
    public static void largestValueAndIndexInArrayList() {
        
        Scanner scanner = new Scanner(System.in);
    	ArrayList<Integer> al = new ArrayList<Integer>();
        
        System.out.println("Enter the number of integers that will be inserted: ");
	int size = scanner.nextInt();
	System.out.println("Enter some integers to insert to the ArrayList: ");
	
        while (size-- > 0) {
            al.add(scanner.nextInt());
	}

        int max = Integer.MIN_VALUE;	
        int maxindex = 0;
        
        for (int i = 0; i < al.size(); ++i) {
            int x = al.get(i);
            
            if (x > max) {
                max = x;
                maxindex = i;
            }
        }

        System.out.println("The largest value is " + max + "; which is in slot " + maxindex); 
    }
    
    public static void lengthOfLongestStringInArrayList() {
        Scanner scanner = new Scanner(System.in);
    	ArrayList<String> al = new ArrayList<String>();
    	
        System.out.println("Enter 5 Strings to store in arraylist:");
        
        for (int i = 0; i < 5; ++i) {
            al.add(scanner.nextLine());
        }
		
	int max = Integer.MIN_VALUE;

        for (int i = 0; i < al.size(); ++i) {
            String x = al.get(i);
            int length = x.length();
            
            if (length > max) {
                max = length;
            }
        }
    
        System.out.println("TheLength of longest string in arraylist:" + max);
    }
}
