/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;


import byui.cit260.returnedKing.exceptions.CombatControlException;
import java.util.Scanner;

/**
 * May 28, 2016
 * @author thiago
 */
public class CombatControl {
    
    public double damageGiven()
            throws CombatControlException {
            
        int myInt;
        int playerStrength = 100;
        int playerIntelligence = 10;
        int playerAttackItem = 5;
        int opponentStrength = 50;
        int opponentStamina = 200;
        int opponentDefensePlace = 1;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much Strength do you want to use?");
        myInt = keyboard.nextInt();
        
        int playerAttackPlace = myInt;
        
            /*(int playerStrength, int playerIntelligence, 
            int playerAttackItem, int opponentStrength, int opponentStamina, 
            int playerAttackPlace, int opponentDefensePlace)*/ 
       
        
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
    

