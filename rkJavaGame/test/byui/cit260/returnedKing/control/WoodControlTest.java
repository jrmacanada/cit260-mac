/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michaelcavey
 */
public class WoodControlTest {

    public WoodControlTest() {
    }

    /**
     * Test of calcWoodCutCoin method, of class WoodControl.
     */
    @Test
    public void testCalcWoodCutCoin() {
        System.out.println("calcWoodCutCoin");

        /**
         * ***************
         * Test case #1 ***************
         */
        System.out.println("\tTest case #1");

        //input values for test case 1 = All VALID Inputs
        int staminaGiven = 50;
        int strength = 50;
        int axe = 25;
        double actualStamina = 80;
        int p_coin = 10;
        WoodControl instance = new WoodControl();
        double expResult = 30;
//        double result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #2 ***************
         */
        System.out.println("\tTest case #2");

        //input values for test case 2
        staminaGiven = 0; // Invalid (less than +1)
        strength = 50;
        axe = 25;
        actualStamina = 80;
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #3 ***************
         */
        System.out.println("\tTest case #3");

        //input values for test case 3
        staminaGiven = 50;
        strength = 0;     // Invalid (less than +1)
        axe = 25;
        actualStamina = 80;
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #4 ***************
         */
        System.out.println("\tTest case #4");

        //input values for test case 4
        staminaGiven = 50;
        strength = 50;
        axe = 0;        // Invalid (NOT 25, 50, or 75)
        actualStamina = 80;
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #5 ***************
         */
        System.out.println("\tTest case #5");

        //input values for test case 5
        staminaGiven = 50;
        strength = 50;
        axe = 25;
        actualStamina = 10; // Invalid (less than staminaGiven)
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #6 ***************
         */
        System.out.println("\tTest case #6");

        //input values for test case 6
        staminaGiven = 50;
        strength = 50;
        axe = 25;
        actualStamina = 80;
        p_coin = -1;        // Invalid (less than zero)

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #7 ***************
         */
        System.out.println("\tTest case #7");

        //input values for test case 7
        staminaGiven = 50;
        strength = 50;
        axe = 25;
        actualStamina = 110; // Invalid (more than 100)
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #8 ***************
         */
        System.out.println("\tTest case #8");

        //input values for test case 8
        staminaGiven = 50;
        strength = 50;
        axe = 50;          // VALID, check for 50
        actualStamina = 80;
        p_coin = 10;

        expResult = 40;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #9 ***************
         */
        System.out.println("\tTest case #9");

        //input values for test case 9
        staminaGiven = 50;
        strength = 50;
        axe = 75;          // VALID, check for 75
        actualStamina = 80;
        p_coin = 10;

        expResult = 50;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #10 ***************
         */
        System.out.println("\tTest case #10");

        //input values for test case 10
        staminaGiven = 50;
        strength = 110; // Invalid (more than 100)
        axe = 75;
        actualStamina = 80;
        p_coin = 10;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #11 ***************
         */
        System.out.println("\tTest case #11");

        //input values for test case 11
        staminaGiven = 1; // Low Boundry - Invalid (e_coin less than +1)
        strength = 1;
        axe = 25;
        actualStamina = 1;
        p_coin = 100;

        expResult = -1;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #12 ***************
         */
        System.out.println("\tTest case #12");

        //input values for test case 12
        staminaGiven = 100; // High Boundry (maximum coin earned)
        strength = 100;
        axe = 75;
        actualStamina = 100;
        p_coin = 0;

        expResult = 175;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #13 ***************
         */
        System.out.println("\tTest case #13");

        //input values for test case 13
        staminaGiven = 4; // Low Boundry (minimum of one coin earned with maximum actualStamina available)
        strength = 4;
        axe = 25;
        actualStamina = 100;
        p_coin = 0;

        expResult = 1.16;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #14 ***************
         */
        System.out.println("\tTest case #14");

        //input values for test case 14
        staminaGiven = 20; // Low Boundry (minimum of one coin earned when actualStamina eqauls givenStamina)
        strength = 1;
        axe = 25;
        actualStamina = 20;
        p_coin = 0;

        expResult = 1.04;
//        result = instance.calcWoodCutCoin(staminaGiven, strength, axe, actualStamina, p_coin);
//        assertEquals(expResult, result, 0.001);

        /**
         * ***************
         * Test case #15 ***************
         */
//        System.out.println("\tTest case #15");
        //input values for test case 15
    }

}
