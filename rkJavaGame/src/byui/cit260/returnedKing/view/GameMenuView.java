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
import rkjavagame.RkJavaGame;

/**
 *
 * @author thiag (original to line 16)
 * @author cavey (as temp menu for access to scene views)
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
                 super( "\n"
                      + "\n-------------------------------"
                      + "\n|          Game Menu          |"
                      + "\n-------------------------------"
                      + "\nP - Player Type"
                      + "\nI - Item List"
                      + "\nM - Map Display"
                      + "\nV - Move to new location"
                      + "\nS - Character with the maximum strength"
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
                this.displayMap();
                break;
            case "V": 
                this.movePlayer();
                break;
            case "S": 
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
    
//    private void itemList() {
//        
//        ItemListMenuView itemListMenuView = new ItemListMenuView();
//        itemListMenuView.display();
//    }
    
    private void itemList() {
        StringBuilder line;
        
        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();
        
        System.out.println("\n       LIST OF ITEMS");
        line = new StringBuilder("                                        ");
        line.insert(0, "DESCRIPTION");
        line.insert(15, "QUANTITY");
        line.insert(25, "UNIT PRICE");
        System.out.println(line.toString());
        
        for (Item item : items) {
            line = new StringBuilder("                                        ");
            line.insert(0, item.getDescription());
            line.insert(18, item.getQuantityInStock());
            line.insert(28, item.getUnitPrice());
            
            System.out.println(line.toString());
        }
        
        int totalPrice = 0;
        
        for (Item item : items) {
            totalPrice += item.getUnitPrice();
        }
        
        System.out.println("\n The price to buy one of each item is " + totalPrice + " coins");
    }
    
    public void displayMap() {
        String leftIndicator;
        String rightIndicator;

        Game game = RkJavaGame.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        try {
            System.out.print("  |");
            for (int column = 0; column < locations[0].length; column++) {
                System.out.print("  " + column + " |"); // print col numbers to side of map
            }
            System.out.println();
            for (int row = 0; row < locations.length; row++) {
                System.out.print(row + " "); // print row numbers to side of map
                for (int column = 0; column < locations[row].length; column++) {
                    leftIndicator = " ";
                    rightIndicator = " ";
                    if (locations[row][column] == map.getCurrentLocation()) {
                        leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "*"; // same as above
                    } else if (locations[row][column].isVisited()) {
                        leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "<"; // same as above
                    }
                    System.out.print("|"); // start map with a |
                    if (locations[row][column].getScene() == null) {
                        System.out.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        System.out.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
                    }
                }
                System.out.println("|");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private void movePlayer() {
        System.out.println("\n * call to movePlayer() function");
    }
    
    private void maxStrength() {
        GameControl gameC = new GameControl();
        gameC.mStrength();
        int strength = gameC.mStrength();
        
        System.out.println("\nThe highest character strength is " + strength);
        }
    }
    

