/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Player;
import java.util.Scanner;


/**
 *
 * @author michaelcavey
 */
public final class StartProgramView {
    
    private final String promptMessage = "\nPlease enter your name: ";
    
    public StartProgramView() {
        
        // this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        
        System.out.println(
                "\n************************************************************"
              + "\n*                                                          *"
              + "\n* This is our banner message!                              *"
              + "\n*                                                          *"
              + "\n************************************************************"
              );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            // prompt for and get the players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
        
            // do the requested action and display the next view
            done = this.doAction(playersName);
        
        } while (!done);
        
    }

   private String getPlayersName() {

       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
        boolean valid = false; // intialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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
       
    private boolean doAction(String playersName) {
        if (playersName.length() <2) {
            System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
            return false;
            }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){ //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true; // success !
        
        
    }

    private void displayNextView(Player player) {
       
        // display a custom welcome message
        System.out.println("\n==========================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope tou have a lot of fun!"
                         + "\n==========================================="
                         );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
             
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
}

