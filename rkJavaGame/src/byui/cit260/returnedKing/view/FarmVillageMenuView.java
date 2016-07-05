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

class FarmVillageMenuView extends View {

    public FarmVillageMenuView () {
        super("\n"
                + "\n------------------------------------"
                + "\n|           Farm Village           |"
                + "\n------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to villager"
                + "\n2 - Work delivery"
                + "\n3 - Shop for supplies"
                + "\n------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
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
                this.talkVillager();
                break;
            case "2":
                this.workDelivery();
                break;
            case "3":
                this.shopSupplies();
                break;
            case "N":
                this.enterGraveyard();
                break;
            case "S":
                this.enterWestGate();
                break;
            case "E":
                this.enterNorthGate();
                break;
            case "W":
                this.enterCornfield();
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
        System.out.println(" The farm village is a great place to replenish your supplies."
                + "\n Ask around for a job to earn more coin."
                + "\n The villagers are friendly, but skeptical of strangers.");
    }

    private void enterGraveyard() {
        GraveyardMenuView graveyardMenuView = new GraveyardMenuView();
        graveyardMenuView.display();
    }

    private void enterWestGate() {
        GateWestMenuView gateWestMenuView = new GateWestMenuView();
        gateWestMenuView.display();
    }

    private void enterNorthGate() {
        GateNorthMenuView gateNorthMenuView = new GateNorthMenuView();
        gateNorthMenuView.display();
    }

    private void enterCornfield() {
        CornfieldMenuView cornfieldMenuView = new CornfieldMenuView();
        cornfieldMenuView.display();
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

    private void talkVillager() {
        System.out.println("*** stub to talkVillager() function ***");
    }

    private void workDelivery() {
        System.out.println("*** stub to workDelivery() function ***");
    }

    private void shopSupplies() {
        System.out.println("*** stub to shopSupplies() function ***");
    }

}

