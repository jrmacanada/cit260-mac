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
public class CombatControlMenuView extends View {

    public CombatControlMenuView() {
        super("\n"
                + "\n-----------------------------"
                + "\n|           Fight           |"
                + "\n-----------------------------"
                + "\nA - Attack"
                + "\nR - Rest (recover Stamina)"
                + "\nL - Leave the Battle"
        );
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "A":
                this.attack();
                break;
            case "R":
                this.rest();
                break;
            case "L":
                this.leave();
                break;

            default:
                this.console.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void attack() {

    }

    private void rest() {

    }

    private void leave() {

    }
}
