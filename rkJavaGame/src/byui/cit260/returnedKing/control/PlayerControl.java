/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.model.Map;

/**
 *
 * @author michaelcavey
 */
public class PlayerControl {
    
    public static double strength = 100;
    public static double actualStamina = 80;
    public static double stamina = 80;
    public static double intellegence = 10;
    public static double offence;
    public static double defence;
    
//    public static class startWizard {
//
//        public startWizard() {
//            
//            strength = 50;
//            actualStamina = 80;
//            stamina = 80;
//            intellegence = 100;
//            //offence
//            //defence
//            
//        }
//    }

// TODO activate call to this function to relocate map/player to specified position ***
    public static void movePlayerToCornfield(Map map) {
        resetPlayer(map, 1, 0);
    }

    public static void resetPlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }
    
    
}
