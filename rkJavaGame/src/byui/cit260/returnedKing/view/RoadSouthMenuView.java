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
class RoadSouthMenuView extends View {
    
    public RoadSouthMenuView(){
                 super( "\n"
                      + "\n--------------------------------------------"
                      + "\n|                South Road                |"
                      + "\n|  Drucken sailor blocks forward movement  |"
                      + "\n--------------------------------------------"
                      + "\n1 - Retreat "
                      + "\n2 - Confront "
                      + "\n3 - Move to South Gate "
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
                this.moveToSouthGate();
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
     
     private void moveToSouthGate() {
        System.out.println("\nCalls the moveToSouthGate() function");
    }
    
}
