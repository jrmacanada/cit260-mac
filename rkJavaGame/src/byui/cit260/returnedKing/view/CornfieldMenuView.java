/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.control.MapControl;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */

public class CornfieldMenuView extends View {
    private Map map;

    public CornfieldMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n|            Cornfield             |"
                + "\n------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Rest to rebuild Stamina"
                + "\n2 - Forage for food"
               // + "\n3 - Work with farmer"
                + "\n------------------------------------"
                + "\n    To navigate, enter N-S-E-W"
                + "\n------------------------------------"
                + "\n  At anytime you may use M-X-L-R"
//                + "\n------------------------------------"
//                + "\nQ - Quit to Game Menu"
                + "\n------------------------------------"
                + "\nZ - Exit game from this scene"
                + "\n------------------------------------");

// TODO Position player to this map location when menu is activated ***
//        Map map = MapControl.createMap(); // create and intialize new map
//        game.setMap(map); // save map in game

        // move actors to starting position in the map
//        MapControl.movePlayerToStartingLocation(map);
        
//        Map map = null;
        // reset player to retreat position in the map
//        Map map = MapControl.movePlayerToCornfield(map);
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
//            case "3": 
//                this.getJob();
//                break;
            case "N": 
                this.noEntry();
                break;
            case "S": 
                this.movePlayer();
                break;
            case "E": 
                this.movePlayer();
                break;
            case "W": 
                this.notAvailable();
                break;
            case "M": 
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
            case "Z":
                this.exitGame();
                break;
                
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }
    
    private void tellMore() {
        Game game = RkJavaGame.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
//        Location[][] locations = map.getLocations(); // retreive the locations from map
        this.console.print(map.getCurrentLocation().getScene().getDescription());
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
        PlayerStatsView stats = new PlayerStatsView();
        stats.StatDisplay();
    }

    private void addStamina() {
        this.console.println(" Rest in the cornfield and rebuild your stamina by 10 points.");
        GameControl rest = new GameControl();
        rest.restStamina();
    }

    private void getFood() {
        GameControl gameC = new GameControl();
        gameC.findFood();
    }

