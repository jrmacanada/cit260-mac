/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.exceptions;

/**
 *
 * @author Craig
 */
public class CompetitionControlException extends Exception{

    public CompetitionControlException() {
    }

    public CompetitionControlException(String string) {
        super(string);
    }

    public CompetitionControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CompetitionControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CompetitionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
