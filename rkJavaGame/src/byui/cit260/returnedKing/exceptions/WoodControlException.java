/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.exceptions;

/**
 *
 * @author michaelcavey
 */
public class WoodControlException extends Exception {

    public WoodControlException() {
    }

    public WoodControlException(String message) {
        super(message);
    }

    public WoodControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public WoodControlException(Throwable cause) {
        super(cause);
    }

    public WoodControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
