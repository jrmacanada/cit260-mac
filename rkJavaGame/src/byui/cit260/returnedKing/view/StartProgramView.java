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
              "\n**************************************************************"
            + "\n*                                                            *"
            + "\n*    In this text-based role playing game, you are a 12      *"
            + "\n*  year-old prince who sees his parents being murdered       *"
            + "\n*  by an ambitious uncle and runs away to escape the same    *"
            + "\n*  fate. After 20 years in hiding you start a journey to     *"
            + "\n*  recovery the throne of your father.                       *"
            + "\n*    When you ran away, you choose one of three safe places  *"
            + "\n*  to hide: a monastery, a warrior village with a group      *"
            + "\n*  of mercenaries, or in a hamlet of wizards. Your decision  *"
            + "\n*  determines what kind of abilities and strengths you       *"
            + "\n*  developed.                                                *" 
            + "\n*    In order to regain your kingship, you should travel     *"
            + "\n*  around the kingdom to understand why and how your         *"
            + "\n*  uncle killed your parents and took the kingdom.           *"
            + "\n*  By doing so, you will learn the best way to recovery      *"
            + "\n*  your throne.                                              *"
            + "\n*                                                            *"
            + "\n**************************************************************"
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
                System.out.println("\nInvalid entry: player name cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered */
    }
       
    private boolean doAction(String playersName) {
        if (playersName.length() < 3) {
            System.out.println("\nInvalid player name: "
                    + "The name must be greater than two characters in length");
            return false;
        }
// IS (after implementing exceptions)
        try {
            // call createPlayer() control function
            Player player = GameControl.createPlayer(playersName);
            this.displayNextView(player);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
// WAS (before implementing exceptions)
        // call createPlayer() control function
//        Player player = GameControl.createPlayer(playersName);
//        
//        if (player == null){ //if unsuccessful
//            System.out.println("\nError creating the player.");
//            return false;
//        }
//        
//        //display next view
//        this.displayNextView(player);
        
        return true; // success !

    }

    private void displayNextView(Player player) {
       
        // display a custom welcome message
        System.out.println("\n==========================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n==========================================="
                         );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
             
        // Display the main menu view
        mainMenuView.display();
    }
    
}

