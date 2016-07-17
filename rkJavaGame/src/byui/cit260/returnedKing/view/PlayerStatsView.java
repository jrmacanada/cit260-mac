/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;
import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class PlayerStatsView {
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public void StatDisplay() {
        StringBuilder line;

        Game game = RkJavaGame.getCurrentGame();
        Player player = game.getPlayer();

        this.console.println("\nPlayer Stats"
                            +"\nStrength = " + player.getStrength()
                            +"\nStamina = " + player.getActualStamina()
                            +"\nIntelligence = " + player.getIntellegence());
        
        }
    }

    
    