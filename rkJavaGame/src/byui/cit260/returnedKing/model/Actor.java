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

    Guard("Guard", 80, 100),
    Bandit("Bandit", 60, 40),
    RogueWarrior("Rogue Warrior", 40, 40),
    DrunkenSailor("Drunken Sailor", 1, 1),
    PrisonGuard("Prison Gaurd", 95, 90),
    TavernOwner("Tavern Owner", 1, 1),
    DrunkFarmer("Drunk Farmer", 1, 1),
    ShadyMan("Shady Man", 1, 1),
    Nun("Nun", 1, 1),
    Priest1("First Priest", 1, 1),
    Priest2("Second Priest", 1, 1),
    FalseKing("False King", 100, 120);
    
    

    private final String description;
    public final int actorStrength;
    public final int actorStamina;
    private final Point coordinates;

    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    Actor(String description, int actorStrength, int actorStamina) {
        this.description = description;
        this.actorStrength = actorStrength;
        this.actorStamina = actorStamina;
        coordinates = new Point(1, 1);
    }

    public String getDescription() {
        return description;
    }

    public int getActorStrength() {
        return actorStrength;
    }
    
    public int getActorStamina() {
        return actorStamina;
    }

    public Point getCoordinates() {
        return coordinates;
    }

}
