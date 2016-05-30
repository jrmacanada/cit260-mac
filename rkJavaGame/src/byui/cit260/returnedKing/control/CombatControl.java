/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

/**
 * May 28, 2016
 * @author thiago
 */
public class CombatControl {
    
    public double damageGiven(int playerStrength, int playerIntelligence, 
            int playerAttackItem, int opponentStrength, int opponentStamina, 
            int playerAttackPlace, int opponentDefensePlace) {
       
        
        if (playerAttackPlace < 1 || playerAttackPlace > 3) {
            return -1;
        }
        if (playerAttackPlace == opponentDefensePlace) {
            return 0;
        }
        
        double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
        if (damageReceived < 0) {
            return 0;
        }
        return damageReceived;
        
        }
    }
    

