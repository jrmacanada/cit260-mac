/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import static byui.cit260.returnedKing.control.MapControl.movePlayer;
import byui.cit260.returnedKing.model.Map;

/**
 *
 * @author michaelcavey
 */
public class WizardStartView extends View {

    public WizardStartView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|         Wizard Hamlet          |"
                + "\n----------------------------------"
                + "\n  You are a Wizard on a quest"
                + "\n  to retake your kingdom."
                + "\n  Be wise on your journey."
                + "\n----------------------------------"
                + "\nN - Move North"
                + "\nS - Move South (not available)"
                + "\nE - Move East"
                + "\nW - Move West  (not available)"
                + "\n----------------------------------"
                + "\n  At anytime you may..."
                + "\nD - Display the map"
                + "\nX - Explore this scene further"
                + "\nL - List your supplies"
                + "\nR - Report your stats"
                + "\n----------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "N":
                this.enterKingsHouse();
                break;
            case "S":
                this.notAvailable();
                break;
            case "E":
                this.enterSecretCave();
                break;
            case "W":
                this.notAvailable();
                break;
            case "D":
                this.mapView();
                break;
            case "X":
                this.tellMore();
                break;
            case "L":
                this.mySupplies();
                break;
            case "R":
                this.myStats();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void tellMore() {
        this.console.println(" This scene is the starting point for the Wizard."
                + "\n You'll be lucky if you ever return.");
    }

    private void enterKingsHouse() {
        KhouseMenuView khouseMenuView = new KhouseMenuView();
        khouseMenuView.display();
    }

    private void enterSecretCave() {
        SecretCaveMenuView secretCaveMenuView = new SecretCaveMenuView();
        secretCaveMenuView.display();
    }

    private void notAvailable() {
        this.console.println(" You may not leave the kingdom until"
                + "\n you kill your uncle or die trying.");
    }

    private void mapView() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }

    private void mySupplies() {
        // This function should list the player's supplies 
        // (food, coin, weapons, artifacts) stored in his wagon.
        // For now it redirects to the Items List of all available items.
        ItemListMenuView itemListMenuView = new ItemListMenuView();
        itemListMenuView.display();
    }

    private void myStats() {
        this.console.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }

    public static void movePlayerToStartingLocation(Map map) {
        movePlayer(map, 4, 0); // starting journey from Wizard Hamlet
    }

}
