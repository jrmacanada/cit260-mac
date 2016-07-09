/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.control.GameControl;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class ReportMenuView {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public void displayMikesReport() {
//        String filePath = this.getInput();
        StringBuilder line;

        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();

        this.console.println("\n       LIST OF MIKE'S ITEMS");
        line = new StringBuilder("                                        ");
        line.insert(0, "DESCRIPTION");
        line.insert(15, "QUANTITY");
        line.insert(25, "UNIT PRICE");
        this.console.println(line.toString());

        for (Item item : items) {
            line = new StringBuilder("                                        ");
            line.insert(0, item.getDescription());
            line.insert(18, item.getQuantityInStock());
            line.insert(28, item.getUnitPrice());

            this.console.println(line.toString());
        }
        
        // prompt and get the name of the file to save the game in
        this.console.println("\n Would you like to print the LIST to a file?");
        
        PrintMenuView printMenuView = new PrintMenuView() {};
        printMenuView.display();
    }
        
}


    
// L11 Craig's Report   
    
//    public void actorPrintList(ArrayList<actor> act,
//                                String outputLocation) {
//        
//        try (PrintWriter out = new PrintWriter(outputLocation)) {
//            
//            out.println("n\n       Actor List Report       ");
//            out.printf("%n%-20s%10s%10s", "Description", "Strength");
//            out.printf("%n%-20s%10s%10s", "-----------", "--------");
//            
//            for (Actor actor : act) {
//                out.printf("%n%-20s%7d%13.2f", act.getDescription()
//                                               act.getPlayerStrength());
//            }
//            
//            }catch (IOException ex) {
//                    System.out.println("I/O Error: " + ex.getMEssage());
//                    }



        
    
        
       
    
    
    
    

