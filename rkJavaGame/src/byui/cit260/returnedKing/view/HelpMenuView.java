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
                      + "\nC - What should I collect?"
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
                System.out.println("\nInvalid entry: value cannot be blank");
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
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void whatIsGoal() {
         System.out.println("\n**************************************************"
                          + "\n*             Goal of the Game                   *"
                          + "\n**************************************************"
                          + "\n*                                                *"
                          + "\n*   In Returned King the player's goal is to    *"
                          + "\n* explore the map collecting items to help the   *"
                          + "\n* player become powerful enough to confront his  *"
                          + "\n* uncle and reclaim the throne.                  *"
                          + "\n*                                                *"
                          + "\n**************************************************"
                          );
                          
    }
    
    private void howToMove() {
         System.out.println("\n************************************************"
                          + "\n*          How to Move Your Character          *"
                          + "\n************************************************"
                          + "\n*                                              *"
                          + "\n* To Move your character within the game       *"
                          + "\n* use the keys:                                *"
                          + "\n*   N - Go North                               *"
                          + "\n*   S - Go South                               *"
                          + "\n*   E - Go East                                *"
                          + "\n*   W - Go West                                *"
                          + "\n*                                              *"
                          + "\n************************************************"
                          );
    }
    
    private void howToBattle() {
         System.out.println("\n************************************************"
                          + "\n*           How Battle Works                   *"
                          + "\n************************************************"
                          + "\n*                                              *"
                          + "\n*    The player may choose to confront any     *"
                          + "\n*  opponent in battle at any time. He must     *"
                          + "\n*  select one of three attack strategies and   *"
                          + "\n*  based on his stamina, strength, offense     *"
                          + "\n*  weapons, and defenses the outcome of the    *"
                          + "\n*  battle will be calculated with each attack  *"
                          + "\n*  until he wins, loses, or retreats.          *"
                          + "\n*                                              *"
                          + "\n************************************************"
                          );
    }
    
    private void whatToCollect() {
         System.out.println("\n**************************************************"
                          + "\n*        What You Will Be Collecting             *"
                          + "\n**************************************************"
                          + "\n*                                                *"
                          + "\n*    Personal inventory items are things a       *"
                          + "\n*  player may collect, be given, or purchase     *"
                          + "\n*  throughout the game. Some are required for    *"
                          + "\n*  sustenance (food, coins), while others are    *"
                          + "\n*  preferred for battle or working. To find      *"
                          + "\n*  out what is available visit the inventory     *"
                          + "\n*  items available in different map locations.   *"
                          + "\n*  Don’t miss an opportunity to strengthen your  *"
                          + "\n*  arsenal or restock your supplies.             *"
                          + "\n*                                                *"
                          + "\n**************************************************"
                          );
    }

  
        
}
