/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

/**
 * 05-26-2016 Recommit with proper message
 * @author michaelcavey
 */
public class ItemControl {
    
    public double calcUsableVolumeOfWagon(double length, double width, double depth) {
    
        if (length < 0 || length > 10) {
                return -1;
        }
        if (width < 0 || width > 4) {
                return -1;
        }
        if (depth < 0 || depth > 3) {
                return -1;
        }
        double usableVolume = (length * width * depth) / 1.25;
                
        return usableVolume;
        
    }
    
}
