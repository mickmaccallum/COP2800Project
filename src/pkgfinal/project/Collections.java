
package pkgfinal.project;
import java.util.*;


public class Collections {

    public static void largestValueInArrayList() {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

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
    	ArrayList<Integer> al = new ArrayList<>();
        
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
    
    public static void stack() {
        Scanner scanner=new Scanner(System.in);
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
    
    public static void main(String args[]) {
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
    
    private static String print(ArrayList<Integer> a) {
    	String ret = "";
		
        ret = a.stream().map((a1) -> a1 + " ").reduce(ret, String::concat);
		
        return ret;
    }
}
