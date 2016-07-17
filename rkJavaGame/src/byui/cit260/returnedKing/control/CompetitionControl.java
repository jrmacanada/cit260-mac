package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CompetitionControlException;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Player;
import byui.cit260.returnedKing.view.ErrorView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class CompetitionControl {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public double competition()
            throws CompetitionControlException {
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();

        String pInput = null;
        int myPower = 0;
        double minYard = 100;
        double maxYard = 115;
        double strength = player.getStrength();
        double coins = 0;

        double windResistance = 8;
        double actualStamina = player.getActualStamina();
        double maximumStamina = player.getMaxStamina();

        this.console.println("\nLets see if you can throw this stone between the 100 foot marker and the 115 foot one."
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
                throw new CompetitionControlException("You need to enter a value between 1 and " + player.getStrength());
            }
            double distanceInYards = (power + strength - windResistance) * (actualStamina / maximumStamina);

            if (distanceInYards < minYard) {
                throw new CompetitionControlException("You didn't throw it hard enough");
            }

            if (distanceInYards > maxYard) {
                throw new CompetitionControlException("You threw it to far");
            }

            if (distanceInYards >= minYard || distanceInYards <= maxYard) {
              coins = distanceInYards / 4;
               this.console.println("YOU DID IT!!! You earned " + (Math.round(coins)) + " coins.");
            
                
                
            }
            
            return (int)Math.round(coins);
            
        } catch (NumberFormatException nf) {
            int power = myPower;
            throw new CompetitionControlException("\n*** You must enter a valid number ***");
        }
        
    }

}
