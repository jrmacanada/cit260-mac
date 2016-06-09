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
 * @author Craig
 */
public class HuntReserveView {
    private String menu;
    
    public HuntReserveView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n|           Hunting Reserve              |"
                      + "\n|     What would you like to do?         |"
                      + "\n------------------------------------------"
                      + "\nH - Hunt for wild game "
                      + "\nT - Talk to the hunters"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------";
                    }
    public void displayHuntReserveView() {
        
        boolean done = false; // set flag to not done
        do{
            
            String huntOption = this.getHuntOption();
            if (huntOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the menu
            
            // do the requested action and display the next view
            done = this.doAction(huntOption);
            
        }while (!done);
    }

    private String getHuntOption() {
        
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
            case "H": 
                this.huntForGame();
                break;
            case "T": 
                this.talkToHunters();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void huntForGame() {
        System.out.println("\nCalls the huntForGame()");
    }

    private void talkToHunters() {
        HunterChallengeView hunterChallengeView = new HunterChallengeView();
        hunterChallengeView.displayHunterChallengeView();
    }
    
}

