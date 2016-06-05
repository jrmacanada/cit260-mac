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
 * @author thiag
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n| Help Menu                              |"
                      + "\n------------------------------------------"
                      + "\nG - What is the Goal of the Game"
                      + "\nM - How to move"
                      + "\nB - How to Battle"
                      + "\nP - Where Should I go?"
                      + "\nC - What Should I collect?"
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------";
                    }
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do{
            // prompt for and get player name
            String helpOption = this.getHelpOption();
            if (helpOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(helpOption);
            
        }while (!done);
    }

    private String getHelpOption() {
        
        System.out.println("\n***getHelpOption()***");
        return "N";
        }
   

    private boolean doAction(String helpOption) {
        System.out.println("\ndoAction()***");
        return true;
    }

        
}
