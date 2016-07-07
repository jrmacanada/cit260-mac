/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CombatControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import rkjavagame.RkJavaGame;

/**
 * May 28, 2016
 *
 * @author thiago
 */
public class CombatControl {
    
//    protected final BufferedReader keyboard = RkJavaGame.getInFile();
//    protected final PrintWriter console = RkJavaGame.getOutFile();

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

        int myInt;
        int playerStrength = 100;
        int playerIntelligence = 10;
        int playerAttackItem = 5;
        int opponentStrength = 50;
        int opponentStamina = 200;
        int opponentDefensePlace = 1;
        
// Can't get rid of this "System.in" because the ".nextInt" cannot be replaced with ".readInt"
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much Strength do you want to use?");
        myInt = keyboard.nextInt(); 

        int playerAttackPlace = myInt;

        /*(int playerStrength, int playerIntelligence, 
         int playerAttackItem, int opponentStrength, int opponentStamina, 
         int playerAttackPlace, int opponentDefensePlace)*/
        if (playerAttackPlace < 1 || playerAttackPlace > 3) {
            return -1;
        }
        if (playerAttackPlace == opponentDefensePlace) {
            return 0;
        }

        double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
        if (damageReceived < 0) {
            return 0;
        }
        return damageReceived;

    }
}
