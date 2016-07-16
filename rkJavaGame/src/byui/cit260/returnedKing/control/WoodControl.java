/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.WoodControlException;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Player;
import byui.cit260.returnedKing.view.ErrorView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class WoodControl {
    
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public int calcWoodCutCoin()
            throws WoodControlException {
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();

        String playerInput = null;
        int pInput = 0;
        double actualStamina = player.getActualStamina();
        double axe = 25;
        double strength = player.getStrength();

        this.console.println("How much Stamina do you want to give up toward this woodcutting job?");
        try {
            playerInput = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(WoodControl.class.getName()).log(Level.SEVERE, null, ex);
            throw new WoodControlException(" You cannot cut wood today; "
                        + "\n the varibles involved produce less than one coin.");
        }
        this.console.println("\nCurrent Stamina test " +player.getActualStamina()); //testing to see if stamina is being subtractedcraig
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
            
            player.setActualStamina( player.getActualStamina() - pInput);
            this.console.println("\nCurrent Stamina test " + player.getActualStamina()); //testing to see if stamina is being subtracted

            // calculate the coin earned based on the Stamina sacrificed
            double e_coin = (staminaGiven * (strength + axe) * (actualStamina / 100)) / 100;

            if (e_coin < 1) {
                throw new WoodControlException(" You cannot cut wood today; "
                        + "\n the varibles involved produce less than one coin.");
            }

            this.console.println("You earned " + (Math.round(e_coin)) + " coins.");

            return (int)Math.round(e_coin);

        } catch (NumberFormatException nf) {

            int staminaGiven = pInput;

            
             throw new WoodControlException("\n*** You must enter a valid number ***");
        }
        
    }

}
