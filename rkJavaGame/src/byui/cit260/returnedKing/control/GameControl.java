/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.model.Player;
import rkjavagame.RkJavaGame;

/**
 * 05-26-2016 Recommit with proper message
 * @author michaelcavey
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        RkJavaGame.setPlayer(player); //save the player
        
        return player;
    }
    
     public static void createNewGame(Player player) {
            System.out.println("\n*Create NewGame stub function*");
        }
}
