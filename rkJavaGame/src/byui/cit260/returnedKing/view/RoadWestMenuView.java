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
public class RoadWestMenuView extends View {
    
    public RoadWestMenuView(){
                 super( "\n"
                      + "\n--------------------------------------------"
                      + "\n|                West Road                 |"
                      + "\n|  Rogue warrior blocks forward movement   |"
                      + "\n--------------------------------------------"
                      + "\n1 - Retreat "
                      + "\n2 - Confront "
                      + "\n3 - Move to West Gate "
                      + "\n--------------------------------------------"                      
                      + "\nQ - Quit to Game Menu "
                      + "\n--------------------------------------------");
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
                this.moveToWestGate();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
    
     private void retreat() {
        System.out.println("\nCalls the retreat() function");
    }
     
     private void confront() {
        System.out.println("\nCalls the confront() function");
    }
     
     private void moveToWestGate() {
        System.out.println("\nCalls the moveToWestGate() function");
    }
    
    
}
