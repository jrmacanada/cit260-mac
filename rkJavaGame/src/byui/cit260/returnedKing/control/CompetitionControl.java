package byui.cit260.returnedKing.control;


import byui.cit260.returnedKing.exceptions.CompetitionControlException;
import java.util.Scanner;

/**
 *
 * @author Craig
 */
public class CompetitionControl {
    
    
    public double competition() 
            throws CompetitionControlException {
        
        int myInt;
        double minYard = 100;
        double maxYard = 115;
        double strength = 100;
                
        double windResistance = 8;
        double actualStamina = 78;
        double maximumStamina = 100;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much Strength do you want to use?");
        myInt = keyboard.nextInt();
        
        int power = myInt;
                
        
        if (power <= 0 || power > strength) {
            throw new CompetitionControlException("You need to enter a value between 1 and 100");
        }
        double distanceInYards = (power + strength - windResistance) * (actualStamina / maximumStamina);
        
        if (distanceInYards < minYard) {
            throw new CompetitionControlException("You didn't throw it hard enough");
        }
        
        if (distanceInYards > maxYard){
            throw new CompetitionControlException("You threw it to far");
        }
        
        if (distanceInYards >= minYard || distanceInYards <= maxYard) {
            throw new CompetitionControlException("YOU DID IT!");
            //return 1;
        }
        return distanceInYards;
        
    }
}
