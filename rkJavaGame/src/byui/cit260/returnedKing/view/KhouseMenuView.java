/*
 + * To change this license header, choose License Headers in Project Properties.
 + * To change this template file, choose Tools | Templates
 + * and open the template in the editor.
 + */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CombatControl;
import byui.cit260.returnedKing.exceptions.CombatControlException;

/**
 *
 * @author thiag
 */
public class KhouseMenuView extends View {

    public KhouseMenuView() {
        super("\n There is a guard in front the door."
                + "\n   What do you want to do?"
                + "\n---------------------------------------"
                + "\n|      King's Country House Menu      |"
                + "\n---------------------------------------"
                + "\nF - Fight"
                + "\nH - Try a hidden Attack"
                + "\nT - Talk to the Guard"
                + "\nL - Look for a hidden door"
                + "\nQ - Back to the Map"
                + "\n---------------------------------------");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to uppercase

        switch (value) {
            case "F": //opens the fight
                this.fight();
                break;
            case "H": //opens a hidden attack
                this.hiddenFight();
                break;
            case "T": // explains how battle works
                this.talkTo();
                break;
            case "L": // explains what you can collect within the game
                this.tryHiddenDoor();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void fight() {
        try {
            CombatControl fight = new CombatControl();
            fight.damageGiven();
            double works = fight.damageGiven();

            this.console.println("You fought bravely!");
        } catch (CombatControlException cce) {
            System.out.println(cce.getMessage());
        }
    }

    private void hiddenFight() {
        this.console.println("\n*** hiddenFight() function called ***");
    }

    private void talkTo() {
        this.console.println("\n*** talkTo() function called ***");
    }

    private void tryHiddenDoor() {
        this.console.println("\n*** tryHiddenDoor() function called ***");
    }

}
