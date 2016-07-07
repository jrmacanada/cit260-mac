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

public class CornfieldMenuView extends View {

    public CornfieldMenuView() {
                 super( "\n"
                      + "\n------------------------------------"
                      + "\n|            Cornfield             |"
                      + "\n------------------------------------"
                      + "\n Your options for this scene are:"
                      + "\n1 - Rest to rebuild Stamina"
                      + "\n2 - Forage for food"
                      + "\n3 - Work with farmer"   
                      + "\n------------------------------------"
                      + "\nN - Move North  (not available)"
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
                this.getFood();
                break;
            case "3": 
                this.getJob();
                break;
            case "N": 
                this.noEntry();
                break;
            case "S": 
                this.enterWestRoad();
                break;
            case "E": 
                this.enterFarmVillage();
                break;
            case "W": 
                this.notAvailable();
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
        this.console.println(" Rest one day to gain 15 Stamina points."
                       + "\n Glean from the fields to replenish food."
                       + "\n Work with the farmer to earn 10 coins.");
    }

    private void enterWestRoad() {
        RoadWestMenuView roadWestMenuView = new RoadWestMenuView();
        roadWestMenuView.display();
    }

    private void enterFarmVillage() {
        FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
        farmVillageMenuView.display();
    }
    
    private void notAvailable() {
        this.console.println(" You may not leave the kingdom until"
                       + "\n you kill your uncle or die trying.");
    }
    
    private void noEntry() {
        this.console.println(" You may not return to the Monastry."
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
        this.console.println(" This function will display the player's"
                       + "\n Stamina, Strength, and Aura statistics.");
    }

    private void addStamina() {
        this.console.println("*** stub to addsStamina() function ***");
    }

    private void getFood() {
        this.console.println("*** stub to getsFood() function ***");
    }

    private void getJob() {
        this.console.println("*** stub to getsJob() function ***");
    }
  
}