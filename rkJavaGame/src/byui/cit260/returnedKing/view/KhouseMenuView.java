/*
 + * To change this license header, choose License Headers in Project Properties.
 + * To change this template file, choose Tools | Templates
 + * and open the template in the editor.
 + */
 
 package byui.cit260.returnedKing.view;
 
 import byui.cit260.returnedKing.control.GameControl;
 import java.util.Scanner;
 import rkjavagame.RkJavaGame;
 
 /**
  *
  * @author thiag
  */ 
 public class KhouseMenuView {
     
     private String menu;
     
     public KhouseMenuView() {
             this.menu = "\n"
                       + "\n------------------------------------------"
                       + "\n| KIng's Country House Menu                              |"
                       + "\n------------------------------------------"
                       + "\n - There is a guard in front the door. What do you want to do?"
                       + "\nF - Fight"
                       + "\nH - Try a hidden Attack"
                       + "\nT - Talk to the Guard"
                       + "\nL - Look for a hidden door"
                       + "\nM - Back to the Map"
                       + "\n------------------------------------------";
            
     
     
     }
     public void displayKhouseMenuView() {
         
         boolean done = false; // set flag to not done
         do{
             // prompt for and get player name
             String kingsCountryHouseOption = this.getKingsCountryHouseOption();
             if (kingsCountryHouseOption.toUpperCase().equals("M")) // user wants to back to the map
                 return; // exit the game
             
             // do the requested action and display the next view
             done = this.doAction(kingsCountryHouseOption);
             
         }while (!done);
     }
     
     private String getKingsCountryHouseOption() {
         
      
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
         
     return value;
             }        
     
     private boolean doAction(String choice) {
         
         choice = choice.toUpperCase(); //convert choice to uppercase
         
         switch (choice) {
             case "F": //opens the fight
                 this.fight();
                 break;
             case "H": //opens a hidden attack
                 this.hiddenFight();
                 break;
             case "T": // explains how battle works
                 this.talkTo();
                 break;
             case "L": // explains what you can collect within the game
                 this.tryHiddenDoor();
                 break;
             default:
                 System.out.println("\n*** Invalid Selection *** Try again");
                 break;
         }
         return false;
         
    }
 
     private void fight() {
         System.out.println("\n***fight() function called***");       
         }
     
     private void hiddenFight() {
         System.out.println("\n***hiddenFight() function called***");
         }
     
     private void talkTo() {
         System.out.println("\n***talkTo() function called***");
         }
  
     private void tryHiddenDoor() {
         System.out.println("\n***tryHiddenDoor() function called***");
     }  
    
 }