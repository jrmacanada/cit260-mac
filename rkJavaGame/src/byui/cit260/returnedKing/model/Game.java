/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author michaelcavey
 */
public class Game implements Serializable{
    
    // class instance variables
    private String start;
    private double numCode;
    
    private Player player;
    private Map map;
    private Combat combat;
    private Wood wood;
    private Competition competition;
    
    private Item[] items;
    
    private Actor actor;
    

    public Game() {
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public double getNumCode() {
        return numCode;
    }

    public void setNumCode(double numCode) {
        this.numCode = numCode;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Combat getCombat() {
        return combat;
    }

    public void setCombat(Combat combat) {
        this.combat = combat;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    

    
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.start);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.numCode) ^ (Double.doubleToLongBits(this.numCode) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "start=" + start + ", numCode=" + numCode + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.start, other.start)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numCode) != Double.doubleToLongBits(other.numCode)) {
            return false;
        }
        return true;
    }
    
    
    
}
