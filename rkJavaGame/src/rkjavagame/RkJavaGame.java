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
import byui.cit260.returnedKing.model.Scene;
import byui.cit260.returnedKing.model.Wood;
import byui.cit260.returnedKing.model.Combat;

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
        
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("castle");
        sceneOne.setBlockedLocation("westRoad");
        sceneOne.setPublicInfo("publicInfo");
        sceneOne.setPrivateInfo("privateInfo");
        sceneOne.setActivityType("activityType");
        sceneOne.setActivityScore(100);
        sceneOne.setEnemyType("enemyType");
        sceneOne.setEnemySpecialSkill("enemySpecialSkill");
        sceneOne.setFinalCombat("finalCombat");
        sceneOne.setFinalRevelation("finalRevelation");
        sceneOne.setCharacterType("characterType");
        sceneOne.setCharacterSpecialSkill("characterSpecialSkill");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        Wood woodOne = new Wood();
        
        woodOne.setCharStamina(50);
        woodOne.setCharStrength(40);
        woodOne.setReward(5);
        woodOne.setPlayerInput(12);
        woodOne.setActualStamina(48);
        woodOne.setMaxStamina(100);
        woodOne.setAxeBonus(8);
        
        String woodInfo = woodOne.toString();
        System.out.println(woodInfo);
        
        Combat combatOne = new Combat();
        
        combatOne.setDamageGiven(20);
        combatOne.setDamageReceived(20);
        combatOne.setPlayerStrength(100);
        combatOne.setPlayerInteligence(100);
        combatOne.setAttackItems(5);
        combatOne.setDefenceItems(5);
        combatOne.setPlayerInput(10);
        
        String combatInfo = combatOne.toString();
        System.out.println(combatInfo);
        
        
           
    }
    
} 
