/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Collection section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.*;

public class Collections {

    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Largest Value in List", "Largest Value and Index in List",
            "Length of Longest Word in List", "Stack With Array List",
            "Copy Array List"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: largestValueInArrayList();
                break;
            case 1: largestValueAndIndexInArrayList();
                break;
            case 2: lengthOfLongestStringInArrayList();
                break;
            case 3: stack();
                break;
            case 4: CopyArrayList();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }    
    
    private static void largestValueInArrayList() {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

	System.out.println("Enter the number of integers to be inserted: ");
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
    
    private static void largestValueAndIndexInArrayList() {
        
        Scanner scanner = new Scanner(System.in);
    	ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("Enter the number of integers to be inserted: ");
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

        System.out.println("Largest value is " + max + "; in slot " + maxindex); 
    }
    
    private static void lengthOfLongestStringInArrayList() {
        Scanner scanner = new Scanner(System.in);
    	ArrayList<String> al = new ArrayList<>();
    	
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
    
    private static void stack() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the 3rd number:");
        int num3 = scanner.nextInt();
 
        Stack <Integer> st = new Stack<> (); 

        System.out.println(st);
        
        st.add(num1);
        System.out.println(st);

        st.add(num2);
        System.out.println(st);

        st.add(num3);
        System.out.println(st);
        
        st.pop();
        System.out.println(st);
    }
    
    private static void CopyArrayList() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten elements: ");

        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a1.add(scanner.nextInt());
        }

        ArrayList<Integer> a2 = new ArrayList<>(a1);

        a1.set(a1.size() - 1, -7);

        System.out.println("ArrayList 1:" + print(a1));
    	System.out.println("ArrayList 2:" + print(a2));
    }
    
    // Returns the reduction of concatenated strings with spaces added.
    // Hooray functional programming!
    private static String print(ArrayList<Integer> a) {
    	String ret = "";
		
        ret = a.stream().map((a1) -> a1 + " ").reduce(ret, String::concat);
		
        return ret;
    }
}
