/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

//import java.util.Scanner;

import byui.cit260.returnedKing.control.WoodControl;
import byui.cit260.returnedKing.exceptions.WoodControlException;


/**
 *
 * @author michaelcavey
 */
public class CutWoodMenuView extends View{

    public CutWoodMenuView() {
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n|  A logging company needs woodcutters   |"   
                      + "\n|   You are asked to work to earn coin   |"
                      + "\n------------------------------------------"
                      + "\nA - Accept the job"
                      + "\nR - Request the terms of the agreement"
                      + "\nQ - Return to the Forest scene"
                      + "\n------------------------------------------");
                    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to uppercase
        
        switch (value) {
            case "A": //Begin to work
                this.startJob();
                break;
            case "R": //Explains the work for pay agreement
                this.aboutPay();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void startJob() {
        try {
            WoodControl job = new WoodControl();
            job.calcWoodCutCoin();
            double works = job.calcWoodCutCoin();
            
            
            System.out.println("test" + works);
        } catch (WoodControlException wce) {
            System.out.println(wce.getMessage());
            
        }
    }

    private void aboutPay() {
        System.out.println("\n You will be paid coin based on how much Stamina you give in the effort."
                         + "\n Your earnings are also a factor of the type of axe you possess.");
    }
}
