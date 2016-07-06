/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

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
            {
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // intialize to not valid
        String value = null; // value to be returned

        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); // get next line typed on keboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid entry: value cannot be blank");
                continue;
            }

            break; // end the loop
        }

        return value; // return the value entered */
    }

}
