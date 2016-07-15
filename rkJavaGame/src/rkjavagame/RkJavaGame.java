/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rkjavagame;

import byui.cit260.returnedKing.model.Player;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author michaelcavey
 */
public class RkJavaGame {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    private static Game totalPrice = null;
    private static Game currentReport = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {

            // open character stream files for the end user input and output
            RkJavaGame.inFile
                    = new BufferedReader(new InputStreamReader(System.in));

            RkJavaGame.outFile = new PrintWriter(System.out, true);

            // open log file
            String filePath = "log.txt";
            RkJavaGame.logFile = new PrintWriter(filePath);

            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;

        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();

        } finally {
            try {
                if (RkJavaGame.inFile != null) {
                    RkJavaGame.inFile.close();
                }

                if (RkJavaGame.outFile != null) {
                    RkJavaGame.outFile.close();
                }

                if (RkJavaGame.logFile != null) {
                    RkJavaGame.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RkJavaGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RkJavaGame.player = player;
    }

    public static Game getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(Game totalPrice) {
        RkJavaGame.totalPrice = totalPrice;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RkJavaGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RkJavaGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        RkJavaGame.logFile = logFile;
    }

    public static Game getCurrentReport() {
        return currentReport;
    }

    public static void setCurrentReport(Game currentReport) {
        RkJavaGame.currentReport = currentReport;
    }
    
    

}