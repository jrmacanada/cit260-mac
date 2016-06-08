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
public class MainMenuView {
    private String menu;
    
    public MainMenuView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n| Main Menu                              |"
                      + "\n------------------------------------------"
                      + "\nN - Start new game"
                      + "\nG - Get and start saved game"
                      + "\nH - Get help on how to play the game"
                      + "\nS - Save Game"
                      + "\nQ - Quit"
                      + "\n------------------------------------------";
                    }
    public void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do{
            // prompt for and get player name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    private String getMenuOption() {
       
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to uppercase
        
        switch (choice) {
            case "N": //Starts a new Game
                this.startNewGame();
                break;
            case "G": //Starts an existing game
                this.startExistingGame();
                break;
            case "H": //Displays help Menu
                this.displayHelpMenu();
                break;
            case "S": // Save Current Game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
        
    private void startNewGame() {
        // Create a New Game
        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the menu game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }  
            
    private void startExistingGame() {
        System.out.println("*Calls the startExistingGame() function*");
    }
    private void saveGame() {
        System.out.println("*Calls the saveGame() function*");
    }
    public void displayHelpMenu() {
        
       HelpMenuView helpMenuView = new HelpMenuView();
       helpMenuView.displayHelpMenuView();
       
    }
}
