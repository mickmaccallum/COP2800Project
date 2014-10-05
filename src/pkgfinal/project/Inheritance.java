/*
*   Michael MacCallum - COP 2800
*   This file contains programs from Programmr's Inheritance section and
*   a program to execute them.
*/

package pkgfinal.project;

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
  
    public class Challenge extends Counter {  
  
	public void main(String[] args) {
        Challenge challenge = new Challenge();
            challenge.i = 2;
            challenge.increment();     
            challenge.print();
	}  
    }  
}
