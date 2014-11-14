/*
*   Michael MacCallum - COP 2800
*   This file contains a program to select programs to run from
*   different Programmr sections.
*/


package pkgfinal.project;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FinalProject {

    public static void main(String[] args) {
    
        try {
            startProjectCycle();
        } catch (IOException ex) {
            Logger.getLogger(FinalProject.class.getName())
                .log(Level.SEVERE, null, ex);
        }
    }
    
    private static void printSections() {
        String[] menuItems = {
            "Variables", "Operators", "Arithmetic", 
            "Flow Control", "Loops", "Methods", 
            "Arrays", "Strings", "Classes", 
            "Inheritance", "Exception Handling", 
            "Polymorphism", "Collections", "Miscellaneous"
        };

        for (int iterator = 0; iterator < menuItems.length; ++iterator) {
            System.out.println(iterator + ". " + menuItems[iterator]);
        }
    }

    private static void startProjectCycle() throws IOException {
        
        printSections();
        System.out.println("Please enter a section number.");
        
        Scanner scanner = new Scanner(System.in);        
        int selection = scanner.nextInt();
        
        boolean shouldContinue = true;
        
        switch (selection) {
            case 0:
                shouldContinue = Variables.startSection();
                break;
            case 1:
                shouldContinue = Operators.startSection();
                break;
            case 2:
                shouldContinue = Arithmetic.startSection();
                break;
            case 3:
                shouldContinue = FlowControl.startSection();
                break;
            case 4:
                shouldContinue = Loops.startSection();
                break;
            case 5:
                shouldContinue = Methods.startSection();
                break;
            case 6:
                shouldContinue = Arrays.startSection();
                break;
            case 7:
                shouldContinue = Strings.startSection();
                break;
            case 8:
                shouldContinue = Classes.startSection();
                break;
            case 9:
                shouldContinue = Inheritance.startSection();
                break;
            case 10:
                shouldContinue = ExceptionHandling.startSection();
                break;
            case 11:
                shouldContinue = Polymorphism.startSection();
                break;
            case 12:
                shouldContinue = Collections.startSection();
                break;
            case 13:
                shouldContinue = Miscellaneous.startSection();
                break;
            default:
                System.out.println("Please enter a section number.");
                startProjectCycle();
                break;
        }        
    }
}
