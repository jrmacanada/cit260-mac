package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CompetitionControlException;
import byui.cit260.returnedKing.view.View;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Craig
 */
public class CompetitionControl extends View {

    public double competition()
            throws CompetitionControlException {

        String pInput = null;
        int myPower = 0;
        double minYard = 100;
        double maxYard = 115;
        double strength = 100;

        double windResistance = 8;
        double actualStamina = 78;
        double maximumStamina = 100;

        System.out.println("\nLets see if you can throw this stone between the 100 foot marker and the 115 foot one."
                + "\nHow much Strength do you want to use?");
        try {
            pInput = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CompetitionControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            myPower = Integer.parseInt(pInput);
            int power = myPower;

            if (power <= 0 || power > strength) {
                throw new CompetitionControlException("You need to enter a value between 1 and 100");
            }
            double distanceInYards = (power + strength - windResistance) * (actualStamina / maximumStamina);

            if (distanceInYards < minYard) {
                throw new CompetitionControlException("You didn't throw it hard enough");
            }

            if (distanceInYards > maxYard) {
                throw new CompetitionControlException("You threw it to far");
            }

            if (distanceInYards >= minYard || distanceInYards <= maxYard) {
                throw new CompetitionControlException("YOU DID IT!");
                //return 1;
            }
            return distanceInYards;
        } catch (NumberFormatException nf) {
            int power = myPower;
            System.out.println("\nYou must enter a valid number.");
        }
        return myPower;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
