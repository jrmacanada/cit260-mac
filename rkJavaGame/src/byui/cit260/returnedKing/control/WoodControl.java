/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.WoodControlException;
import java.util.Scanner;

/**
 *
 * @author michaelcavey
 */

public class WoodControl {
    
    public double calcWoodCutCoin() 
// IS (after implementing exceptions)
                    throws WoodControlException {
        
        String playerInput;
        int pInput = 0;
        double actualStamina = 100;
        double axe = 25;
        double strength = 50;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much Stamina do you want to give up toward this woodcutting job?");
        playerInput = keyboard.nextLine();
        
        try {
        pInput = Integer.parseInt(playerInput);
        int staminaGiven = pInput;
        
        if (staminaGiven < 1 || staminaGiven > actualStamina || actualStamina > 100) {
                throw new WoodControlException(" The stamina you gave is outside acceptable boundries."
                                           + "\n Enter a value between 1 & 99 and less than your available Stamina.");
        }
        if (strength < 1 || strength > 100) {
                throw new WoodControlException(" The strength is outside acceptable boundries."
                                           + "\n Check the file system or database values");
        }
        if (axe != 25 && axe != 50 && axe != 75) {
                throw new WoodControlException(" Ax type values must be 25, 50, or 75."
                                           + "\n Check the file system or database values");
        }
        
        // calculate the coin earned based on the Stamina sacrificed
        double e_coin = (staminaGiven * (strength + axe) * (actualStamina/100)) / 100;
        
        if (e_coin < 1) {
                throw new WoodControlException("You cannot cut wood; the varibles involved produce less than one coin.");
        }
        
        System.out.println("You earned " + (Math.round(e_coin)) + " coins.");
        
// WAS (before implementing exceptions)
//        if (staminaGiven < 1 || staminaGiven > actualStamina || actualStamina > 100) {
//                return -1;
//        }
//        if (strength < 1 || strength > 100) {
//                return -1;
//        }
//        if (axe != 25 && axe != 50 && axe != 75) {
//                return -1;
//        }
//        if (p_coin < 0) {
//                return -1;
//        }
//        
//        // calculate the coin earned based on the Stamina sacrificed
//        double e_coin = (staminaGiven * (strength + axe) * (actualStamina/100)) / 100;
//        
//        if (e_coin < 1) {
//                return -1;
//        }

        // SAVE for REF ONLY (these calculations should be done after return to function call)
        // add earned coin to players existing coin
        // p_coin = p_coin + e_coin;
        
        // subtract the Stamina used from the started Stamina 
        // actualStamina = actualStamina - staminaGiven;
                
        // return actualStamina;
        // return p_coin;
        
        return e_coin;
        
        } catch (NumberFormatException nf) {
            
        int staminaGiven = pInput;
        
        System.out.println("\n You must enter a valid number.");
    } 
        return pInput;
}
}

