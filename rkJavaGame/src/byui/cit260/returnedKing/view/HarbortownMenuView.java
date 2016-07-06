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

class HarbortownMenuView extends View {

    public HarbortownMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                Harbortown                |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to vendor"
                + "\n2 - Work at the fishmarket"
                + "\n3 - Shop for supplies"
                + "\n--------------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South (not available)"
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
                this.talkVendor();
                break;
            case "2":
                this.workMarket();
                break;
            case "3":
                this.shopSupplies();
                break;
            case "N":
                this.enterTownship();
                break;
            case "S":
                this.notAvailable();
                break;
            case "E":
                this.enterSeaport();
                break;
            case "W":
                this.enterSouthRoad();
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
        System.out.println(" The harbortown ??? ."
                + "\n ??? ."
                + "\n ??? ");
    }

    private void enterTownship() {
        TownshipMenuView townshipMenuView = new TownshipMenuView();
        townshipMenuView.display();
    }
    
    private void enterSeaport() {
        SeaportMenuView seaportMenuView = new SeaportMenuView();
        seaportMenuView.display();
    }
    
    private void enterSouthRoad() {
        RoadSouthMenuView roadSouthMenuView = new RoadSouthMenuView();
        roadSouthMenuView.display();
    }
    
    private void notAvailable() {
        System.out.println(" You may not leave the kingdom until"
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
        System.out.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }
    
    private void talkVendor() {
        System.out.println("*** stub to talkVendor() function ***");
    }

    private void workMarket() {
        System.out.println("*** stub to workMarket() function ***");
    }

    private void shopSupplies() {
        System.out.println("*** stub to shopSupplies() function ***");
    }

}

