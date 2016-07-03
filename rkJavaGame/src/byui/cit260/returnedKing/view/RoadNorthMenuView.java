/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CombatControl;
import byui.cit260.returnedKing.exceptions.CombatControlException;

/**
 *
 * @author michaelcavey
 */
public class RoadNorthMenuView extends View {

    public RoadNorthMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n|               North Road               |"
                + "\n|  Prison guard blocks forward movement  |"
                + "\n------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Retreat"
                + "\n2 - Confront"
                + "\n3 - Move to North Gate"
                + "\n------------------------------------------"
                + "\nN - Move North (not available)"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
                + "\n------------------------------------------"
                + "\n  At anytime you may use D-X-L-R"
                + "\n------------------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to uppercase

        switch (value) {
            case "1":
                this.retreat();
                break;
            case "2":
                this.confront();
                break;
            case "3":
                this.enterNorthGate();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void retreat() {
        GraveyardMenuView graveyardMenuView = new GraveyardMenuView();
        graveyardMenuView.display();
    }

    private void confront() {
        try {
            CombatControl fight = new CombatControl();
            fight.damageGiven();
            double works = fight.damageGiven();

            System.out.println("You fought bravely!");
        } catch (CombatControlException cce) {
            System.out.println(cce.getMessage());
        }
    }

    private void enterNorthGate() {
        GateNorthMenuView gateNorthMenuView = new GateNorthMenuView();
        gateNorthMenuView.displayGateNorthMenuView();
    }

}
