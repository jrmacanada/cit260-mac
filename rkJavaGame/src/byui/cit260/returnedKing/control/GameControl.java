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

// L09 Individual-Craig
    public int mStrength() {
        int maxValue = 0;
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
