/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import java.io.BufferedReader;
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

        StringBuilder line;
        String fullReport = "";

        Game game = RkJavaGame.getCurrentGame();
        Item[] items = game.getItems();
        fullReport = "\r\n       LIST OF MIKE'S ITEMS \r\n";
        this.console.print(fullReport);
        line = new StringBuilder("                                        ");
        line.insert(0, "DESCRIPTION");
        line.insert(15, "QUANTITY");
        line.insert(25, "UNIT PRICE");
        fullReport += line.toString() + "\r\n";
        this.console.println(line.toString());

        for (Item item : items) {
            line = new StringBuilder("                                        ");
            line.insert(0, item.getDescription());
            line.insert(18, item.getQuantityInStock());
            line.insert(28, item.getUnitPrice());
            fullReport += line.toString() + "\n";
            this.console.println(line.toString());
        }
        
        this.console.println("\n Would you like to print the LIST to a file?");
        
        PrintMenuView printMenuView = new PrintMenuView(fullReport);
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
//                    this.console.println("I/O Error: " + ex.getMEssage());
//                    }





// L11 Mike's Report (2nd attempt per the "Stream I/O" document)
    
//    public void printInventoryReport(ArrayList<Item> inventoryItems,
//                                     Spring outputLocation) {
//
////        Game game = RkJavaGame.getCurrentGame();
////        Item[] items = game.getItems();
//
//        // create BufferedReader object for input file
//        try (PrintWriter out = new PrintWriter(outputLocation)) {
//
//            // print title and column headers
//            out.println("\n\n            Inventory Report            ");
//            out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Price");
//            out.printf("%n%-20s%10s%10s", "-----------", "--------", "-----");
//
//            // print the description, quantity, and price of each item
//            for (Item item : inventoryItems) {
//                out.printf("%n%-20s%7d%13.2s", item.getDescription()
//                                            , item.getQuantityInStock()
//                                            , item.getUnitPrice());
//            }
//        } catch (IOException ex) {
//            this.console.println("I/O Error: " + ex.getMessage());
//        }
//    }
    

    
        
       
    
    
    
    

