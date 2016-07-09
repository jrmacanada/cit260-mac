/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author Craig
 */

public class TavernMenuView extends View {
    
    public TavernMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                  Tavern                  |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to owner"
                + "\n2 - Talk to drunk"
                + "\n3 - Talk to shady character"
//                + "\n--------------------------------------------"
//                + "\nN - Move North (not available)"
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
                this.talkToOwner();
                break;
            case "2":
                this.talkToDrunk();
                break;
            case "3":
                this.talkToShady();
                break;
//            case "N":
//                this.noEntry();
//                break;
//            case "S":
//                this.enterEastRoad();
//                break;
//            case "E":
//                this.notAvailable();
//                break;
//            case "W":
//                this.enterForest();
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
        this.console.println(" The tavern ??? ."
                + "\n ??? ."
                + "\n ??? ");
    }

//    private void enterForest() {
//        ForestMenuView forestMenuView = new ForestMenuView();
//        forestMenuView.display();
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
//    
//    private void noEntry() {
//        this.console.println(" You may not return to the Warrior Village."
//                       + "\n Trust in your fighting skills.");
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
    
    private void talkToOwner() {
        this.console.println("\nCalls the talkToOwner() function");
    }
     
    private void talkToDrunk() {
        this.console.println("\nCalls the talkToDrunk() function");
    }
     
    private void talkToShady() {
        this.console.println("\nCalls the talkToShady() function");
    }
    
}
