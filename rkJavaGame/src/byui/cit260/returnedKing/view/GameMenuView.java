/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import java.util.Scanner;
import static javax.management.Query.value;
import rkjavagame.RkJavaGame;

/**
 *
 * @author thiag 
 * 
 */

public class GameMenuView extends View {
    private int getInput;
    
    public GameMenuView() {
                 super( "\n"
                      + "\n-------------------------------"
                      + "\n|          Game Menu          |"
                      + "\n-------------------------------"
                      + "\nP - Player Type"
                      + "\nI - Item List"
                      + "\nM - Map Display"
                      + "\nV - Move to new location"
                      + "\nH - Move player to Hunter Reserve for CompetionControl test"   
                      + "\n2 - Character with the maximum strength"
                      + "\nQ - Quit to Main Menu"
                      + "\n-------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "P": 
                this.playerType();
                break;
            case "I": 
                this.itemList();
                break;
            case "M": 
                this.mapView();
                break;
            case "V": 
                this.movePlayer();
                break;
            case "H": 
                this.huntRes();
                break;
            case "2":
//  CALL        this.parseInt(Double number); ??
                this.maxStrength();
                break;
                    
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
    
    private void playerType() {       
        PlayerTypeMenuView playerTypeMenuView = new PlayerTypeMenuView();
        playerTypeMenuView.display();
    }
    
    private void mapView() {        
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }
    
    private void itemList() {        
        ItemListMenuView itemListMenuView = new ItemListMenuView();
        itemListMenuView.display();
    }    

    private void movePlayer() {
        PlayerMoveMenuView playerMoveMenuView = new PlayerMoveMenuView();
        playerMoveMenuView.display();
    }
    
    private void maxStrength() {
        
//        CALL parseInt(Double number) ??        
        GameControl gameC = new GameControl();
        gameC.mStrength();
        int strength = gameC.mStrength();
        
        System.out.println("\nThe highest character strength is " + strength);
        }

    public Double parseInt(Double number) {

        while (number == null) {

            int value = this.getInput; 
            
            if (number.equals("Q")) {
                break;
            }
            
        try {
            
            number = parseInt(number);
            
        } catch (NumberFormatException nf) {
            
            System.out.println("\n You must enter a valid number."
                    + " Try again or enter Q to quit");
                }
        
                break;
        }
        return number;
    }
    
    private void huntRes() {
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
    }
}