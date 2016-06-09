/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.util.Scanner;

/**
 *
 * @author michaelcavey
 */
public class ForestMenuView {
    private String menu;
    
    public ForestMenuView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n| Forest Menu                              |"
                      + "\n------------------------------------------"
                      + "\nF - Forage for food"
                      + "\nC - Cut wood for coin"
                      + "\nS - Shelter and rest"
                      + "\nQ - Quit"
                      + "\n------------------------------------------";
                    }
    
    public void displayForestMenuView() {
        
        boolean done = false; // set flag to not done
        do{
            // prompt for and get player name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    private String getMenuOption() {
       
       Scanner keyboard = new Scanner(System.in); // get infile for keyboard
       String value = ""; // value to be returned
        boolean valid = false; // intialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid entry: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered */
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to uppercase
        
        switch (choice) {
            case "F": //Starts a new Game
                this.forageFood();
                break;
            case "C": //Starts an existing game
                this.cutWood();
                break;
            case "S": //Displays help Menu
                this.shelterRest();
                break;
            
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void forageFood() {
        // opens the forageFood scene

        // display the forageFood menu 
        ForageFoodMenuView forageFoodMenuView = new ForageFoodMenuView();
        forageFoodMenuView.displayForageFoodMenuView();
//        System.out.println("*Calls the forageFood() function*");
    }
    
    private void cutWood() {
        // opens the cutWood scene

        // display the cutWood menu 
//        CutWoodMenuView cutWoodMenuView = new CutWoodMenuView();
//        cutWoodMenuView.displayCutWoodMenuView();
        System.out.println("*Calls the cutWood() function*");
    }
    
    private void shelterRest() {
        // opens the shelterRest scene

        // display the shelterRest menu 
//        ShelterRestMenuView shelterRestMenuView = new ShelterRestMenuView();
//        shelterRestMenuView.displayShelterRestMenuView();
        System.out.println("*Calls the shelterRest() function*");
    }
    
}
