/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal.project;
import java.util.Scanner;

/**
 *
 * @author Mick
 */
public class FinalProject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Variables.multiplyTwoNumbers();
        startProjectCycle();
    }

    private static void startProjectCycle() {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        
//        int input = scanner.nextInt();
        getMenuSelection();
    }
    
    private static int getMenuSelection() {
        String[] menuItems = {
            "Variables", "Operators", "Arithmetic", 
            "Flow Control", "Loops", "Methods", 
            "Arrays", "Strings", "Classes", 
            "Inheritance", "Exception Handling", 
            "Polymorphism", "Collections", "Miscellaneous"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a section");
        
        for (int iterator = 0; iterator < menuItems.length; ++iterator) {
            System.out.println(iterator + ". " + menuItems[iterator]);
        }
        
        int selection = scanner.nextInt();
        
        if (selection >= 0 && selection < menuItems.length) {
            return getSubMenuAtIndex(selection);
        } else {
            System.out.println("That was invalid input.");
            return getMenuSelection();
        }
    }
    
    private static int getSubMenuAtIndex(int index) {
        System.out.println("You selected: " + index);
        
        switch (index) {
            case 0:
                
            break;
        }
        
        return 1;
    }
}
