/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author thiag
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n--------------------------------------"
                + "\n|             Help Menu              |"
                + "\n--------------------------------------"
                + "\nG - What is the Goal of the Game"
                + "\nM - How to move"
                + "\nB - How to Battle"
                + "\nC - What should I collect?"
                + "\nQ - Quit to Main Menu"
                + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "G": //opens the goal of the game
                this.whatIsGoal();
                break;
            case "M": //opens the how to move
                this.howToMove();
                break;
            case "B": // explains how battle works
                this.howToBattle();
                break;
            case "C": // explains what you can collect within the game
                this.whatToCollect();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void whatIsGoal() {
        this.console.println("\n"
                + "\n**************************************************"
                + "\n*               Goal of the Game                 *"
                + "\n**************************************************"
                + "\n*                                                *"
                + "\n*    In Returned King the player's goal is to    *"
                + "\n*  explore the map collecting items to help the  *"
                + "\n*  player become powerful enough to confront     *"
                + "\n*  his uncle and reclaim the throne.             *"
                + "\n*                                                *"
                + "\n**************************************************"
        );

    }

    private void howToMove() {
        this.console.println("\n"
                + "\n************************************************"
                + "\n*          How to Move Your Character          *"
                + "\n************************************************"
                + "\n*                                              *"
                + "\n*  To Move your character within the game      *"
                + "\n*  use the letter keys shown below:            *"
                + "\n*                                              *"
                + "\n*    N - Go North                              *"
                + "\n*    S - Go South                              *"
                + "\n*    E - Go East                               *"
                + "\n*    W - Go West                               *"
                + "\n*                                              *"
                + "\n************************************************"
        );
    }

    private void howToBattle() {
        this.console.println("\n"
                + "\n************************************************"
                + "\n*               How Battle Works               *"
                + "\n************************************************"
                + "\n*                                              *"
                + "\n*    The player may choose to confront any     *"
                + "\n*  opponent in battle at any time. He must     *"
                + "\n*  select one of three attack strategies and   *"
                + "\n*  based on his stamina, strength, offense     *"
                + "\n*  weapons, and defenses the outcome of the    *"
                + "\n*  battle will be calculated with each attack  *"
                + "\n*  until he wins, loses, or retreats.          *"
                + "\n*                                              *"
                + "\n************************************************"
        );
    }

    private void whatToCollect() {
        this.console.println("\n"
                + "\n**************************************************"
                + "\n*        What You Will Be Collecting             *"
                + "\n**************************************************"
                + "\n*                                                *"
                + "\n*    Personal inventory items are things a       *"
                + "\n*  player may collect, be given, or purchase     *"
                + "\n*  throughout the game. Some are required for    *"
                + "\n*  sustenance (food, coins), while others are    *"
                + "\n*  preferred for battle or working. To find      *"
                + "\n*  out what is available visit the inventory     *"
                + "\n*  items available in different map locations.   *"
                + "\n*  Don’t miss an opportunity to strengthen your  *"
                + "\n*  arsenal or restock your supplies.             *"
                + "\n*                                                *"
                + "\n**************************************************"
        );
    }

}
