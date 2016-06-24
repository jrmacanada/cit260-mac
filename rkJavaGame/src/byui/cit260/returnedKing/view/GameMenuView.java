/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.util.Scanner;

/**
 *
 * @author thiag (original to line 16)
 * @author cavey (as temp menu for access to scene views)
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n| Game Menu (temporary access to views)  |"
                      + "\n------------------------------------------"
                      + "\nF - Go to the Forest scene"
                      + "\nK - Go to the King's House scene"
                      + "\nH - Go to the Hunting Reserve Scene"
                      + "\nT - Go to the Tavern"  
                      + "\nW - Go to the West Road"   
                      + "\nE - Go to the East Road" 
                      + "\nN - Go to the North Road"   
                      + "\nS - Go to the South Road"  
                      + "\nC - Go to the Church"   
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "F": //opens the Forest scene
                this.goToForest();
                break;
            case "K": //opens the King's House scene
                this.goToKhouse();
                break;
            case "H": // opens the Hunting Reserve scene
                this.goToHuntReserve();
                break;
            case "T": // opens the Tavernscene
                this.goToTavern();
                break;
            case "W": // opens the West Road scene
                this.goToWestRoad();
                break;
            case "E": // opens the East Road scene
                this.goToEastRoad();
                break;
            case "N": // opens the North Road scene
                this.goToNorthRoad();
                break;
            case "S": // opens the South Road scene
                this.goToSouthRoad();
                break;
            case "C": // opens the Church scene    
                this.goToChurch();
                break;
                
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void goToForest() {
        // opens the Forest scene
//mac??        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the Forest menu 
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
//        System.out.println("*Calls the goToForest() function*");
    }
    
    private void goToKhouse() {
        // opens the King's House scene
//mac??        GameControl.createNewGame(RkJavaGame.getPlayer());
        
        // display the King's House menu 
        KhouseMenuView khouseMenuView = new KhouseMenuView();
        khouseMenuView.display();
//        System.out.println("*Calls the goToKhouse() function*");
    }
    
    private void goToHuntReserve() {
        
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
    }
    
    private void goToTavern() {
        
        TavernView tavernView = new TavernView();
        tavernView.display();
    }
    
    private void goToWestRoad() {
        
        RoadWestMenuView roadWestMenuView = new RoadWestMenuView();
        roadWestMenuView.display();
    }
    
    private void goToEastRoad() {
        
        RoadEastMenuView roadEastMenuView = new RoadEastMenuView();
        roadEastMenuView.display();
    }
    
    private void goToNorthRoad() {
        
        RoadNorthMenuView roadNorthMenuView = new RoadNorthMenuView();
        roadNorthMenuView.display();
    }

    private void goToSouthRoad() {
        
        RoadSouthMenuView roadSouthMenuView = new RoadSouthMenuView();
        roadSouthMenuView.display();
    }
    
    private void goToChurch() {
    
        ChurchMenuView churchMenuView = new ChurchMenuView();
        churchMenuView.display();
    }

}
