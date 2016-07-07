/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michaelcavey
 */
public final class StartProgramView extends View {

    private final String promptMessage = "\nPlease enter your name: ";

    public StartProgramView() {

        // this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();

    }

    public void displayBanner() {

        this.console.println("\n"
                + "\n**************************************************************"
                + "\n*                     The Returned King                      *"
                + "\n*                                                            *"
                + "\n*    In this text-based role playing game, you as a twelve   *"
                + "\n*  year-old prince witnessed the murder of his parents by    *"
                + "\n*  an ambitious uncle. You escaped death by leaving the      *"
                + "\n*  castle through a secret passage. After twenty years in    *"
                + "\n*  hiding, you start a journey to recovery your throne.      *"
                + "\n*    When you ran away, you choose one of three safe places  *"
                + "\n*  to hide: a monastery, a warrior village with mercenaries, *"
                + "\n*  or a hamlet of wizards. Your decision determines what     *"
                + "\n*  kind of abilities and strengths you developed.            *"
                + "\n*    In order to regain your kingship, you should travel     *"
                + "\n*  around the kingdom to better understand how your uncle    *"
                + "\n*  can be defeated, banished, or killed. By doing so, you    *"
                + "\n*  will learn the best way to recovery the kingdom.          *"
                + "\n*                                                            *"
                + "\n**************************************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false; //set flag to not done
        do {
            // prompt for and get the players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {

        String value = ""; // value to be returned
        boolean valid = false; // intialize to not valid

        while (!valid) { // loop while an invalid value is enter
            this.console.println("\n" + this.promptMessage);

            try {
                value = keyboard.readLine(); // get next line typed on keboard
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid entry: player name cannot be blank ***");
                continue;
            }

            break; // end the loop
        }

        return value; // return the value entered */
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 3) {
            ErrorView.display(this.getClass().getName(),
                    "\n*** Invalid player name: The name must be greater than two characters in length ***");
            return false;
        }

        try {
            // call createPlayer() control function
            Player player = GameControl.createPlayer(playersName);
            this.displayNextView(player);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    e.getMessage());
            return false;
        }

        return true; // success !

    }

    private void displayNextView(Player player) {

        // display a custom welcome message
        this.console.println("\n"
                + "\n==========================================="
                + "\n Welcome to the game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n==========================================="
        );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();
    }

}
