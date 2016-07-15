/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 *
 * @author thiag
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();
   
    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
// TODO Add code to relocate current map position to current MenuView ***            
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {

       
        boolean valid = false; // intialize to not valid
        String value = null; // value to be returned

        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid entry: value cannot be blank ***");
                continue;
            }

            break; // end the loop
        }

        return value; // return the value entered */
    }

}
