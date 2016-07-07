/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import rkjavagame.RkJavaGame;

/**
 * may 28, 2016
 *
 * @author thiag
 *
 */
public class CombatControlTest {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public CombatControlTest() {
    }

    /**
     * Test of damageGiven method, of class CombatControl.
     */
    @Test
    public void testDamageGiven() {
        this.console.println("damageGiven");

        /**
         * *************************
         * Test case #01
         *************************
         */
        this.console.println("Test case #01");

        int playerStrength = 50;
        int playerIntelligence = 10;
        int playerAttackItem = 10;
        int opponentStrength = 40;
        int opponentStamina = 200;
        int playerAttackPlace = 0;
        int opponentDefensePlace = 1;
        CombatControl instance = new CombatControl();
        double expResult = -1.0;
//        double result = instance.damageGiven(playerStrength, playerIntelligence, playerAttackItem, opponentStrength, opponentStamina, playerAttackPlace, opponentDefensePlace);
//        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

        /**
         * *************************
         * Test case #02
         *************************
         */
        this.console.println("Test case #02");

        playerStrength = 50;
        playerIntelligence = 10;
        playerAttackItem = 10;
        opponentStrength = 40;
        opponentStamina = 200;
        playerAttackPlace = 1;
        opponentDefensePlace = 1;
        expResult = 0.0;
//        result = instance.damageGiven(playerStrength, playerIntelligence, playerAttackItem, opponentStrength, opponentStamina, playerAttackPlace, opponentDefensePlace);
//        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

        /**
         * *************************
         * Test case #03
         *************************
         */
        this.console.println("Test case #03");

        playerStrength = 50;
        playerIntelligence = 10;
        playerAttackItem = 10;
        opponentStrength = 40;
        opponentStamina = 200;
        playerAttackPlace = 2;
        opponentDefensePlace = 1;
        expResult = 30.0;
//        result = instance.damageGiven(playerStrength, playerIntelligence, playerAttackItem, opponentStrength, opponentStamina, playerAttackPlace, opponentDefensePlace);
//        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

        /**
         * *************************
         * Test case #04
         *************************
         */
        this.console.println("Test case #04");

        playerStrength = 50;
        playerIntelligence = 10;
        playerAttackItem = 10;
        opponentStrength = 80;
        opponentStamina = 200;
        playerAttackPlace = 2;
        opponentDefensePlace = 1;
        expResult = 0.0;
//        result = instance.damageGiven(playerStrength, playerIntelligence, playerAttackItem, opponentStrength, opponentStamina, playerAttackPlace, opponentDefensePlace);
//        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.

    }

}
