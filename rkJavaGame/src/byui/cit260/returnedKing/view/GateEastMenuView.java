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
public class GateEastMenuView extends View {

    public GateEastMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                East Gate                |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to the gatekeeper"
                + "\n2 - Offer the bribe"
                + "\n3 - Get in disguise"
                + "\n--------------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West (to enter the castle)"
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
                this.offerBribe();
                break;
            case "3":
                this.getDisguise();
                break;
            case "N":
                this.enterForest();
                break;
            case "S":
                this.enterTownship();
                break;
            case "E":
                this.enterEastRoad();
                break;
            case "W":
                this.enterCastle();
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
        this.console.println(" The east gate is monatored by a corrupt guard."
                + "\n For 100 coins the guard will allow you to pass, no questions asked."
                + "\n Postitutes from town and the tavern are allowed access.");
    }
    
    public void enterCastle() {
        CastleMenuView castleMenuView = new CastleMenuView();
        castleMenuView.displayCastleMenuView();
    }
    
    private void enterEastRoad() {
        RoadEastMenuView roadEastMenuView = new RoadEastMenuView();
        roadEastMenuView.display();
    }
    
    private void enterTownship() {
        TownshipMenuView townshipMenuView = new TownshipMenuView();
        townshipMenuView.display();
    }
    
    private void enterForest() {
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
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

    private void offerBribe() {
        this.console.println("*** stub to offerBribe() function ***");
    }

    private void getDisguise() {
        this.console.println("*** stub to getDisguise() function ***");
    }

}

