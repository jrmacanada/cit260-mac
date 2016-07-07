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
public class GateNorthMenuView extends View {

    public GateNorthMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                North Gate                |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to the guards"
                + "\n2 - Talk to the travelers"
                + "\n3 - Beg for coin"
                + "\n--------------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South (to enter the castle)"
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
                this.talkGuards();
                break;
            case "2":
                this.talkTravelers();
                break;
            case "3":
                this.begCoin();
                break;
            case "N":
                this.enterNorthRoad();
                break;
            case "S":
                this.enterCastle();
                break;
            case "E":
                this.enterForest();
                break;
            case "W":
                this.enterFarmVillage();
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
        this.console.println(" The north gate is the main enterance to the castle."
                + "\n Twenty guards guard the enterance with hundreds more inside."
                + "\n Villagers may pass only if they give up their arms.");
    }
    
    private void enterNorthRoad() {
        RoadNorthMenuView roadNorthMenuView = new RoadNorthMenuView();
        roadNorthMenuView.display();
    }

    public void enterCastle() {
        CastleMenuView castleMenuView = new CastleMenuView();
        castleMenuView.displayCastleMenuView();
    }
    
    private void enterForest() {
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
    }
    
    private void enterFarmVillage() {
        FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
        farmVillageMenuView.display();
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
    
    private void talkGuards() {
        this.console.println("*** stub to talkGuards() function ***");
    }

    private void talkTravelers() {
        this.console.println("*** stub to talkTravelers() function ***");
    }

    private void begCoin() {
        this.console.println("*** stub to begCoin() function ***");
    }

}
