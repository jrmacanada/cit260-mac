/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

/**
 *
 * @author michaelcavey
 */

public class WoodControl {
    
    public double calcWoodCutCoin(int staminaGiven, int strength, int axe, double actualStamina, int p_coin) {
    
        if (staminaGiven < 1 || staminaGiven > actualStamina || actualStamina > 100) {
                return -1;
        }
        if (strength < 1 || strength > 100) {
                return -1;
        }
        if (axe != 25 && axe != 50 && axe != 75) {
                return -1;
        }
        if (p_coin < 0) {
                return -1;
        }
        
        // calculate the coin earned based on the Stamina sacrificed
        double e_coin = (staminaGiven * (strength + axe) * (actualStamina/100)) / 100;
        
        // add earned coin to players existing coin
        // p_coin = p_coin + e_coin;
        
        // subtract the Stamina used from the started Stamina 
        // actualStamina = actualStamina - staminaGiven;
                
        // return new p_coin value;
        // return p_coin;
        
        return e_coin;
        
    }
    
}

