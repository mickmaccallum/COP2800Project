package pkgfinal.project;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Polymorphism {
    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Constructor Overloading", "Method Overloading",
            "Method Overridding", "Areas of Shapes",
            "Types of Books"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: ConstructorOverloading.main();
                break;
            case 1: MethodOverloading.main();
                break;
            case 2: MethodOverridding.main();
                break;
            case 3: AreasOfShapes.main();
                break;
            case 4: Books.main();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
    
    private static class Box {

	int width;
	int height;
	int depth;

        public Box() {
            width = 1;
            height = 1;
            depth = -1;
        }
    
        public Box(int val) {
            width = val;
            height = val;
            depth = val;
        }
    
        public Box(int w, int h, int d) {
            width = w;
            height = h;
            depth = d;
        }

	int volume() {
            return width * height * depth;
	}
    }

    private static class ConstructorOverloading {

	public static void main() {
            Box mybox1 = new Box(10, 20, 15);
            Box mybox2 = new Box();
            Box mycube = new Box(7);

            int vol;

            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is " + vol);

            vol = mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);

            vol = mycube.volume();
            System.out.println("Volume of mycube is " + vol);
	}
    }
    
    private static class Overload {   
        public void test(int val1) {
            System.out.println("a " + val1);
        }

        public void test(int val1, int val2) {
            System.out.println("a and b " + val1 + " " + val2);
        }
    
        public int test(char c) {
            System.out.println("char " + c);
            return (int)c;
        }
    }   
   
    private static class MethodOverloading {   
	
        public static void main() {   
            Overload overload = new Overload();   
            
            overload.test(10);   
            overload.test(10, 20);   
            
            int result = overload.test('a');   
            System.out.println("Result " + result);   
	}   
    }
    
    private static class Animal {

	public void move() {
            System.out.println("Animals can move");
	}
    }

    private static class Dog extends Animal {

        @Override
	public void move() {
            System.out.println("Dogs can walk and run");
	}
    }

    private static class MethodOverridding {

	public static void main() {
            Animal animal = new Animal();
            animal.move();
        
            Dog dog = new Dog();
            dog.move();
        }
    }
    
    private static class AreasOfShapes {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("**Menu**\n1. Area of Rectangle\n2. Area of Square\n3. Area of Circle\n4. Area of Triangle\nEnter your choice :");

            int ch = sc.nextInt();	
            Area ar = new Area();
	
            switch(ch) {
                case 1:		
                    double a, b;
                    System.out.print("Enter length :");
                    a = sc.nextDouble();
                    System.out.print("Enter breadth :");
                    b = sc.nextDouble();
                    a = ar.area(a, b);
                    System.out.print("Area of rectangle is :" + a);	
                    break;
                case 2:
                    double s;
                    System.out.print("Enter edge :");
                    s = sc.nextDouble();
                    s = ar.area(s, s);
                    System.out.print("Area of square is :" + s);
                    break;
                case 3:
                    double r;
                    System.out.print("Enter radius :");
                    r = sc.nextDouble();
                    r = ar.area(r);
				
                    DecimalFormat df = new DecimalFormat("#.0000");
                    String formatted = df.format(r);

                    System.out.print("Area of circle is :" + formatted);
                    break;
		case 4:
                    double c;
                    System.out.print("Enter side 1 :");
                    a = sc.nextDouble();
                    System.out.print("Enter side 2 :");
                    b = sc.nextDouble();
                    System.out.print("Enter side 3 :");
                    c = sc.nextDouble();
                    c = ar.area(a,b,c);
                    System.out.print("Area of triangle is :" + c);
                    break;
		default:
                    System.out.print("Wrong Option!!");
            }
	}
    }

    private static class Area {
        public double area(double a, double b) {
            return a * b;
        }

        public double area(double r) {
            return Math.PI  * (float)Math.pow(r, 2.0);
        }

        public double area(double a, double b, double c) {
            return (a * b * c) / 2.0;
        }
    }
    
    private static class Books {
        public static void main() {
            Scanner scanner = new Scanner(System.in);

            Book[] book = new Book[2];
            System.out.println("Title of fiction book:");

            String t = scanner.nextLine();
            book[0] = new Fiction(t);

            System.out.println("Title of non fiction book:");
            String t1 = scanner.nextLine();
            book[1] = new NonFiction(t1);
 
            for (Book book1 : book) {
                System.out.println(book1);
            }
        }
    }

    abstract private static class Book {
        String title;
        double price;

        public Book(String t) {
            title = t;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public abstract void setPrice(double p);
    }

    final private static class Fiction extends Book {

        public Fiction(String t) {
            super(t);
            setPrice(24.99);
        }

        @Override
        public void setPrice(double p) {
            price = p;
        }

        @Override
        public String toString() {
            return "Title-" + this.title + " Cost-$" + price;
        }
    }

    final private static class NonFiction extends Book {

        public NonFiction(String t) {
            super(t);
            setPrice(37.99);
        }

        @Override
        public void setPrice(double p) {
            price = p;
        }

        @Override
        public String toString() {
            return "Title-" + this.title + " Cost-$" + price;
        }
    }
}