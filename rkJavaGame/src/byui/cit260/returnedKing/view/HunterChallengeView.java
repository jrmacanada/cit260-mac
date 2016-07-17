/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CompetitionControl;
import byui.cit260.returnedKing.control.ItemControl;
import byui.cit260.returnedKing.exceptions.CompetitionControlException;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Player;
import java.util.ArrayList;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class HunterChallengeView extends View {
    
    
    public HunterChallengeView() {
                 super( "\n"
                      + "\n-------------------------------------------"
                      + "\n|  One of the hunters challenged you to   |"   
                      + "\n|        a throwing competition           |"
                      + "\n-------------------------------------------"
                      + "\nA - Accept the challenge"
                      + "\nR - Ask for him to explain the rules"
                      + "\nQ - Return to the Hunting Reserve "
                      + "\n-------------------------------------------");
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void acceptChallenge() {
        try {
            Game game = RkJavaGame.getCurrentGame(); 
            Player player = game.getPlayer();
            ArrayList<Item> inventory = player.getInventory();
            CompetitionControl compC = new CompetitionControl();
            
            int coins = (int) compC.competition();
            int currentTotal = ItemControl.addQuantityToInventoryItem("Coin", coins);
            if(currentTotal != -99999) 
                this.console.println("Total coins = " + currentTotal);
            else 
                this.console.println("Could not find any coins");
            
            
          
        } catch (CompetitionControlException cce) {
            ErrorView.display(this.getClass().getName(),
                    cce.getMessage());
            
        }
    }

    private void askForRules() {
        this.console.println("\n*** Calls the askForRules()***");
    }

    
}
