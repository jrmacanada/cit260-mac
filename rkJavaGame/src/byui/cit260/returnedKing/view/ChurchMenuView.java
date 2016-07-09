/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author thiag
 */
public class ChurchMenuView extends View {
    
    public ChurchMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                  Church                  |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to priest"
                + "\n2 - Rest to increase stamina"
                + "\n3 - Pray to increase aura"
//                + "\n--------------------------------------------"
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
                this.talkPriest();
                break;
            case "2":
                this.restStamina();
                break;
            case "3":
                this.prayAura();
                break;
//            case "N":
//                this.enterEastRoad();
//                break;
//            case "S":
//                this.enterSeaport();
//                break;
//            case "E":
//                this.notAvailable();
//                break;
//            case "W":
//                this.enterTownship();
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
        this.console.println(" The church ??? ."
                + "\n ??? ."
                + "\n ??? ");
    }

//    private void enterTownship() {
//        TownshipMenuView townshipMenuView = new TownshipMenuView();
//        townshipMenuView.display();
//    }
//    
//    private void enterSeaport() {
//        SeaportMenuView seaportMenuView = new SeaportMenuView();
//        seaportMenuView.display();
//    }
//    
//    private void enterEastRoad() {
//        RoadEastMenuView roadEastMenuView = new RoadEastMenuView();
//        roadEastMenuView.display();
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
    
    private void talkPriest() {
        this.console.println("\nCalls the talkPriest() function");
    }
     
    private void restStamina() {
        this.console.println("\nCalls the restStamina() function");
    }
     
    private void prayAura() {
        this.console.println("\nCalls the prayAura() function");
     }
      
}
