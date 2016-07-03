/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.ItemControlException;
import java.util.Scanner;

/**
 * 
 * @author michaelcavey
 */

public class ItemControl {
    
    public double calcUsableVolumeOfWagon(double length, double width, double depth) 
            throws ItemControlException {
    
        if (length < 0 || length > 10) {
                throw new ItemControlException("You need to enter a value between 1 and 10");
        }
        if (width < 0 || width > 4) {
                throw new ItemControlException("You need to enter a value between 1 and 4");
        }
        if (depth < 0 || depth > 3) {
                throw new ItemControlException("You need to enter a value between 1 and 3");
        }
        double usableVolume = (length * width * depth) / 1.25;
                
        return usableVolume;
        
    }
    
}
