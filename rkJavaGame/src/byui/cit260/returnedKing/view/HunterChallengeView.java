/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.util.Scanner;

/**
 *
 * @author Craig
 */
public class HunterChallengeView {
    private String menu;
    
    public HunterChallengeView() {
            this.menu = "\n"
                      + "\n------------------------------------------"
                      + "\n|  One of the hunters challenged you to   |"   
                      + "\n|        a throwing competition          |"
                      + "\n------------------------------------------"
                      + "\nA - Accept the challenge  "
                      + "\nR - Ask for him to explain the rules"
                      + "\nQ - Return to the Hunting Reserve "
                      + "\n------------------------------------------";
                    }
    public void displayHunterChallengeView() {
        
        boolean done = false; // set flag to not done
        do{
            
            String challengeOption = this.getChallengeOption();
            if (challengeOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(challengeOption);
            
        }while (!done);
    }

    private String getChallengeOption() {
        
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
   

    private boolean doAction(String choice) {
        
        
        choice = choice.toUpperCase(); //convert choice to uppercase
        
        switch (choice) {
            case "A": //Begins the Challenge
                this.acceptChallenge();
                break;
            case "R": //Explains the rules of the challenge
                this.askForRules();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }

    private void acceptChallenge() {
        System.out.println("\n*** Calls acceptChallenge() and will evetually"
                         + "\nuse competition.jave");
    }

    private void askForRules() {
        System.out.println("\n*** Calls the askForRules()***");
    }

    
}
