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

        String pInput;
        int myPower = 0;
        double minYard = 100;
        double maxYard = 115;
        double strength = 100;

        double windResistance = 8;
        double actualStamina = 78;
        double maximumStamina = 100;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nLets see if you can throw this stone between the 100 foot marker and the 115 foot one."
                + "\nHow much Strength do you want to use?");
        pInput = keyboard.nextLine();

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
}
