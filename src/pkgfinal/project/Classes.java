/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Classes section and
*   a program to execute them.
*/

package pkgfinal.project;
import java.util.Scanner;

public class Classes {
    
    public class PrintWithToString { 
        String name;
        String age;
    
        public PrintWithToString(String n, String a) {
            name = n;
            age = a;
        }
  
	public  void main(String[] args) {  
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
    
    class AuthorClass {     
      
        public void main(String args[]){     
            Scanner scanner=new Scanner(System.in);      
            Author aut;    
  
            System.out.println("Enter name:");
            String somename = scanner.nextLine();   
  
            System.out.println("Enter email:");   
            String semail = scanner.nextLine();
 
            System.out.println("Enter book name:");  
            String sbook = scanner.nextLine();   
  
            aut = new Author(somename, semail, sbook);
  
            System.out.println(aut.name+"\n"+aut.email+"\n"+aut.book);   
        }     
    }    
     
    class Author { 
        String name;
        String email;
        String book;
    
        public Author(String nameIn, String emailIn, String bookIn) {
            name = nameIn;
            email = emailIn;
            book = bookIn;
        }
    }
    
    class CircleClass {  
  
        public void main(String args[]){  
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
  
    class MyCircle { 
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
    
    class QuadrantClass {

        public void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter x coordinate:");
            int num1 = scanner.nextInt();
            
            System.out.println("Enter y coordinate:");
            int num2 = scanner.nextInt();
 
            Point point = new Point(num1, num2);
            System.out.println("Quadrant " + point.quadrant());
        }
    }
    
    class Point {
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
    
    class EmployeeInfo {

        public void main() {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter first name:");
            String first = scanner.nextLine();
            System.out.println("Enter last name:");
            String last = scanner.nextLine();
            System.out.println("Enter monthly salary:");
            double salary = scanner.nextDouble();
            Employee e1 = new Employee(first,last,salary);
 
            System.out.println("First name:"+e1.getFirst());
            System.out.println("Last name:"+e1.getLast());
            System.out.println("Salary:"+e1.getSalary());
        }
    }
    
    class Employee {
        private String firstName;
        private String lastName;
        private double salary;
    
        public Employee(String f, String l, double s) {
            firstName = f;
            lastName = l;
            salary = s;
        }

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
    }
}
