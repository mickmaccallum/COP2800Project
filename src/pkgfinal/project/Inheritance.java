/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Inheritance section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Inheritance {
    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Counter Class", "Fruits",
            "Area With Inheritance", "Using Super",
            "Purchased Item Section"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: CounterClass.main();
                break;
            case 1: Fruits.main();
                break;
            case 2: AreaWithInheritance.main();
                break;
            case 3: UsingSuper.main();
                break;
            case 4: PurchasedItemSection.main();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
    
    private class Counter {  
  
	int i = 0;  
	Counter increment() {  
            i++;  
            return this;  
	}  
	void print() {  
            System.out.println("i = " + i);  
	}  
    }  
  
    private static class CounterClass extends Counter {  
  
	public static void main() {
        CounterClass challenge = new CounterClass();
            challenge.i = 2;
            challenge.increment();     
            challenge.print();
	}  
    }
    
    private static class Apple {
        int number_of_items;
       
        public void show() {
            System.out.println("Number of apples:" + number_of_items);
        }
    }

    private static class Banana extends Apple {
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

    private static class Fruits {
        public static void main() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            System.out.println("Enter the number of apples:");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter the number of bananas:");
            int num2 = scanner.nextInt();
            
            Banana obj = new Banana(num1, num2);
            obj.show();
        }
    }
       
    private static class AreaWithInheritance {   
   
	public static void main() {   
            Scanner scanner = new Scanner(System.in);   
		  
            System.out.print("Enter the radius:");   
            double radius = scanner.nextDouble();   
            new AreaWithInheritance().method(radius);   
	}   
   
	public void method(double radius) {   
            Circle myCircle = new Circle();   
            myCircle.setradius(radius);   
            System.out.print(myCircle.getDisplayText());   
	}   
   
	public abstract class CircleShape {   
            public double radius;   
 
            public CircleShape() {   
		
            }   
   
            public CircleShape(double radius) {   
		this.radius = radius;   
            }   
   
            public void setradius(double radius) {   
		this.radius = radius;   
            }   
   
            @Override
            public String toString() {   
		return "Radius " + radius;   
            }   
   
            abstract String getDisplayText();   
	}   
   
	public class Circle extends CircleShape {   
            private double area;   
   
            public double area() {   
                return Math.pow(radius, 2.0) * Math.PI;   
            }   
   
            @Override
            public String getDisplayText() { 
                return "Radius " + radius + " and Area is " + this.area();
            }   
	}   
    }
    
    private static class A {
        int i, j;
    
        A(int a, int b) {
            i = a;
            j = b;
        }
   
        void show() {
            System.out.println("i and j:" + i + " " + j);
        }
    }

    private static class B extends A {
        int k;
    
        B(int a, int b, int c) {
            super(a, b);
            k = c;
        }
    
        @Override
        void show() {
            System.out.println("k:" + k);   
        }
    }

    private static class UsingSuper {
        public static void main() {
            Scanner scanner=new Scanner(System.in);
            int sum=0;

            System.out.println("Enter the 1st number:");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter the 2nd number:");
            int num2 = scanner.nextInt();
            
            System.out.println("Enter the 3rd number:");
            int num3 = scanner.nextInt();
            
            B obj = new B(num1, num2, num3);
            obj.show();
        }
    }
    
    private static class PurchasedItemSection {
        public static void main() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter name:");
            String name1 = scanner.nextLine();
            
            System.out.println("Enter unit price:");
            double up = scanner.nextDouble();
            
            System.out.println("Enter weight:");
            double w = scanner.nextDouble();
            
            WeighedItem item1 = new WeighedItem(name1, up, w);

            scanner.nextLine();
            System.out.println("Enter name:");
            String name2 = scanner.nextLine();
            
            System.out.println("Enter unit price:");
            double up1 = scanner.nextDouble();
            
            System.out.println("Enter quantity:");
            int q = scanner.nextInt();
            
            CountedItem item2 = new CountedItem(name2, up1, q);
            
            System.out.println(item1);
            System.out.println(item2);
        }
    }

    private static class PurchaseItem {
        
        private String name;
        private double unitPrice;
        public PurchaseItem(String n, double up) {
            name = n;
            setPrice(up);
        }

        public void setName(String n) {
            name = n;
        }

        public String getName() {
            return name;
        }

        public void setPrice(double up) {
            unitPrice = (up > 0) ? up : 0;
        }

        public double getPrice() {
            return unitPrice;
        }

        @Override
        public String toString() {
            return getName() + "@ " + getPrice();
        }
    }

    private static class WeighedItem extends PurchaseItem {
        private final double weight;

        public WeighedItem(String n, double up, double w) {
            super(n, up);
            weight = w;
        }

        @Override
        public double getPrice() {
            return super.getPrice() * weight;
        }

        @Override
        public String toString()
        {
            return getName() + "@ "+ super.getPrice() + " " + weight + " Kg" + getPrice() + " $";
        }
    }

    private static class CountedItem extends PurchaseItem {
        private final int quantity;

        public CountedItem(String n, double up, int q) {
            super(n, up);
            quantity = q;
        }

        @Override
        public double getPrice() {
            return super.getPrice() * quantity;
        }

        @Override
        public String toString()
        {
            return getName() + "@ " + super.getPrice() + " " + quantity + " units " + getPrice() + " $";
        }
    }
}