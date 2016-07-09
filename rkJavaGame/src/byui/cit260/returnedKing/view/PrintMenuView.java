/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class PrintMenuView extends View {

//    protected final BufferedReader keyboard = RkJavaGame.getInFile();
//    protected final PrintWriter console = RkJavaGame.getOutFile();
    
    public PrintMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n|           Print Report           |"
                + "\n------------------------------------"
                + "\nY - Yes, print report"
                + "\nN - No, do not print"
                + "\n------------------------------------"
                + "\nQ - Quit this menu"
                + "\n------------------------------------");
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
        String filePath = this.getInput();
        
        try {
            //save the report to the specified file
            GameControl.saveReport(RkJavaGame.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("PrintMenuView", ex.getMessage());
        }
    }

}
