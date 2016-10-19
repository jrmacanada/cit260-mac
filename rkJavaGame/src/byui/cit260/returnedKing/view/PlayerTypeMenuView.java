/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.MapControl;
import static byui.cit260.returnedKing.control.MapControl.movePlayer;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Map;
import rkjavagame.RkJavaGame;

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
        Game game = RkJavaGame.getCurrentGame();

        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); // save map in game

        // moves player to Wizard Hamlet position on the map
        movePlayerToWizardLocation(map);
        
        WizardStartView wizardStartView = new WizardStartView();
                wizardStartView.display();

    }

    private void warriorType() {
        Game game = RkJavaGame.getCurrentGame();

        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); // save map in game

        // moves player to Warrior Village position on the map
        movePlayerToWarriorLocation(map);
        
        WarriorStartView warriorStartView = new WarriorStartView();
                warriorStartView.display();

    }
    
    private void monkType() {
        Game game = RkJavaGame.getCurrentGame();

        Map map = MapControl.createMap(); // create and intialize new map
        game.setMap(map); // save map in game

        // moves player to Monastery position on the map
        movePlayerToMonkLocation(map);

        MonkStartView monkStartView = new MonkStartView();
                monkStartView.display();

    }

    private void movePlayerToWizardLocation(Map map) {
        movePlayer(map, 4, 0);
    }
    
    private void movePlayerToWarriorLocation(Map map) {
        movePlayer(map, 0, 4);
    }
    
    private void movePlayerToMonkLocation(Map map) {
        movePlayer(map, 0, 0);
    }
    
}