//    private void getJob() {
//        this.console.println(" You can work ing the fields for 10 coins per day.");
//    }
  
    public void movePlayer() {
// <editor-fold defaultstate="collapsed" desc="Navigation. Click on the + sign to OPEN.">
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.displayMap();

        this.console.println("Enter N-S-E-W");
        try {
            String pInput = keyboard.readLine().toUpperCase();
            Point pt = getLocation(pInput);
            if (pt == null) {
                this.console.println("Cannot move " + pInput);
            } else {
                Map map = RkJavaGame.getCurrentGame().getMap();
                MapControl.movePlayer(map, pt.x, pt.y);
                mapMenuView.displayMap();
                this.doLocationAction(map.getCurrentLocation().getScene().getMapSymbol());
            }
        } catch (IOException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void doLocationAction(String locationSymbol) {

        locationSymbol = locationSymbol.toUpperCase(); //convert value to uppercase
// <editor-fold defaultstate="collapsed" desc="25 Switch Options. Click on the + sign to OPEN.">
        switch (locationSymbol) {
            case "MM":
                MonkStartView monkStartView = new MonkStartView();
                monkStartView.display();
                break;
            case "GY":
                GraveyardMenuView graveyardMenuView = new GraveyardMenuView();
                graveyardMenuView.display();
                break;
            case "NR":
                RoadNorthMenuView roadNorthMenuView = new RoadNorthMenuView();
                roadNorthMenuView.display();
                break;
            case "PP":
                PrisonMenuView prisonMenuView = new PrisonMenuView();
                prisonMenuView.display();
                break;
            case "WV":
                WarriorStartView warriorStartView = new WarriorStartView();
                warriorStartView.display();
                break;
            case "CF":
                CornfieldMenuView cornfieldMenuView = new CornfieldMenuView();
                cornfieldMenuView.display();
                break;
            case "FV":
                FarmVillageMenuView farmVillageMenuView = new FarmVillageMenuView();
                farmVillageMenuView.display();
                break;
            case "NG":
                GateNorthMenuView gateNorthMenuView = new GateNorthMenuView();
                gateNorthMenuView.display();
                break;
            case "FF":
                ForestMenuView forestMenuView = new ForestMenuView();
                forestMenuView.display();
                break;
            case "TT":
                TavernMenuView tavernMenuView = new TavernMenuView();
                tavernMenuView.display();
                break;
            case "WR":
                RoadWestMenuView roadWestMenuView = new RoadWestMenuView();
                roadWestMenuView.display();
                break;
            case "WG":
                GateWestMenuView gateWestMenuView = new GateWestMenuView();
                gateWestMenuView.display();
                break;
            case "XX":
                CastleMenuView castleMenuView = new CastleMenuView();
                castleMenuView.display();
                break;
            case "EG":
                GateEastMenuView gateEastMenuView = new GateEastMenuView();
                gateEastMenuView.display();
                break;
            case "ER":
                RoadEastMenuView roadEastMenuView = new RoadEastMenuView();
                roadEastMenuView.display();
                break;
            case "KH":
                KhouseMenuView khouseMenuView = new KhouseMenuView();
                khouseMenuView.display();
                break;
            case "HR":
                HuntReserveView huntReserveView = new HuntReserveView();
                huntReserveView.display();
                break;
            case "SG":
                GateSouthMenuView gateSouthMenuView = new GateSouthMenuView();
                gateSouthMenuView.display();
                break;
            case "TS":
                TownshipMenuView townshipMenuView = new TownshipMenuView();
                townshipMenuView.display();
                break;
            case "CC":
                ChurchMenuView churchMenuView = new ChurchMenuView();
                churchMenuView.display();
                break;
            case "WH":
                WizardStartView wizardStartView = new WizardStartView();
                wizardStartView.display();
                break;
            case "SC":
                SecretCaveMenuView secretCaveMenuView = new SecretCaveMenuView();
                secretCaveMenuView.display();
                break;
            case "SR":
                RoadSouthMenuView roadSouthMenuView = new RoadSouthMenuView();
                roadSouthMenuView.display();
                break;
            case "HT":
                HarbortownMenuView harbortownMenuView = new HarbortownMenuView();
                harbortownMenuView.display();
                break;
            case "SP":
                SeaportMenuView seaportMenuView = new SeaportMenuView();
                seaportMenuView.display();
                break;
// </editor-fold>
            default:
                this.console.println("There's nothing to do here.");
                break;
        }
    }

// Put into Map Control     
    private Point getLocation(String pInput) {
        Point point = new Point();
        Map map = RkJavaGame.getCurrentGame().getMap();
        Location location = map.getCurrentLocation();
        point.x = location.getRow();
        point.y = location.getColumn();

        switch (pInput) {
            case "N":
                if (point.x > 0) {
                    point.x--;
                } else {
                    return null;
                }
                break;
            case "S":
                if (point.x < 4) {
                    point.x++;
                } else {
                    return null;
                }
                break;
            case "E":
                if (point.y < 4) {
                    point.y++;
                } else {
                    return null;
                }
                break;
            case "W":
                if (point.y > 0) {
                    point.y--;
                } else {
                    return null;
                }
                break;
            default:
                return null;
        }
        return point;
    }// </editor-fold>
    
    private void exitGame() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
//    public void movePlayerToStartingLocation(Map map) {
//        resetPlayer(map, 1, 0);
//    }
//
//    public void resetPlayer(Map map, int row, int column) {
//        map.setCurrentLocation(map.getLocations()[row][column]);
//        map.getCurrentLocation().setVisited(true);
//
//        map.setCurrentRow(row);
//        map.setCurrentColumn(column);
//    }

}
