/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Classes section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Classes {
    
    public static boolean startSection() {
        System.out.println("Please enter one of the following section numbers");
        
        String[] exercises = { 
            "Print With toString", "Author",
            "Circle", "Quadrant",
            "Employee Info"
        };
        
        for (int iterator = 0; iterator < exercises.length; ++iterator) {
            System.out.println(iterator + ". " + exercises[iterator]);
        }
                
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        switch (selection) {
            case 0: PrintWithToString.main();
                break;
            case 1: AuthorClass.main();
                break;
            case 2: CircleClass.main();
                break;
            case 3: QuadrantClass.main();
                break;
            case 4: EmployeeInfo.main();
                break;
            default: System.out.println("That was incorrect input.");
                startSection();
                break;
        }
        
        return true; // Reserved for later when this uses recursion.
    }
        
    private static class PrintWithToString { 
        String name;
        String age;
    
        public PrintWithToString(String n, String a) {
            name = n;
            age = a;
        }
  
	public static void main() {  
            Scanner scanner = new Scanner(System.in);  
  
            System.out.print("Enter the name:");  
            String nameString = scanner.next();  
            System.out.print("Enter the age:");  
            String ageString = scanner.next();  
              
            PrintWithToString test = new PrintWithToString(nameString, ageString);  
            System.out.println(test);  
                 
	}  
  
        @Override
	public String toString() {  
            return ("Name=>" + name + " and " + "Age=>" + age);  
	}  
    } 
    
    private static class AuthorClass {     
      
        public static void main() {     
            Scanner scanner = new Scanner(System.in);      
            Author aut;    
  
            System.out.println("Enter name:");
            String somename = scanner.nextLine();   
  
            System.out.println("Enter email:");   
            String semail = scanner.nextLine();
 
            System.out.println("Enter book name:");  
            String sbook = scanner.nextLine();   
  
            aut = new Author(somename, semail, sbook);
  
            System.out.println(aut.name + "\n" + aut.email + "\n" + aut.book);   
        }     
    }    
     
    private static class Author { 
        String name;
        String email;
        String book;
    
        public Author(String nameIn, String emailIn, String bookIn) {
            name = nameIn;
            email = emailIn;
            book = bookIn;
        }
    }
    
    private static class CircleClass {  
  
        public static void main(){  
            Scanner scanner = new Scanner(System.in);  
            int sum = 0;  
            
            System.out.println("Enter radius:");
            double rad = scanner.nextDouble();
 
            System.out.println("Enter color:");   
            String col = scanner.next(); 
 
            MyCircle mc = new MyCircle(rad, col);
  
            System.out.println(mc.getArea()); 
            System.out.println(mc.color); 
        }  
    } 
  
    private static class MyCircle { 
        double radius;
        String color;
    
        public MyCircle(double rad, String col) {
            radius = rad;
            color = col;
        }

        public double getArea() {
            return Math.pow(radius,2.0) * Math.PI;
        }
    }   
    
    private static class QuadrantClass {

        public static void main() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter x coordinate:");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter y coordinate:");
            int num2 = scanner.nextInt();
 
            Point point = new Point(num1, num2);
            System.out.println("Quadrant " + point.quadrant());
        }
    }
    
    private static class Point {
        int x;
        int y;
    
        public Point(int xVal, int yVal) {
            x = xVal;
            y = yVal;
        }
    
        public int quadrant() {
            if (x > 0 && y > 0) {
                return 1;
            } else if (x < 0 && y > 0) {
                return 2;
            } else if (x < 0 && y < 0) {
                return 3;
            } else if (x > 0 && y < 0) {
                return 4;
            } else {
                return 0;
            }
        }
    }
    
    private static class EmployeeInfo {

        public static void main() {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter first name:");
            String first = scanner.nextLine();
            
            System.out.println("Enter last name:");
            String last = scanner.nextLine();
            
            System.out.println("Enter monthly salary:");
            double salary = scanner.nextDouble();
            
            Employee e1 = new Employee(first,last,salary);
 
            System.out.println("First name:" + e1.getFirst());
            System.out.println("Last name:" + e1.getLast());
            System.out.println("Salary:" + e1.getSalary());
        }
    }
    
    final static class Employee {
        private String firstName;
        private String lastName;
        private double salary = 0.0;
    
        public String getFirst() {
            return firstName;
        }

        public String getLast() {
            return lastName;
        }

        public double getSalary() {
            return salary;
        }

        public void setFirst(String f) {
            firstName = f;
        }

        public void setLast(String l) {
            lastName = l;
        }

        public void setSalary(double s) {
            if (s < 0.0) {
                salary = 0.0;
            } else {
                salary = 0.0;
            }
        }
        
        public Employee(String f, String l, double s) {
            this.setFirst(f);
            this.setLast(l);
            this.setSalary(s);
        }
    }
}
