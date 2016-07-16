/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

//import java.util.Scanner;
import byui.cit260.returnedKing.control.ItemControl;
import byui.cit260.returnedKing.control.WoodControl;
import byui.cit260.returnedKing.exceptions.WoodControlException;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Player;
import java.util.ArrayList;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class CutWoodMenuView extends View {

    public CutWoodMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n|  A logging company needs woodcutters   |"
                + "\n|  You are asked to work to earn coin    |"
                + "\n------------------------------------------"
                + "\nW - Work to earn coin"
                + "\nR - Request the terms of the agreement"
                + "\nQ - Return to the Forest scene"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to uppercase

        switch (value) {
            case "W": //Begin to work
                this.startJob();
                break;
            case "R": //Explains the work for pay agreement
                this.aboutPay();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;

    }

    private void startJob() {
        try {
            Game game = RkJavaGame.getCurrentGame(); 
            Player player = game.getPlayer();
            ArrayList<Item> inventory = player.getInventory();
            WoodControl job = new WoodControl();
            
            int coins = job.calcWoodCutCoin();
            int currentTotal = ItemControl.addQuantityToInventoryItem("Coin", coins);
            if(currentTotal != -99999) 
                this.console.println("Total coins = " + currentTotal);
            else 
                this.console.println("Could not find any coins");
            
        } catch (WoodControlException wce) {
            ErrorView.display(this.getClass().getName(),
                    wce.getMessage());

        }
    }

    private void aboutPay() {
        this.console.println("\n You will be paid coin based on how much Stamina you give in the effort."
                + "\n Your earnings are also a factor of the type of axe you possess.");
    }

}
