/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CombatControl;
import byui.cit260.returnedKing.exceptions.CombatControlException;

/**
 *
 * @author michaelcavey
 */
public class RoadNorthMenuView extends View {

    public RoadNorthMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                North Road                |"
                + "\n|   Prison guard blocks forward movement   |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Retreat"
                + "\n2 - Confront"
                + "\n3 - Move to North Gate"
                + "\n--------------------------------------------"
                + "\nN - Move North (not available)"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
                + "\n--------------------------------------------"
                + "\n  At anytime you may use D-X-L-R"
                + "\n--------------------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to uppercase

        switch (value) {
            case "1":
                this.retreat();
                break;
            case "2":
                this.confront();
                break;
            case "3":
                this.enterNorthGate();
                break;
            case "N":
                this.notAvailable();
                break;
            case "S":
                this.noEntry();
                break;
            case "E":
                this.noEntry();
                break;
            case "W":
                this.noEntry();
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
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
    
    private void tellMore() {
        System.out.println(" You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
    }

    private void retreat() {
        // IF player is coming from location [0][1] (Graveyard)
        FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
        farmVillageMenuView.display();
        
        // IF player is coming from location [0][3] (Prison)
//        ForestMenuView forestMenuView = new ForestMenuView();
//        forestMenuView.display();
    
        // IF player is coming from location [1][2] (North Gate)
//        GraveyardMenuView graveyardMenuView = new GraveyardMenuView();
//        graveyardMenuView.display();       
    }

    private void confront() {
        try {
            CombatControl fight = new CombatControl();
            fight.damageGiven();
            double works = fight.damageGiven();

            System.out.println("You fought bravely!");
        } catch (CombatControlException cce) {
            System.out.println(cce.getMessage());
        }
    }

    private void enterNorthGate() {
        GateNorthMenuView gateNorthMenuView = new GateNorthMenuView();
        gateNorthMenuView.display();
    }
    
    private void notAvailable() {
        System.out.println(" You may not leave the kingdom until"
                + "\n you kill your uncle or die trying.");
    }
    
    private void noEntry() {
        System.out.println(" You are confronted by an opponent."
                + "\n You cannot move normally.");
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
        System.out.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }

}
