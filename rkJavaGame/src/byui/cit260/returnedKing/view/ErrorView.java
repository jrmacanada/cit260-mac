/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import java.io.PrintWriter;
import rkjavagame.RkJavaGame;

/**
 *
 * @author Craig
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = RkJavaGame.getOutFile();
    private static PrintWriter logFile = RkJavaGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "----------------------------------------------------------------------"
               +"\n " + errorMessage
               +"\n----------------------------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
