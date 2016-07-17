/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public final class EndGameView {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public EndGameView() {

        this.displayBanner();
    }

    public void displayBanner() {

        this.console.println("\n"
                + "\n**************************************************************"
                + "\n*                     The Returned King                      *"
                + "\n*                   You have WON the game!                   *"
                + "\n*                    The Kingdom is yours.                   *"
                + "\n**************************************************************"
        );
        
        System.exit(0);
    }

}
