/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Spring;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class TestView {
    
        protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public void displayCraigsReport() {

        StringBuilder line;
        String fullReport = "";

        Game game = RkJavaGame.getCurrentGame();
        //Actor<Actor> actor = Arrays.asList(Actor.values());
        Actor[] aList = Actor.values();
        fullReport = "\r\n       LIST OF ACTOR DESCRIPTION AND STRENGTH \r\n";
        this.console.print(fullReport);
        line = new StringBuilder("                                           ");
        line.insert(0, "\nDESCRIPTION");
        line.insert(15, "\nSTRENGTH");
        //line.insert(25, "UNIT PRICE");
        fullReport += line.toString() + "\r\n";
        this.console.println(line.toString());

        for (Actor actor : aList) {
            line = new StringBuilder("                                        ");
            line.insert(0, actor.getDescription());
            line.insert(18, actor.getActorStrength());
            //line.insert(28, item.getUnitPrice());
            fullReport += line.toString() + "\n";
            this.console.println(line.toString());
        }
        
        this.console.println("\n Would you like to print the LIST to a file?");
        
        PrintMenuView printMenuView = new PrintMenuView(fullReport);
        printMenuView.display();
    }
}        

    

