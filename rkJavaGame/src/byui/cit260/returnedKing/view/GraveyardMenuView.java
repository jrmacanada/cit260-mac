/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class GraveyardMenuView extends View {

    public GraveyardMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n|            Graveyard             |"
                + "\n------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Rest to rebuild Stamina"
                + "\n2 - Forage for items in graveyard"
                + "\n3 - Read the tombstones"
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
                this.addStamina();
                break;
            case "2":
                this.findItems();
                break;
            case "3":
                this.readGraves();
                break;
            case "N":
                this.notAvailable();
                break;
            case "S":
                this.enterFarmVillage();
                break;
            case "E":
                this.enterNorthRoad();
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void tellMore() {
        Game game = RkJavaGame.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
//        Location[][] locations = map.getLocations(); // retreive the locations from map
        this.console.print(map.locations[0][1].getScene().getDescription());
    }

    private void enterFarmVillage() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.movePlayer();
    }

    private void enterNorthRoad() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.movePlayer();
    }

    private void notAvailable() {
        this.console.println(" You may not leave the kingdom until"
                + "\n you kill your uncle or die trying.");
    }

    private void noEntry() {
        this.console.println(" You may not return to the Monastery."
                + "\n Remember you walk with God and Christ.");
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

    private void addStamina() {
        this.console.println("*** stub to addsStamina() function ***");
    }

    private void findItems() {
        this.console.println("*** stub to findsItems() function ***");
    }

    private void readGraves() {
        this.console.println("*** stub to readsGraves() function ***");
    }

}
