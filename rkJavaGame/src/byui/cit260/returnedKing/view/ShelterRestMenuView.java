/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.PrintWriter;
import rkjavagame.RkJavaGame;

/**
 *
 * @author michaelcavey
 */
public class ShelterRestMenuView  {
    
    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    void displayShelterRestMenuView() {
        this.console.println("*Calls the shelterRest() function*");
    }
    
}
