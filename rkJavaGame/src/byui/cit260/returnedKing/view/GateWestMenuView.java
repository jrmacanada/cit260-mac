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
public class GateWestMenuView extends View{

    public GateWestMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                West Gate                |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to the gatekeeper"
                + "\n2 - Offer the password"
                + "\n3 - Scale the wall"
                + "\n--------------------------------------------"
                + "\nN - Move North (to enter the castle)"
                + "\nS - Move South"
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
                this.fightAnimals();
                break;
            case "2":
                this.pickLock();
                break;
            case "3":
                this.scaleWall();
                break;
            case "N":
                this.enterFarmVillage();
                break;
            case "S":
                this.enterHuntRes();
                break;
            case "E":
                this.enterCastle();
                break;
            case "W":
                this.enterWestRoad();
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
        System.out.println(" The West gate is always locked."
                + "\n No guards are stationed at the enterance because a swamp "
                + "\n filled with crocodiles and snakes prevent access."
                + "\n Nobody has ever fought their way through.");
    }
    
    public void enterCastle() {
        CastleMenuView castleMenuView = new CastleMenuView();
        castleMenuView.displayCastleMenuView();
    }
    
    private void enterWestRoad() {
        RoadWestMenuView roadWestMenuView = new RoadWestMenuView();
        roadWestMenuView.display();
    }
    
    private void enterFarmVillage() {
        FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
        farmVillageMenuView.display();
    }
    
    private void enterHuntRes() {
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
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
    
    private void fightAnimals() {
        System.out.println("*** stub to fightAnimals() function ***");
    }

    private void pickLock() {
        System.out.println("*** stub to pickLock() function ***");
    }

    private void scaleWall() {
        System.out.println("*** stub to scaleWall() function ***");
    }

}