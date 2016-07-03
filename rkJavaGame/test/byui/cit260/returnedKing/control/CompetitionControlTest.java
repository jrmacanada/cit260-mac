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
 * @author Craig
 */
public class CompetitionControlTest {

    public CompetitionControlTest() {
    }

    /**
     * Test of competition method, of class CompetitionControl.
     */
    @Test
    public void testCompetition() {
        System.out.println("competition");

        /**
         * **************************
         * Test case #1
         ***************************
         */
        System.out.println("\tTest case #1");

        //input values for test case 1
        double minYard = 15.0;
        double maxYard = 20.0;
        double power = 15.0;
        double strength = 50.0;
        double windResistance = 8.0;
        double actualStamina = 30.0;
        double maximumStamina = 100.0;

        //create instance of CompetitionControl class
        CompetitionControl instance = new CompetitionControl();

        //expected output returned value
        double expResult = 1.0;

        //call function to run test
//        double result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #2
         ***************************
         */
        System.out.println("\tTest case #2");

        //input values for test case 2
        minYard = 15.0;
        maxYard = 20.0;
        power = -10.0;
        strength = 50.0;
        windResistance = 8.0;
        actualStamina = 30.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//       assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #3
         ***************************
         */
        System.out.println("\tTest case #3");

        //input values for test case 3
        minYard = 15.0;
        maxYard = 20.0;
        power = 0.0;
        strength = 50.0;
        windResistance = 8.0;
        actualStamina = 30.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #4
         ***************************
         */
        System.out.println("\tTest case #4");

        //input values for test case 4
        minYard = 15.0;
        maxYard = 20.0;
        power = 110.0;
        strength = 50.0;
        windResistance = 8.0;
        actualStamina = 30.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #5
         ***************************
         */
        System.out.println("\tTest case #5");

        //input values for test case 5
        minYard = 15.0;
        maxYard = 20.0;
        power = 1.0;
        strength = 50.0;
        windResistance = 8.0;
        actualStamina = 30.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #6
         ***************************
         */
        System.out.println("\tTest case #6");

        //input values for test case 6
        minYard = 15.0;
        maxYard = 20.0;
        power = 50.0;
        strength = 50.0;
        windResistance = 8.0;
        actualStamina = 30.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #7
         ***************************
         */
        System.out.println("\tTest case #7");

        //input values for test case 7
        minYard = 55.0;
        maxYard = 60.0;
        power = 25.0;
        strength = 60.0;
        windResistance = 12.0;
        actualStamina = 80.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = 1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #8
         ***************************
         */
        System.out.println("\tTest case #8");

        //input values for test case 8
        minYard = 55.0;
        maxYard = 60.0;
        power = 25.0;
        strength = 60.0;
        windResistance = 12.0;
        actualStamina = 1.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #9
         ***************************
         */
        System.out.println("\tTest case #9");

        //input values for test case 9
        minYard = 70.0;
        maxYard = 80.0;
        power = 25.0;
        strength = 60.0;
        windResistance = 12.0;
        actualStamina = 100.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = 1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

        /**
         * **************************
         * Test case #10
         ***************************
         */
        System.out.println("\tTest case #10");

        //input values for test case 10
        minYard = 55.0;
        maxYard = 60.0;
        power = 25.0;
        strength = 60.0;
        windResistance = 20.0;
        actualStamina = 80.0;
        maximumStamina = 100.0;

        //expected output returned value
        expResult = -1.0;

        //call function to run test
//        result = instance.competition(minYard, maxYard, power, strength, windResistance, actualStamina, maximumStamina);

        //compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.1);

    }

}
