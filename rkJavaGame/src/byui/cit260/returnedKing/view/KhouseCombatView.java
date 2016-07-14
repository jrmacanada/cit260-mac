/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.CombatControl;
import byui.cit260.returnedKing.control.PlayerControl;
import byui.cit260.returnedKing.exceptions.CombatControlException;
import byui.cit260.returnedKing.model.Actor;

/**
 *
 * @author craig
 */
public class KhouseCombatView extends View {
//    Actor[] aList = Actor.values();
//    double enemyStrength = Actor.Guard.actorStrength;
//    double enemyStamina = Actor.Guard.actorStamina;
    
    public KhouseCombatView() {
        super("\n Battle Begins!!"
            + "\n----------------"
            + "\nA - Attack"
            + "\nQ - RUN AWAY"
            + "\n----------------");
        System.out.println("\nYour current health is " + PlayerControl.actualStamina);
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
            CombatControl combatC = new CombatControl();
            combatC.damageGiven();
            double combat = combatC.damageGiven();
            
            
          
        } catch (CombatControlException cce) {
            ErrorView.display(this.getClass().getName(),
                    cce.getMessage());
            
        }
        
    }

}
