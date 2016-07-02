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

public class PrisonMenuView extends View {

    public PrisonMenuView() {
                 super( "\n"
                      + "\n----------------------------------"
                      + "\n|            Prison              |"
                      + "\n----------------------------------"
                      + "\n Your options for this scene are:"
                      + "\n1 - Talk to guard"
                      + "\n2 - Talk to prisoner"
                      + "\n3 - Apply for a prison job"   
                      + "\n----------------------------------"
                      + "\nN - Move North (not available)"
                      + "\nS - Move South"
                      + "\nE - Move East (not available)"
                      + "\nW - Move West"
                      + "\n----------------------------------"
                      + "\n  At anytime you may use D-X-L-R"
                      + "\n----------------------------------"                   
                      + "\nQ - Quit to Game Menu"
                      + "\n----------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "1": 
                this.guardTalk();
                break;
            case "2": 
                this.prisonerTalk();
                break;
            case "3": 
                this.getJob();
                break;
            case "N": 
                this.notAvailable();
                break;
            case "S": 
                this.enterForest();
                break;
            case "E": 
                this.noEntry();
                break;
            case "W": 
                this.enterNorthRoad();
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
        System.out.println(" Learn what you can inside and outside the prison."
                       + "\n Earn 20 coins for working a job as a guard.");
    }

    private void enterForest() {
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
    }

    private void enterNorthRoad() {
        RoadNorthMenuView roadNorthMenuView = new RoadNorthMenuView();
        roadNorthMenuView.display();
    }
    
    private void notAvailable() {
        System.out.println(" You may not leave the kingdom until"
                       + "\n you kill your uncle or die trying.");
    }
    
    private void noEntry() {
        System.out.println(" You may not return to the Warrior Village."
                       + "\n Trust in your fighting skills.");
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

    private void guardTalk() {
        System.out.println("*** stub to guardTalks() function ***");
    }

    private void prisonerTalk() {
        System.out.println("*** stub to prisonerTalks() function ***");
    }

    private void getJob() {
        System.out.println("*** stub to getsJob() function ***");
    }
  
}