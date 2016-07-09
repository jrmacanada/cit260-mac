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

class TownshipMenuView extends View {

    public TownshipMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                 Township                 |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to townsmen "
                + "\n2 - Rest at hotel"
                + "\n3 - Shop for supplies"
//                + "\n--------------------------------------------"
//                + "\nN - Move North"
//                + "\nS - Move South"
//                + "\nE - Move East"
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
                this.talkTownsmen();
                break;
            case "2":
                this.restHotel();
                break;
            case "3":
                this.shopSupplies();
                break;
//            case "N":
//                this.enterEastGate();
//                break;
//            case "S":
//                this.enterHabortown();
//                break;
//            case "E":
//                this.enterChurch();
//                break;
//            case "W":
//                this.enterSouthGate();
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
        this.console.println(" The township brings back many fond childhood memories."
                + "\n Your father would walk the streets with you without fear."
                + "\n This is the place you escaped to when fleeing your murderous uncle.");
    }

//    private void enterEastGate() {
//        GateEastMenuView gateEastMenuView = new GateEastMenuView();
//        gateEastMenuView.display();
//    }
//    
//    private void enterHabortown() {
//        HarbortownMenuView harbortownMenuView = new HarbortownMenuView();
//        harbortownMenuView.display();
//    }
//    
//    private void enterChurch() {
//        ChurchMenuView churchMenuView = new ChurchMenuView();
//        churchMenuView.display();
//    }
//    
//    private void enterSouthGate() {
//        GateSouthMenuView gateSouthMenuView = new GateSouthMenuView();
//        gateSouthMenuView.display();
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
    
    private void talkTownsmen() {
        this.console.println("*** stub to talkVillager() function ***");
    }

    private void restHotel() {
        this.console.println("*** stub to workDelivery() function ***");
    }

    private void shopSupplies() {
        this.console.println("*** stub to shopSupplies() function ***");
    }

}
