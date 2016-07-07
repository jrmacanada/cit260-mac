/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class MapMenuView extends View {

    public MapMenuView() {
        super("\n"
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

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "D":
                this.displayMap();
                break;
            case "MM":
                this.console.print(map.locations[0][0].getScene().getDescription());
                break;
            case "GY":
                this.console.print(map.locations[0][1].getScene().getDescription());
                break;
            case "NR":
                this.console.print(map.locations[0][2].getScene().getDescription());
                break;
            case "PP":
                this.console.print(map.locations[0][3].getScene().getDescription());
                break;
            case "WV":
                this.console.print(map.locations[0][4].getScene().getDescription());
                break;
            case "CF":
                this.console.print(map.locations[1][0].getScene().getDescription());
                break;
            case "FV":
                this.console.print(map.locations[1][1].getScene().getDescription());
                break;
            case "NG":
                this.console.print(map.locations[1][2].getScene().getDescription());
                break;
            case "FF":
                this.console.print(map.locations[1][3].getScene().getDescription());
                break;
            case "TT":
                this.console.print(map.locations[1][4].getScene().getDescription());
                break;
            case "WR":
                this.console.print(map.locations[2][0].getScene().getDescription());
                break;
            case "WG":
                this.console.print(map.locations[2][1].getScene().getDescription());
                break;
            case "XX":
                this.console.print(map.locations[2][2].getScene().getDescription());
                break;
            case "EG":
                this.console.print(map.locations[2][3].getScene().getDescription());
                break;
            case "ER":
                this.console.print(map.locations[2][4].getScene().getDescription());
                break;
            case "KH":
                this.console.print(map.locations[3][0].getScene().getDescription());
                break;
            case "HR":
                this.console.print(map.locations[3][1].getScene().getDescription());
                break;
            case "SG":
                this.console.print(map.locations[3][2].getScene().getDescription());
                break;
            case "TS":
                this.console.print(map.locations[3][3].getScene().getDescription());
                break;
            case "CC":
                this.console.print(map.locations[3][4].getScene().getDescription());
                break;
            case "WH":
                this.console.print(map.locations[4][0].getScene().getDescription());
                break;
            case "SC":
                this.console.print(map.locations[4][1].getScene().getDescription());
                break;
            case "SR":
                this.console.print(map.locations[4][2].getScene().getDescription());
                break;
            case "HT":
                this.console.print(map.locations[4][3].getScene().getDescription());
                break;
            case "SP":
                this.console.print(map.locations[4][4].getScene().getDescription());
                break;

            default:
                this.console.println("\n*** Invalid Selection *** Try again");
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
            this.console.print("  |");
            for (int column = 0; column < locations[0].length; column++) {
                this.console.print("  " + column + " |"); // print col numbers to side of map
            }
            this.console.println();
            for (int row = 0; row < locations.length; row++) {
                this.console.print(row + " "); // print row numbers to side of map
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
                    this.console.print("|"); // start map with a |
                    if (locations[row][column].getScene() == null) {
                        this.console.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        this.console.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
                    }
                }
                this.console.println("|");
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "*** Error ***");
        }
    }

}
