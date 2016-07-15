/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.ItemControlException;
import byui.cit260.returnedKing.model.Item;
import java.util.ArrayList;

/**
 *
 * @author michaelcavey
 */
public class ItemControl {

public ArrayList<Item> addInventoryItems() {
    ArrayList<Item> inventory = new ArrayList<>();
    
    Item coin = new Item();
    inventory.add(coin);
    
    Item sword = new Item();
    inventory.add(sword);
    
    Item food = new Item();
    inventory.add(food);
    
    Item shield = new Item();
    inventory.add(shield);
    
    return inventory;
    
      
    
}
    
}
