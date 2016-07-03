/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author michaelcavey
 */
public class PlayerMoveMenuView extends View {

    public PlayerMoveMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n|         Player Move Menu         |"
                + "\n------------------------------------"
                + "\n  This is a temporary redirect"
                + "\n  to one of three start locations"
                + "\n  once the player type is known."
                + "\n------------------------------------"
                + "\n1 - Wizard goes to Hamlet (WH)"
                + "\n2 - Warrior goes to Village (WV)"
                + "\n3 - Monk goes to Monastery (MM)"
                + "\n------------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "1":
                this.wizardHamlet();
                break;
            case "2":
                this.warriorVillage();
                break;
            case "3":
                this.monkMonastery();
                break;

            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void wizardHamlet() {
        WizardStartView wizardStartView = new WizardStartView();
        wizardStartView.display();
    }

    private void warriorVillage() {
        WarriorStartView warriorStartView = new WarriorStartView();
        warriorStartView.display();
    }

    private void monkMonastery() {
        MonkStartView monkStartView = new MonkStartView();
        monkStartView.display();
    }

}
