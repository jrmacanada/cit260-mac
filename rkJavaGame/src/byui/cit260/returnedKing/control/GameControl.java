/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Map;
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
         
         Game game = new Game(); // create new game
         RkJavaGame.setCurrentGame(game); // save in RkJavaGame
         
         game.setPlayer(player); // save player game
         
         // create the Item list and save in the game
         Item[] itemList = GameControl.createItemsList();
         game.setItems(itemList);
         
         Map map = MapControl.createMap(); // create and intialize new map
         game.setMap(map); // save map in game
         
         // move actors to starting position in the map
         MapControl.movePlayerToStartingLocation(map);
         
        }

    public int buyOneEach(int totalPrice) {
        
        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();
        
//        int totalPrice = 0;
        
        for (Item item : items) {
            totalPrice += item.getUnitPrice();
        }    
        System.out.println("\n [Control Layer] The price to buy one of each item is " + totalPrice + " coins");
        return totalPrice;
    }
    
     public enum Index {
         food,
         sword,
         shield,
         orb;
     }
     
    public static Item[] createItemsList() {
        
        // create array(list) of available items
        Item[] items = new Item[4];
        
        Item food = new Item();
        food.setDescription("Food");
        food.setQuantityInStock(100);
        food.setUnitPrice(3);
        items[Index.food.ordinal()] = food;
        
        Item sword = new Item();
        sword.setDescription("Sword");
        sword.setQuantityInStock(1);
        sword.setUnitPrice(15);
        items[Index.sword.ordinal()] = sword;
        
        Item shield = new Item();
        shield.setDescription("Shield");
        shield.setQuantityInStock(1);
        shield.setUnitPrice(10);
        items[Index.shield.ordinal()] = shield;
        
        Item orb = new Item();
        orb.setDescription("Orb");
        orb.setQuantityInStock(1);
        orb.setUnitPrice(20);
        items[Index.orb.ordinal()] = orb;
        
            return items;
    }
    
    public int mStrength() {
        int maxValue = 0;
        for (Actor act : Actor.values()) {
            maxValue = Math.max(act.playerStrength, maxValue);
        }
        System.out.println("\n[Control Layer] The highest character strength is " + maxValue);
        return maxValue;

    }
    

}
