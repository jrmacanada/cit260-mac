/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import java.util.Scanner;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class HuntReserveView extends View {
    
    
    public HuntReserveView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n|           Hunting Reserve              |"
                      + "\n|     What would you like to do?         |"
                      + "\n------------------------------------------"
                      + "\nH - Hunt for wild game "
                      + "\nT - Talk to the hunters <-----**THIS GOES TO THE CompetionControl"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------");
                    }
   
   
    @Override
    public boolean doAction(String value) {
        
        
        value = value.toUpperCase(); //convert choice to uppercase
        
        switch (value) {
            case "H": 
                this.huntForGame();
                break;
            case "T": 
                this.talkToHunters();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void huntForGame() {
        System.out.println("\nCalls the huntForGame()");
    }

    private void talkToHunters() {
        HunterChallengeView hunterChallengeView = new HunterChallengeView();
        hunterChallengeView.display();
    }
    
}

