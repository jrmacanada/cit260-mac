/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class ItemListMenuView {

    public void display() {
        StringBuilder line;

        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();

        System.out.println("\n       LIST OF ITEMS");
        line = new StringBuilder("                                        ");
        line.insert(0, "DESCRIPTION");
        line.insert(15, "QUANTITY");
        line.insert(25, "UNIT PRICE");
        System.out.println(line.toString());

        for (Item item : items) {
            line = new StringBuilder("                                        ");
            line.insert(0, item.getDescription());
            line.insert(18, item.getQuantityInStock());
            line.insert(28, item.getUnitPrice());

            System.out.println(line.toString());
        }

        GameControl totalPrice = new GameControl();
        totalPrice.buyOneEach();

        int sumAllItems = totalPrice.buyOneEach();

        System.out.println("\n The price to buy one of each item is " + sumAllItems + " coins");

    }

}
