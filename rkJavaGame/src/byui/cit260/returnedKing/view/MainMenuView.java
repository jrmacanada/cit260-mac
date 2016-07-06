/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
//import java.util.Scanner;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class MainMenuView extends View {

    public MainMenuView() {

        super("\n"
                + "\n------------------------------------------"
                + "\n|               Main Menu                |"
                + "\n------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\n------------------------------------------"
                + "\nQ - Quit without saving - End the game."
                + "\n------------------------------------------"
        );

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
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
//            case "Q": // Save Current Game
//                this.endGame();
//                break;

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
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*Calls the startExistingGame() function*");
    }

    private void saveGame() {
        System.out.println("*Calls the saveGame() function*");
    }

    public void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

//    @Override
//    public void endGame() {
//
//        boolean done = false; // set flag to not done
//        do {
//            // prompt for and get player name
//            String value = this.getInput();
//            if (value.toUpperCase().equals("Q")) // user wants to quit
//            {
//                return;
//            }
//            // do the requested action and display the next view
//            done = this.doAction(value);
//
//        } while (!done);
//    }
    
}
