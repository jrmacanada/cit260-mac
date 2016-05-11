/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rkjavagame;

import byui.cit260.returnedKing.model.Player;
import byui.cit260.returnedKing.model.Character;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Items;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;

/**
 *
 * @author michaelcavey
 */
public class RkJavaGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestScore(360);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Character characterOne = new Character();
        
        characterOne.setName("Barney Rubble");
        characterOne.setType("neighbor");
        characterOne.setCoordinates(15);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        Game gameOne = new Game();
        
        gameOne.setStart("Returned King");
        gameOne.setNumCode(9876);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Items itemOne = new Items();
        
        itemOne.setInventoryType("Weapon");
        itemOne.setQuantityInStock(5);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Location locationOne = new Location();
        
        locationOne.setRow(4);
        locationOne.setColumn(3);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(2);
        mapOne.setColumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
    }
    
} 
