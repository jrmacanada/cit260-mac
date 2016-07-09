/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Actor;
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
                + "\nM - Mike's Report"
        );

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "N": // Starts a new Game
                this.startNewGame();
                break;
            case "G": // Starts an existing game
                this.startSavedGame();
                break;
            case "H": // Displays help Menu
                this.displayHelpMenu();
                break;
            case "S": // Save Current Game
                this.saveGame();
                break;
//            case "Z": 
//                this.exitGame();
//                break;
            case "M": // start Mike's Report
                this.mikesReport();
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

    private void startSavedGame() {
        
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        // prompt and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(RkJavaGame.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    public void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
//    private void exitGame() {
//        
//        System.exit(0);
//    }
    
    public void mikesReport() {
        
        ReportMenuView reportMenuView = new ReportMenuView();
        reportMenuView.displayReportMenuView();
    }
    
    
        
}
