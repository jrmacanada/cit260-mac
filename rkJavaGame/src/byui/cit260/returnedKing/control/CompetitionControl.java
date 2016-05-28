/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

/**
 *
 * @author Craig
 */
public class CompetitionControl {
    
    public double competition(double minYard, double maxYard, double power, double strength, 
           double windResistance, double actualStamina, double maximumStamina) {
        
        if (power <= 0 || power > strength) {
            return -1;
        }
        double distanceInYards = (power + strength - windResistance) * (actualStamina / maximumStamina);
        
        if (distanceInYards < minYard || distanceInYards > maxYard) {
            return -1;
        }
        if (distanceInYards >= minYard || distanceInYards <= maxYard) {
            return 1;
        }
        return distanceInYards;
        
    }
}
