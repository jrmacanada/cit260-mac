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

public class PlayerTypeMenuView extends View {

    public PlayerTypeMenuView() {
                 super( "\n"
                      + "\n----------------------------------"
                      + "\n|        Player Type Menu        |"
                      + "\n----------------------------------"
                      + "\n   Your 20 years of hidding has   "
                      + "\n   made you one of the following. "
                      + "\n   Select by entering a number.   "   
                      + "\n----------------------------------"
                      + "\n1 - Wizard"
                      + "\n2 - Warrior"
                      + "\n3 - Monk"
                      + "\n----------------------------------"
                      + "\nQ - Quit to Game Menu"
                      + "\n----------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert value to uppercase
        
        switch (value) {
            case "1": 
                this.wizardType();
                break;
            case "2": 
                this.warriorType();
                break;
            case "3": 
                this.monkType();
                break;
                    
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void wizardType() {
       this.console.println("\n This is where our code must..."
                        + "\n allocate variables with wizard values to player,"
                        + "\n identify unique items the wizard possesses,"
                        + "\n and store player's start position at"
                        + "\n Wizard Hamlet location on map.");
    }

    private void warriorType() {
       this.console.println("\n This is where our code must..."
                        + "\n allocate variables with warrior values to player,"
                        + "\n identify unique items the warrior possesses,"
                        + "\n and store player's start position at"
                        + "\n Warrior Village location on map.");
    }
    
    private void monkType() {
       this.console.println("\n This is where our code must..."
                        + "\n allocate variables with monk values to player,"
                        + "\n identify unique items the monk possesses,"
                        + "\n and store player's start position at"
                        + "\n Monastery location on map.");
    }
    
}
