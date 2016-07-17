/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CombatControl;
import byui.cit260.returnedKing.exceptions.CombatControlException;

/**
 *
 * @author michaelcavey
 */
public class CastleCombatView extends View {
    
    public CastleCombatView() {
        super("\n  Battle Begins!!"
            + "\n--------------------"
            + "\nA - Attack"
            + "\nQ - Quit the fight"
            + "\n--------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "A":
                this.attack();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
                }
        return false;           
    }
    
    private void attack() {
        try {
            CombatControl combatF = new CombatControl();
            combatF.fightKing();
            double combat = combatF.fightKing();     
          
        } catch (CombatControlException cce) {
            ErrorView.display(this.getClass().getName(),
                    cce.getMessage());            
        }        
    }

}
