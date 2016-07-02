/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.exceptions;

/**
 *
 * @author thiag
 */
public class CombatControlException extends Exception{

    public CombatControlException() {
    }

    public CombatControlException(String string) {
        super(string);
    }

    public CombatControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CombatControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CombatControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

