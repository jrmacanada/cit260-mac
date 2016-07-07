/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;

/**
 *
 * @author thiag
 *
 */
public class GameMenuView extends View {

    private int getInput;

    public GameMenuView() {
        super("\n"
                + "\n-------------------------------"
                + "\n|          Game Menu          |"
                + "\n-------------------------------"
                + "\nP - Player Type"
                + "\nI - Item List"
                + "\nM - Map Display"
                + "\nV - Move to new location"
                + "\nH - Move player to Hunter Reserve for CompetionControl test"
                + "\n2 - Character with the maximum strength"
                + "\nC - Goes to King's House for CombatControl test"
                + "\nF - Shortcut to Forest Scene"
                + "\nQ - Quit to Main Menu"
                + "\n-------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert value to uppercase

        switch (value) {
            case "P":
                this.playerType();
                break;
            case "I":
                this.itemList();
                break;
            case "M":
                this.mapView();
                break;
            case "V":
                this.movePlayer();
                break;
            case "H":
                this.enterHuntRes();
                break;
            case "2":
                this.maxStrength();
                break;
            case "C":
                this.enterKingsHouse();
                break;
            case "F":
                this.enterForest();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void playerType() {
        PlayerTypeMenuView playerTypeMenuView = new PlayerTypeMenuView();
        playerTypeMenuView.display();
    }

    private void mapView() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }

    private void itemList() {
        ItemListMenuView itemListMenuView = new ItemListMenuView();
        itemListMenuView.display();
    }

    private void movePlayer() {
        PlayerMoveMenuView playerMoveMenuView = new PlayerMoveMenuView();
        playerMoveMenuView.display();
    }

    private void maxStrength() {
       
        GameControl gameC = new GameControl();
        gameC.mStrength();
        int strength = gameC.mStrength();

        this.console.println("\nThe highest character strength is " + strength);
    }

    private void enterHuntRes() {
        HuntReserveView huntReserveView = new HuntReserveView();
        huntReserveView.display();
    }

    private void enterForest() {
        ForestMenuView forestMenuView = new ForestMenuView();
        forestMenuView.display();
    }

    private void enterKingsHouse() {
        KhouseMenuView khouseMenuView = new KhouseMenuView();
        khouseMenuView.display();
    }
    
}
