/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;

/**
 *
 * @author Mick
 */

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
