/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CompetitionControl;
import byui.cit260.returnedKing.exceptions.CompetitionControlException;
import java.util.Scanner;

/**
 *
 * @author Craig
 */
public class HunterChallengeView extends View {
    
    
    public HunterChallengeView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n|  One of the hunters challenged you to   |"   
                      + "\n|        a throwing competition          |"
                      + "\n------------------------------------------"
                      + "\nA - Accept the challenge  "
                      + "\nR - Ask for him to explain the rules"
                      + "\nQ - Return to the Hunting Reserve "
                      + "\n------------------------------------------");
                    }
   
    @Override
    public boolean doAction(String value) {
        
        
        value = value.toUpperCase(); //convert choice to uppercase
        
        switch (value) {
            case "A": //Begins the Challenge
                this.acceptChallenge();
                break;
            case "R": //Explains the rules of the challenge
                this.askForRules();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void acceptChallenge() {
        try {
            CompetitionControl compC = new CompetitionControl();
            compC.competition();
            double chall = compC.competition();
            
            
            System.out.println("test" + chall);
        } catch (CompetitionControlException cce) {
            System.out.println(cce.getMessage());
            
        }
    }

    private void askForRules() {
        System.out.println("\n*** Calls the askForRules()***");
    }

    
}
