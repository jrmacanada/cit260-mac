/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
class ReportMenuView {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    void displayReportMenuView() {
        this.console.println("*Calls the enterCastle() function*");
        // prompt and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(RkJavaGame.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

//    @Override
//    public boolean doAction(String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
