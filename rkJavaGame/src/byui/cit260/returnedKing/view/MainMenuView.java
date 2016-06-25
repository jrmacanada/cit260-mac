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
   
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n| Main Menu                              |"
                      + "\n------------------------------------------"
                      + "\nN - Start new game"
                      + "\nG - Start saved game"
                      + "\nH - Get help on how to play the game"
                      + "\nS - Save Game"
                      + "\nQ - Quit"
                      + "\n------------------------------------------");

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
//            case "T": // TEMP link to GameMenu
//                this.tempGameMenu();
//                break;  
//                // remove "case-T" after L07 assignment
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

//    private void tempGameMenu() {
//        
//       GameMenuView gameMenuView = new GameMenuView();
//       gameMenuView.display();
//    }
}
