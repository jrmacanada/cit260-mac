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
public class SecretCaveMenuView extends View {

    public SecretCaveMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n|           Secret Cave            |"
                + "\n------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Rest to rebuild Stamina"
                + "\n2 - Forage for items in cave"
                + "\n3 - Read the wall markings"
                + "\n------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South (not available)"
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
                this.readWall();
                break;
            case "N":
                this.enterHuntReserve();
                break;
            case "S":
                this.notAvailable();
                break;
            case "E":
                this.enterSouthRoad();
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
        System.out.println(" Rest one day to gain 20 Stamina points."
                + "\n See if you can find some useful items."
                + "\n The skeletons should tell you something.");
    }

    private void enterHuntReserve() {
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
    }

    private void enterSouthRoad() {
        RoadSouthMenuView roadSouthMenuView = new RoadSouthMenuView();
        roadSouthMenuView.display();
    }

    private void notAvailable() {
        System.out.println(" You may not leave the kingdom until"
                + "\n you kill your uncle or die trying.");
    }

    private void noEntry() {
        System.out.println(" You may not return to the Wizard Hamlet."
                + "\n Have faith in your powers.");
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

    private void readWall() {
        System.out.println("*** stub to readsWall() function ***");
    }

}
