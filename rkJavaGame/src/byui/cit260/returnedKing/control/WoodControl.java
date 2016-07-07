/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.WoodControlException;
import byui.cit260.returnedKing.view.CutWoodMenuView;
import byui.cit260.returnedKing.view.View;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaelcavey
 */
public class WoodControl extends View {

    public double calcWoodCutCoin()
            throws WoodControlException {

        String playerInput = null;
        int pInput = 0;
        double actualStamina = 100;
        double axe = 25;
        double strength = 50;

        System.out.println("How much Stamina do you want to give up toward this woodcutting job?");
        try {
            playerInput = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(WoodControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            pInput = Integer.parseInt(playerInput);
            int staminaGiven = pInput;

            if (staminaGiven < 1 || staminaGiven > actualStamina || actualStamina > 100) {
                throw new WoodControlException(" The stamina you gave is outside acceptable boundries."
                        + "\n Enter a value between 1 & 100 and less than your available Stamina.");
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
            double e_coin = (staminaGiven * (strength + axe) * (actualStamina / 100)) / 100;

            if (e_coin < 1) {
                throw new WoodControlException("You cannot cut wood; the varibles involved produce less than one coin.");
            }

            System.out.println("You earned " + (Math.round(e_coin)) + " coins.");

            return e_coin;

        } catch (NumberFormatException nf) {

            int staminaGiven = pInput;

            System.out.println("\n You must enter a valid number.");
        }
        return pInput;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
