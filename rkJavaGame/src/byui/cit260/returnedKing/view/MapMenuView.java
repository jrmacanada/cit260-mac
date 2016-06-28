/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import byui.cit260.returnedKing.model.Scene;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */

public class MapMenuView extends View {
//    private int monasteryScene;
//    private Object[] Scene;
    
    public MapMenuView() {
                 super( "\n"
                      + "\n--------------------------------"
                      + "\n|           Map Menu           |"
                      + "\n--------------------------------"
                      + "\nD - Display Map"  
                      + "\n"
                      + "\n   To explore the different"
                      + "\n   game scenes, enter the two"
                      + "\n   digit code shown on map"
                      + "\n"
                      + "\nQ - Quit to Game Menu"
                      + "\n--------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        Game game = RkJavaGame.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
//        Scene scene = map.getScene();
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "D":
                this.displayMap();
                break;
            case "MM": 
                System.out.print(map.locations[0][0].getScene().getDescription());
                break;
            case "GY": 
                System.out.print(map.locations[0][1].getScene().getDescription());
                break;
            case "NR": 
                System.out.print(map.locations[0][2].getScene().getDescription());
                break;
            case "PP": 
                System.out.print(map.locations[0][3].getScene().getDescription());
                break;
            case "WV": 
                System.out.print(map.locations[0][4].getScene().getDescription());
                break;
            case "CF": 
                System.out.print(map.locations[1][0].getScene().getDescription());
                break;
            case "FV": 
                System.out.print(map.locations[1][1].getScene().getDescription());
                break;
            case "NG": 
                System.out.print(map.locations[1][2].getScene().getDescription());
                break;
            case "FF": 
                System.out.print(map.locations[1][3].getScene().getDescription());
                break;
            case "TT": 
                System.out.print(map.locations[1][4].getScene().getDescription());
                break;
            case "WR": 
                System.out.print(map.locations[2][0].getScene().getDescription());
                break;
            case "WG": 
                System.out.print(map.locations[2][1].getScene().getDescription());
                break;
            case "XX": 
                System.out.print(map.locations[2][2].getScene().getDescription());
                break;
            case "EG": 
                System.out.print(map.locations[2][3].getScene().getDescription());
                break;
            case "ER": 
                System.out.print(map.locations[2][4].getScene().getDescription());
                break;
            case "KH": 
                System.out.print(map.locations[3][0].getScene().getDescription());
                break;
            case "HR": 
                System.out.print(map.locations[3][1].getScene().getDescription());
                break;
            case "SG": 
                System.out.print(map.locations[3][2].getScene().getDescription());
                break;
            case "TS": 
                System.out.print(map.locations[3][3].getScene().getDescription());
                break;
            case "CC": 
                System.out.print(map.locations[3][4].getScene().getDescription());
                break;
            case "WH": 
                System.out.print(map.locations[4][0].getScene().getDescription());
                break;
            case "SC": 
                System.out.print(map.locations[4][1].getScene().getDescription());
                break;
            case "SR": 
                System.out.print(map.locations[4][2].getScene().getDescription());
                break;
            case "HT": 
                System.out.print(map.locations[4][3].getScene().getDescription());
                break;
            case "SP": 
                System.out.print(map.locations[4][4].getScene().getDescription());
                break;
                    
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
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

//    private void monastaryScene() {
//        
//        Game game = RkJavaGame.getCurrentGame(); // retreive the game
//        Map map = game.getMap(); // retreive the map from game
//
//        System.out.print(map.getCurrentLocation().getScene().getDescription());
//
//    }
    
    
}
