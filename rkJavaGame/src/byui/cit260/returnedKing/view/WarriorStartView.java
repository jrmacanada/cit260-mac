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
public class WarriorStartView extends View {

    public WarriorStartView() {
        super("\n"
                + "\n----------------------------------"
                + "\n|        Warrior Village         |"
                + "\n----------------------------------"
                + "\n  You are a Warrior in a battle"
                + "\n  to retake your kingdom."
                + "\n  Be strong on your journey."
                + "\n----------------------------------"
                + "\n  To navigate, enter N-S-E-W"
//                + "\nN - Move North (not available)"
//                + "\nS - Move South"
//                + "\nE - Move East  (not available)"
//                + "\nW - Move West"
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
//            case "N":
//                this.notAvailable();
//                break;
//            case "S":
//                this.enterTavern();
//                break;
//            case "E":
//                this.notAvailable();
//                break;
//            case "W":
//                this.enterPrison();
//                break;
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
        this.console.println(" This scene is the starting point for a Warrior."
                + "\n You'll be lucky if you ever return.");
    }

//    private void enterTavern() {
//        TavernMenuView tavernMenuView = new TavernMenuView();
//        tavernMenuView.display();
//    }
//
//    private void enterPrison() {
//        PrisonMenuView prisonMenuView = new PrisonMenuView();
//        prisonMenuView.display();
//    }
//
//    private void notAvailable() {
//        this.console.println(" You may not leave the kingdom until"
//                + "\n you kill your uncle or die trying.");
//    }

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
        movePlayer(map, 0, 4); // starting journey from Warrior Village
    }

}
