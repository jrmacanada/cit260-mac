/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.WoodControl;
import java.util.Scanner;

/**
 *
 * @author michaelcavey
 */
public class ForestMenuView extends View {
    
    public ForestMenuView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n| Forest Menu                              |"
                      + "\n------------------------------------------"
                      + "\nF - Forage for food"
                      + "\nC - Chat with a forest dweller"
                      + "\nS - Shelter and rest"
                      + "\nQ - Quit"
                      + "\n------------------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "F": 
                this.forageFood();
                break;
            case "C": 
                this.cutWood();
                break;
            case "S": 
                this.shelterRest();
                break;
            
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void forageFood() {
        // opens the forageFood scene

        // display the forageFood menu 
        ForageFoodMenuView forageFoodMenuView = new ForageFoodMenuView();
        forageFoodMenuView.displayForageFoodMenuView();
//        System.out.println("*Calls the forageFood() function*");
    }
    
    private void cutWood() {
        // opens the cutWood scene

        // display the cutWood menu 
        CutWoodMenuView cutWoodMenuView = new CutWoodMenuView();
        cutWoodMenuView.display();
//        System.out.println("*Calls the cutWood() function*");
    }
    
    private void shelterRest() {
        // opens the shelterRest scene

        // display the shelterRest menu 
//        ShelterRestMenuView shelterRestMenuView = new ShelterRestMenuView();
//        shelterRestMenuView.displayShelterRestMenuView();
        System.out.println("*Calls the shelterRest() function*");
    }
    
}
