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
public class GameMenuView extends View {
    
    public GameMenuView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n| Game Menu (temporary access to views)  |"
                      + "\n------------------------------------------"
                      + "\nF - Go to the Forest scene"
                      + "\nK - Go to the King's House scene"
                      + "\nH - Go to the Hunting Reserve Scene"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
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
        forestMenuView.display();
//        System.out.println("*Calls the goToForest() function*");
    }
    
    private void goToKhouse() {
        // opens the King's House scene
//mac??        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the King's House menu 
        KhouseMenuView khouseMenuView = new KhouseMenuView();
        khouseMenuView.display();
//        System.out.println("*Calls the goToKhouse() function*");
    }
    
    private void goToHuntReserve() {
        
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
    }
    
    void displayMenu() {
            System.out.println("\n*Calls the displayMenu function*");
        }

    
    
}
