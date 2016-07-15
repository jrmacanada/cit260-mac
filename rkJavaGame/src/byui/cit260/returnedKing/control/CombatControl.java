/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CombatControlException;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.view.ErrorView;
import byui.cit260.returnedKing.view.MainMenuView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 * May 28, 2016
 *
 * @author thiago
 */
public class CombatControl {

    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public double damageGiven()
            throws CombatControlException {

// This whole function needs to be replaced with something that looks at the player's
// Stamina, Strength, & Aura values, asks the player how much to commit to the fight,
// and deducts 5% of that from Stamina and Strength for each round he engages in.
// The Aura should be a multiplier in the equation to make the Player more effective.
// Meanwhile the opponent's numbers, whose S-S-A values (bad actors have zero aura) 
// as retrieved from the Actors Array, are deducted from in the amount of 5% of the 
// total attack value. Because our 'good' player benefits from the Aura bonus, his 
// values will diminish less that the opponent's numbers. There should be a cut-off
// at 20% of starting values whereby the fight must stop. Player either wins or retreats.
        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.Guard.actorStrength;
        double opponentStamina = Actor.Guard.actorStamina;
        //double opponentDefensePlace = 1;

//        this.console.println("How much Strength do you want to use?");
        try {
//            pInput = keyboard.readLine();
//        } catch (IOException ex) {
//            Logger.getLogger(CombatControl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            myInt = Integer.parseInt(pInput);
//            int playerAttackPlace = myInt;

//            if (playerAttackPlace < 1 || playerAttackPlace > 3) {
//                throw new CombatControlException("??");
//            }
//            if (playerAttackPlace == opponentDefensePlace) {
//                throw new CombatControlException("??");
//            }
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack );
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;
            /*
            if (Actor.Guard.actorActStam < 0) {
                throw new CombatControlException("You have defeated your enemy!");
            } else {
                if (PlayerControl.actualStamina < 0) {
                    throw new CombatControlException("Your lost the battle!");
                } else {
                    
                }
            }
            */
            while (Actor.Guard.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived +
                " You have received a hit for " + playerDamageReceived +
                "\nYour current health is " + PlayerControl.actualStamina);
                
            }
            if (Actor.Guard.actorActStam <= 0) {
                throw new CombatControlException("You won!");
            } //else {
            if (PlayerControl.actualStamina <= 0) {
                System.out.println("You have died.");
//               MainMenuView mainM = new MainMenuView();
//               mainM.display();
                  System.exit(0);
                //throw new CombatControlException("You Lost");
                
                
                }
            
            /*while (Actor.Guard.actorActStam > 0) {
                throw new CombatControlException("You hit for " + damageReceived);
            }
            
            while (PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You have received a hit by " + playerDamageReceived);
            }
            
            if (Actor.Guard.actorActStam < 0) {
                throw new CombatControlException("You have defeated your enemy!");
  
            }
            
            
            
            if (PlayerControl.actualStamina < 0) {
                throw new CombatControlException("You loose the Battle");
            }
            
            */
             //return damageReceived;
        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");
        
        }
        
        return myInt;
    
    }
    
}
