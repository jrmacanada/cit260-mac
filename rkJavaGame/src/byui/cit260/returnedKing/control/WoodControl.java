/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.MapControlException;

/**
 *
 * @author michaelcavey
 */

public class WoodControl {
    
    public double calcWoodCutCoin(int staminaGiven, int strength, int axe, double actualStamina, int p_coin) {
    
        if (staminaGiven < 1 || staminaGiven > actualStamina || actualStamina > 100) {
                throw new MapControlException("Exception to be determinated later1");
        }
        if (strength < 1 || strength > 100) {
                throw new MapControlException("Exception to be determinated later2");
        }
        if (axe != 25 && axe != 50 && axe != 75) {
                throw new MapControlException("Exception to be determinated later3");
        }
        if (p_coin < 0) {
                throw new MapControlException("Exception to be determinated later4");
        }
        
        // calculate the coin earned based on the Stamina sacrificed
        double e_coin = (staminaGiven * (strength + axe) * (actualStamina/100)) / 100;
        
        if (e_coin < 1) {
                throw new MapControlException("Exception to be determinated later5");
        }
        
        // add earned coin to players existing coin
        // p_coin = p_coin + e_coin;
        
        // subtract the Stamina used from the started Stamina 
        // actualStamina = actualStamina - staminaGiven;
                
        // return actualStamina;
        // return p_coin;
        
        return e_coin;
        
    }
    
}

