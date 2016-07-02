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
public class MonkStartView extends View {
    
    public MonkStartView() {
                 super( "\n"
                      + "\n----------------------------------"
                      + "\n|           Monastery            |"
                      + "\n----------------------------------"
                      + "\n  You are a Monk on a mission"
                      + "\n  to retake your kingdom."
                      + "\n  Pray for a successful journey."   
                      + "\n----------------------------------"
                      + "\nN - Move North (not available)"
                      + "\nS - Move South"
                      + "\nE - Move East"
                      + "\nW - Move West  (not available)"
                      + "\n----------------------------------"
                      + "\n  At anytime you may..."
                      + "\nD - Display the map"
                      + "\nX - Explore this scene further"
                      + "\nL - List your supplies"
                      + "\nR - Report your stats"
                      + "\n----------------------------------"                   
                      + "\nQ - Quit to Game Menu"
                      + "\n----------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "N": 
                this.notAvailable();
                break;
            case "S": 
                this.enterCornfield();
                break;
            case "E": 
                this.enterGraveyard();
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
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }
    
    private void tellMore() {
        System.out.println(" This scene is the starting point for a Monk."
                       + "\n You'll be lucky if you ever return.");
    }

    private void enterCornfield() {
        CornfieldMenuView cornfieldMenuView = new CornfieldMenuView();
        cornfieldMenuView.display();
    }

    private void enterGraveyard() {
        GraveyardMenuView graveyardMenuView = new GraveyardMenuView();
        graveyardMenuView.display();
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
  
}
