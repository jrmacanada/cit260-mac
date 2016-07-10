/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author michaelcavey
 */
public enum Actor implements Serializable {

    Guard("Guard", 90),
    Bandit("Bandit", 60),
    RogueWarrior("Rogue Warrior", 70),
    DrunkenSailor("Drunken Sailor", 20),
    PrisonGuard("Prison Gaurd", 95),
    TavernOwner("Tavern Owner", 200),
    DrunkFarmer("Drunk Farmer", 10),
    ShadyMan("Shady Man", 60),
    Nun("Nun", 10),
    Priest1("First Priest", 20),
    Priest2("Second Priest", 20),
    FalseKing("False King", 100);
    
    

    private final String description;
    public final int playerStrength;
    private final Point coordinates;

    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    Actor(String description, int playerStrength) {
        this.description = description;
        this.playerStrength = playerStrength;
        coordinates = new Point(1, 1);
    }

    public String getDescription() {
        return description;
    }

    public int getPlayerStrength() {
        return playerStrength;
    }

    public Point getCoordinates() {
        return coordinates;
    }

}
