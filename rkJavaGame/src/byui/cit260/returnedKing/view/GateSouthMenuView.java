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
public class GateSouthMenuView extends View {

    public GateSouthMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                South Gate                |"
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
                this.talkGatekeeper();
                break;
            case "2":
                this.offerPassword();
                break;
            case "3":
                this.scaleWall();
                break;
            case "N":
                this.enterCastle();
                break;
            case "S":
                this.enterSouthRoad();
                break;
            case "E":
                this.enterTownship();
                break;
            case "W":
                this.enterHuntRes();
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
        this.console.println(" The south gate is always locked."
                + "\n One guard protects the enterance."
                + "\n A password is required to be allowed into the castle.");
    }
    
    public void enterCastle() {
        CastleMenuView castleMenuView = new CastleMenuView();
        castleMenuView.displayCastleMenuView();
    }
    
    private void enterSouthRoad() {
        RoadSouthMenuView roadSouthMenuView = new RoadSouthMenuView();
        roadSouthMenuView.display();
    }
    
    private void enterTownship() {
        TownshipMenuView townshipMenuView = new TownshipMenuView();
        townshipMenuView.display();
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
        this.console.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }
    
    private void talkGatekeeper() {
        this.console.println("*** stub to talkGatekeeper() function ***");
    }

    private void offerPassword() {
        this.console.println("*** stub to offerPassword() function ***");
    }

    private void scaleWall() {
        this.console.println("*** stub to scaleWall() function ***");
    }

}
