/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

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
                + "\nN - Move North (not available)"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West (not available)"
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
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void tellMore() {
        System.out.println(" Rest one day to gain 15 Stamina points."
                + "\n See if you can find some useful items."
                + "\n Read the gravestones to learn more.");
    }

    private void enterFarmVillage() {
        FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
        farmVillageMenuView.display();
    }

    private void enterNorthRoad() {
        RoadNorthMenuView roadNorthMenuView = new RoadNorthMenuView();
        roadNorthMenuView.display();
    }

    private void notAvailable() {
        System.out.println(" You may not leave the kingdom until"
                + "\n you kill your uncle or die trying.");
    }

    private void noEntry() {
        System.out.println(" You may not return to the Monastery."
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
        System.out.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }

    private void addStamina() {
        System.out.println("*** stub to addsStamina() function ***");
    }

    private void findItems() {
        System.out.println("*** stub to findsItems() function ***");
    }

    private void readGraves() {
        System.out.println("*** stub to readsGraves() function ***");
    }

}
