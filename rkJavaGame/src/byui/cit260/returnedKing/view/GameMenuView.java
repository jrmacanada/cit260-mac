/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.util.Scanner;

/**
 *
 * @author thiag (original to line 16)
 * @author cavey (as temp menu for access to scene views)
 */
public class GameMenuView {
    private String menu;
    
    public GameMenuView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n| Game Menu (temporary access to views)  |"
                      + "\n------------------------------------------"
                      + "\nF - Go to the Forest scene"
                      + "\nK - Go to the King's House scene"
                      + "\nH - Go to the Hunting Reserve Scene"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------";
                    }
    
    public void displayGameMenuView() {
        
        boolean done = false; // set flag to not done
        do{
            // prompt for and get player name
            String gameOption = this.getGameOption();
            if (gameOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game menu
            
            // do the requested action and display the next view
            done = this.doAction(gameOption);
            
        }while (!done);
    }
    
    private String getGameOption() {
        
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
            case "F": //opens the Forest scene
                this.goToForest();
                break;
            case "K": //opens the King's House scene
                this.goToKhouse();
                break;
            case "H": // opens the Hunting Reserve scene
                this.goToHuntReserve();
                break;
            
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void goToForest() {
        // opens the Forest scene
//mac??        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the Forest menu 
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.displayForestMenuView();
//        System.out.println("*Calls the goToForest() function*");
    }
    
    private void goToKhouse() {
        // opens the King's House scene
//mac??        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the King's House menu 
        KhouseMenuView khouseMenuView = new KhouseMenuView();
        khouseMenuView.displayKhouseMenuView();
//        System.out.println("*Calls the goToKhouse() function*");
    }
    
    private void goToHuntReserve() {
        
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.displayHuntReserveView();
    }
    
    void displayMenu() {
            System.out.println("\n*Calls the displayMenu function*");
        }

    
    
}
