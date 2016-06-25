/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rkjavagame;

import byui.cit260.returnedKing.model.Player;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Item;
import byui.cit260.returnedKing.model.Location;
import byui.cit260.returnedKing.model.Map;
import byui.cit260.returnedKing.model.Scene;
import byui.cit260.returnedKing.model.Wood;
import byui.cit260.returnedKing.model.Combat;
import byui.cit260.returnedKing.model.Competition;
import byui.cit260.returnedKing.view.StartProgramView;

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
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
           
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
    
    
    
} 
