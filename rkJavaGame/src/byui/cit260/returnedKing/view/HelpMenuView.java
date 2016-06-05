/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import java.util.Scanner;
import rkjavagame.RkJavaGame;

/**
 *
 * @author thiag
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n| Help Menu                              |"
                      + "\n------------------------------------------"
                      + "\nG - What is the Goal of the Game"
                      + "\nM - How to move"
                      + "\nB - How to Battle"
                      + "\nC - What Should I collect?"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------";
                    }
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do{
            // prompt for and get player name
            String helpOption = this.getHelpOption();
            if (helpOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpOption);
            
        }while (!done);
    }

    private String getHelpOption() {
        
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
        boolean valid = false; // intialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered */
        }
   

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to uppercase
        
        switch (choice) {
            case "G": //opens the goal of the game
                this.whatIsGoal();
                break;
            case "M": //opens the how to move
                this.howToMove();
                break;
            case "B": // explains how battle works
                this.howToBattle();
                break;
            case "C": // explains what you can collect within the game
                this.whatToCollect();
                break;
            default:
                System.out.println("\n*** Invalid Selection*** Try again");
                break;
        }
        return false;
        
    }
    
    private void whatIsGoal() {
         System.out.println("*Calls the whatIsGoal function*");
    }
    
    private void howToMove() {
         System.out.println("*Calls the howToMove function*");
    }
    
    private void howToBattle() {
         System.out.println("*Calls the howToBattle function*");
    }
    
    private void whatToCollect() {
         System.out.println("*Calls the whatToCollect function*");
    }

  
        
}
