/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author Craig
 */
public class TavernView extends View {
    
    public TavernView(){
                 super( "\n"
                      + "\n------------------------------------------"
                      + "\n|              Tavern                    |"
                      + "\n|     What would you like to do?         |"
                      + "\n------------------------------------------"
                      + "\nT - Talk to the Tavern owner "
                      + "\nO - Talk to drunk farmer"
                      + "\nS - Talk to shady man in the corner"   
                      + "\nQ - Quit to Main Menu"
                      + "\n------------------------------------------");
}
    @Override
    public boolean doAction(String value) {
        
        
        value = value.toUpperCase(); //convert choice to uppercase
        
        switch (value) {
            case "T": 
                this.talkToOwner();
                break;
            case "O": 
                this.talkToDrunk();
                break;
            case "S": 
                this.talkToShady();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        
    }
    
     private void talkToOwner() {
        System.out.println("\nCalls the talkToOwner()");
    }
     
     private void talkToDrunk() {
        System.out.println("\nCalls the talkToDrunk()");
    }
     
     private void talkToShady() {
        System.out.println("\nCalls the talkToShady()");
    }
    
}
