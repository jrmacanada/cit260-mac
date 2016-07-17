/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Player;
import java.util.ArrayList;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class ItemControl {

    public static ArrayList<Item> InitializeInventoryItems() {
        Game game = RkJavaGame.getCurrentGame();
        Item[] itemList = game.getItems();
        ArrayList<Item> inventory = new ArrayList<>();

        Item coin = new Item(itemList[GameControl.Index.coin.ordinal()]);
        coin.setQuantityInStock(10);
        inventory.add(coin);

        Item sword = new Item(itemList[GameControl.Index.sword.ordinal()]);
        sword.setQuantityInStock(1);
        inventory.add(sword);

        Item food = new Item(itemList[GameControl.Index.food.ordinal()]);
        food.setQuantityInStock(10);
        inventory.add(food);

        Item shield = new Item(itemList[GameControl.Index.shield.ordinal()]);
        shield.setQuantityInStock(1);
        inventory.add(shield);

        return inventory;

    }

    public static int addQuantityToInventoryItem(String itemName, int quantity) {
        Game game = RkJavaGame.getCurrentGame();
        Player player = game.getPlayer();
        ArrayList<Item> inventory = player.getInventory();
        for (Item item : inventory) {
            if (item.getDescription() == itemName) {
                item.setQuantityInStock(item.getQuantityInStock() + quantity);
                return item.getQuantityInStock();
            }

        }
        return -99999;

    }
}
