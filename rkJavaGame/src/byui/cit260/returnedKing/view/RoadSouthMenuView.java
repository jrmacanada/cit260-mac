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
class RoadSouthMenuView extends View {

    public RoadSouthMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                South Road                |"
                + "\n|  Drucken sailor blocks forward movement  |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Retreat "
                + "\n2 - Confront "
                + "\n3 - Move to South Gate "
//                + "\n--------------------------------------------"
//                + "\n    To navigate, enter N-S-E-W"
//                + "\nN - Move North"
//                + "\nS - Move South (not available)"
//                + "\nE - Move East"
//                + "\nW - Move West"
                + "\n--------------------------------------------"
                + "\n  At anytime you may use D-X-L-R"
                + "\n--------------------------------------------"
                + "\nQ - Quit to Game Menu "
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
                this.enterSouthGate();
                break;
//            case "N":
//                this.noEntry();
//                break;
//            case "S":
//                this.notAvailable();
//                break;
//            case "E":
//                this.noEntry();
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
        // IF player is coming from location [4][1] (Secret Cave)
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
        
        // IF player is coming from location [4][3] (Harbortown)
    //    TownshipMenuView townshipMenuView = new TownshipMenuView();
    //    townshipMenuView.displayTownshipMenuView();
    
        // IF player is coming from location [3][2] (South Gate)
    //    HarbortownMenuView harbortownMenuView = new HarbortownMenuView();
    //    harbortownMenuView.displayHarbortownMenuView();
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

    private void enterSouthGate() {
        GateSouthMenuView gateSouthMenuView = new GateSouthMenuView();
        gateSouthMenuView.display();
    }
    
//    private void notAvailable() {
//        this.console.println(" You may not leave the kingdom until"
//                + "\n you kill your uncle or die trying.");
//    }
//    
//    private void noEntry() {
//        this.console.println(" You are confronted by an opponent."
//                + "\n You cannot move normally.");
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

}
