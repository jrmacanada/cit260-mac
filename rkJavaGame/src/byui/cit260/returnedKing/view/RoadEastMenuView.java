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
class RoadEastMenuView extends View {
    
    public RoadEastMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                East Road                 |"
                + "\n|      Bandit blocks forward movement      |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Retreat "
                + "\n2 - Confront "
                + "\n3 - Move to East Gate "
//                + "\n--------------------------------------------"
//                + "\n    To navigate, enter N-S-E-W"
//                + "\nN - Move North"
//                + "\nS - Move South"
//                + "\nE - Move East (not available)"
//                + "\nW - Move West"
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
                this.enterEastGate();
                break;
//            case "N":
//                this.noEntry();
//                break;
//            case "S":
//                this.noEntry();
//                break;
//            case "E":
//                this.notAvailable();
//                break;
//            case "W":
//                this.noEntry();
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
        this.console.println(" You cannot move forward in your present direction."
                + "\n You will be rerouted if you choose not to fight.");
    }

    private void retreat() {
        // IF player is coming from location [3][4] (Church)
    //    TownshipMenuView townshipMenuView = new TownshipMenuView();
    //    townshipMenuView.displayTownshipMenuView();
        
        // IF player is coming from location [1][4] (Tavern)
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
    
        // IF player is coming from location [2][3] (East Gate)
    //    TavernMenuView tavernMenuView = new TavernMenuView();
    //    tavernMenuView.display();       
    }

    private void confront() {
        try {
            CombatControl fight = new CombatControl();
            fight.damageGiven();
            double works = fight.damageGiven();

            this.console.println("You fought bravely!");
        } catch (CombatControlException cce) {
            ErrorView.display(this.getClass().getName(),
                    cce.getMessage());
        }
    }

    private void enterEastGate() {
        GateEastMenuView gateEastMenuView = new GateEastMenuView();
        gateEastMenuView.display();
    }
//    
//    private void notAvailable() {
//        this.console.println(" You may not leave the kingdom until"
//                + "\n you kill your uncle or die trying.");
//    }
//    
//    private void noEntry() {
//        this.console.println(" You are confronted by an opponent."
//                + "\n You cannot move normally.");
//    }
//
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

}
