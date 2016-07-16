/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.GameControlException;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Map;
import byui.cit260.returnedKing.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class GameControl {

    public static Player createPlayer(String name)
            throws GameControlException {
        if (name == null) {
            throw new GameControlException("Invalid player name. Could not create player.");
        }
        try {
            Player player = new Player();
            player.setName(name);

            RkJavaGame.setPlayer(player); //save the player

            return player;
        } catch (Exception e) {
            throw new GameControlException("Error creating player. " + e.getMessage());
        }
    }

    public static void createNewGame(Player player) {

        Game game = new Game(); // create new game
        RkJavaGame.setCurrentGame(game); // save in RkJavaGame

        game.setPlayer(player); // save player game

        // create the Item list and save in the game
        Item[] itemList = GameControl.createItemsList();
        game.setItems(itemList);
        
        player.setInventory(ItemControl.InitializeInventoryItems());

        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); // save map in game

        // move actors to starting position in the map
        MapControl.movePlayerToStartingLocation(map);
    }

    public static void saveGame(Game game, String filepath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game); // write the game object to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filepath)
            throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); // read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        RkJavaGame.setCurrentGame(game);
    }

    public enum Index {

        food,
        sword,
        shield,
        orb,
        coin,
        woodAxe,
        hatchet,
        battleAxe,
        fathersSword,
        bodyArmor,
        birthCert,
        huntBow;        
    }

    public static Item[] createItemsList() {

        // create array(list) of available items
        Item[] items = new Item[12];

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
        
        Item coin = new Item();
        coin.setDescription("Coin");
        coin.setQuantityInStock(10);
        coin.setUnitPrice(0);
        items[Index.coin.ordinal()] = coin;
        
        Item woodAxe = new Item();
        woodAxe.setDescription("Wood cutting axe");
        woodAxe.setQuantityInStock(1);
        woodAxe.setUnitPrice(10);
        items[Index.woodAxe.ordinal()] = woodAxe;
        
        Item hatchet = new Item();
        hatchet.setDescription("Hatchet");
        hatchet.setQuantityInStock(1);
        hatchet.setUnitPrice(5);
        items[Index.hatchet.ordinal()] = hatchet;
        
        Item battleAxe = new Item();
        battleAxe.setDescription("Battle Axe");
        battleAxe.setQuantityInStock(1);
        battleAxe.setUnitPrice(15);
        items[Index.battleAxe.ordinal()] = battleAxe;
        
        Item fathersSword = new Item();
        fathersSword.setDescription("Father's Sword");
        fathersSword.setQuantityInStock(1);
        fathersSword.setUnitPrice(0);
        items[Index.fathersSword.ordinal()] = fathersSword;
        
        Item bodyArmor = new Item();
        bodyArmor.setDescription("Body Armor");
        bodyArmor.setQuantityInStock(1);
        bodyArmor.setUnitPrice(20);
        items[Index.bodyArmor.ordinal()] = bodyArmor;
        
        Item birthCert = new Item();
        birthCert.setDescription("Birth Certificate");
        birthCert.setQuantityInStock(1);
        birthCert.setUnitPrice(0);
        items[Index.birthCert.ordinal()] = birthCert;
        
        Item huntBow = new Item();
        huntBow.setDescription("Hunting Bow");
        huntBow.setQuantityInStock(1);
        huntBow.setUnitPrice(10);
        items[Index.huntBow.ordinal()] = huntBow;

        return items;
    }

// L09 Individual-Craig
    public double mStrength() {
        double maxValue = 0;
        for (Actor act : Actor.values()) {
            maxValue = Math.max(act.actorStrength, maxValue);
        }
        return maxValue;
    }

// L09 Individual-Mike
    public int buyOneEach() {

        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();

        int totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getUnitPrice();
        }
        return totalPrice;
    }
}
