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
        super("\n"
                + "\n------------------------------------"
                + "\n|              Forest              |"
                + "\n------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Forage for food"
                + "\n2 - Chat with a forest dweller"
                + "\n3 - Shelter and rest"
                + "\n------------------------------------"
                + "\n    To navigate, enter N-S-E-W"
//                + "\nN - Move North (not available)"
//                + "\nS - Move South"
//                + "\nE - Move East"
//                + "\nW - Move West (not available)"
                + "\n------------------------------------"
                + "\n  At anytime you may use D-X-L-R"
                + "\n------------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "1":
                this.forageFood();
                break;
            case "2":
                this.cutWood();
                break;
            case "3":
                this.shelterRest();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void forageFood() {
        // opens the forageFood scene

        // display the forageFood menu 
        ForageFoodMenuView forageFoodMenuView = new ForageFoodMenuView();
        forageFoodMenuView.displayForageFoodMenuView();
    }

    private void cutWood() {
        // opens the cutWood scene

        // display the cutWood menu 
        CutWoodMenuView cutWoodMenuView = new CutWoodMenuView();
        cutWoodMenuView.display();
    }

    private void shelterRest() {
        // opens the shelterRest scene

        // display the shelterRest menu 
        ShelterRestMenuView shelterRestMenuView = new ShelterRestMenuView();
        shelterRestMenuView.displayShelterRestMenuView();
    }

}
