/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
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
                + "\nZ - Quit without saving - End the game."
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
            case "Z": 
                this.exitGame();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
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
        this.console.println("*Calls the startExistingGame() function*");
    }

    private void saveGame() {
        this.console.println("*Calls the saveGame() function*");
    }

    public void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    private void exitGame() {
        
        System.exit(0);
    }
        
    
}
