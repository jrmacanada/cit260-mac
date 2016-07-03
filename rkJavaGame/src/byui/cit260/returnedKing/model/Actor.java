/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author michaelcavey
 */
public enum Actor implements Serializable {

    Guard("Guards the gates", 90),
    Bandit("Attacks on the road", 60),
    RogueWarrior("Attacks on the road", 70),
    DrunkenSailor("He's a drunk sailor", 20),
    PrisonGuard("Guards the prison", 95),
    TavernOwner("Owns the Tavern", 200),
    DrunkFarmer("HE's a drunk farmer", 10),
    ShadyMan("Shady guy in the corner", 60),
    Nun("A Nun", 10),
    Priest1("First Priest", 20),
    Priest2("Second Priest", 20),
    FalseKing("Your Uncle", 100);

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
