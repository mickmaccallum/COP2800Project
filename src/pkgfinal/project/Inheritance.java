/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Inheritance section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Inheritance {
    class Counter {  
  
	int i = 0;  
	Counter increment() {  
            i++;  
            return this;  
	}  
	void print() {  
            System.out.println("i = " + i);  
	}  
    }  
  
    public class CounterClass extends Counter {  
  
	public void main() {
        CounterClass challenge = new CounterClass();
            challenge.i = 2;
            challenge.increment();     
            challenge.print();
	}  
    }
    
    class Apple{
        int number_of_items;
       
        public void show() {
            System.out.println("Number of apples:" + number_of_items);
        }
    }

    class Banana extends Apple {
        int number_of_items;

        @Override
        public void show() {
            super.show();
            System.out.println("Number of bananas:" + this.number_of_items);
        }

	public Banana(int a, int b) {
		super.number_of_items = a;
		this.number_of_items = b;
	}
    }

    class EmployeeClass {
        public void main() {
            Scanner scanner=new Scanner(System.in);
            int sum=0;

            System.out.println("Enter the number of apples:");
            int num1=scanner.nextInt();
            System.out.println("Enter the number of bananas:");
            int num2=scanner.nextInt();
            Banana obj = new Banana(num1,num2);
            obj.show();
        }
    }
}
