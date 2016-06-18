/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

/**
 *
 * @author thiag
 */
public class ChurchMenuView extends View {
    
    public ChurchMenuView() {
                    super( "\n"
                            + "\n----------------------------"
                            + "\n|          Church          |"
                            + "\n   There is a nun and two   "
                            + "\npriests in the room. Do you "
                            + "\nwant to talk with:          "
                            + "\nN - the Nun                 "
                            + "\nP - the first priest        "
                            + "\nR - the second priest       "
                            + "\nQ - quit to Main Menu       "
                            + "\n----------------------------");    
    }
    
    @Override
    public boolean doAction(String value) {
    
        value = value.toUpperCase();//Convert Choice to Uppercase
    
        switch (value) {
            case "N": 
                this.nun();
                break;
            case "P": 
                this.firstPriest();
                break;
            case "R": 
                this.secondPriest();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
    
     private void nun() {
        System.out.println("\nCalls the nun() function");
    }
     
     private void firstPriest() {
        System.out.println("\nCalls the firstPriest() function");
    }
     
     private void secondPriest() {
        System.out.println("\nCalls the secondPriest() function");
     }
      
}
