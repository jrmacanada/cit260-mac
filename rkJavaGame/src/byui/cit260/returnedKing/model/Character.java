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
public enum Character implements Serializable{
    
    Guard("Guards the gates"),
    Bandit("Attacks on the road"),
    RogueWarrior("Attacks on the road"),
    DrunkenSailor("He's a drunk sailor"),
    PrisonGuard("Guards the prison"),
    TavernOwner("Owns the Tavern"),
    DrunkFarmer("HE's a drunk farmer"),
    ShadyMan("Shady guy in the corner"),
    Nun("A Nun"),
    Priest1("First Priest"),
    Priest2("Second Priest"),
    FalseKing("Your Uncle");
    
   private final String description;
    private final Point coordinates;
    
    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
    

}
