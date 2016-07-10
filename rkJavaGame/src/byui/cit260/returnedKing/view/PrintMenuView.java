/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class PrintMenuView extends View {

//    protected final BufferedReader keyboard = RkJavaGame.getInFile();
//    protected final PrintWriter console = RkJavaGame.getOutFile();
    private String report;
    
    public PrintMenuView(String rpt) {
        super("\n"
                + "\n------------------------------------"
                + "\n|           Print Report           |"
                + "\n------------------------------------"
                + "\nY - Yes, print report"
                + "\nN - No, do not print"
                + "\n------------------------------------"
                + "\nQ - Quit this menu"
                + "\n------------------------------------");
        report = rpt;
    }

    @Override
    public boolean doAction(String yesNo) {

        yesNo = yesNo.toUpperCase(); //convert value to uppercase

        switch (yesNo) {
            case "Y":
                saveReport();
                break;
            case "N":
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.display();
                break;

            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

   private void saveReport() {
        // prompt and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the report "
                           + "is to be saved.");
        String filePath = "";
        try {
            filePath = keyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(PrintMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try (PrintWriter out = new PrintWriter(filePath)){
            //save the report to the specified file
            out.printf(report);
            this.console.println("Your report was saved successfully");
        }catch (IOException ex) {
            ErrorView.display("I/O Error", ex.getMessage());
        }
    }

}
