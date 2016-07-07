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
 *
 * @author michaelcavey
 */
public class ItemControlTest {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public ItemControlTest() {
    }

    /**
     * Test of calcUsableVolumeOfWagon method, of class ItemControl.
     */
    @Test
    public void testCalcUsableVolumeOfWagon() {
        this.console.println("calcUsableVolumeOfWagon");

        /**
         * ***************
         * Test case #1 ***************
         */
        this.console.println("\tTest case #1");

        //input values for test case 1
        double length = 5.0;
        double width = 2.0;
        double depth = 2.0;
        ItemControl instance = new ItemControl();
        double expResult = 16.0;
//        double result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #2 ***************
         */
        this.console.println("\tTest case #2");

        //input values for test case 2
        length = -1.0;
        width = 2.0;
        depth = 2.0;

        expResult = -1.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #3 ***************
         */
        this.console.println("\tTest case #3");

        //input values for test case 3
        length = 5.0;
        width = -1.0;
        depth = 2.0;

        expResult = -1.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #4 ***************
         */
        this.console.println("\tTest case #4");

        //input values for test case 4
        length = 5.0;
        width = 2.0;
        depth = -1.0;

        expResult = -1.0;
//       result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #5 ***************
         */
        this.console.println("\tTest case #5");

        //input values for test case 5
        length = 11.0;
        width = 2.0;
        depth = 2.0;

        expResult = -1.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #6 ***************
         */
        this.console.println("\tTest case #6");

        //input values for test case 6
        length = 5.0;
        width = 5.0;
        depth = 2.0;

        expResult = -1.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #7 ***************
         */
        this.console.println("\tTest case #7");

        //input values for test case 7
        length = 5.0;
        width = 2.0;
        depth = 4.0;

        expResult = -1.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #8 ***************
         */
        this.console.println("\tTest case #8");

        //input values for test case 8
        length = 0.0;
        width = 2.0;
        depth = 2.0;

        expResult = 0.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #9 ***************
         */
        this.console.println("\tTest case #9");

        //input values for test case 9
        length = 5.0;
        width = 0.0;
        depth = 2.0;

        expResult = 0.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #10 ***************
         */
        this.console.println("\tTest case #10");

        //input values for test case 10
        length = 5.0;
        width = 2.0;
        depth = 0.0;

        expResult = 0.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

        /**
         * ***************
         * Test case #11 ***************
         */
        this.console.println("\tTest case #11");

        //input values for test case 11
        length = 10.0;
        width = 4.0;
        depth = 3.0;

        expResult = 96.0;
//        result = instance.calcUsableVolumeOfWagon(length, width, depth);
//        assertEquals(expResult, result, 0.01);

    }

}
