/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;
import java.util.Arrays;
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
    private int totalPrice;
    

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
    
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.start);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numCode) ^ (Double.doubleToLongBits(this.numCode) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Objects.hashCode(this.combat);
        hash = 53 * hash + Objects.hashCode(this.wood);
        hash = 53 * hash + Objects.hashCode(this.competition);
        hash = 53 * hash + Arrays.deepHashCode(this.items);
        hash = 53 * hash + Objects.hashCode(this.actor);
        hash = 53 * hash + this.totalPrice;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "start=" + start + ", numCode=" + numCode + ", player=" + player + ", map=" + map + ", combat=" + combat + ", wood=" + wood + ", competition=" + competition + ", items=" + items + ", actor=" + actor + ", totalPrice=" + totalPrice + '}';
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.combat, other.combat)) {
            return false;
        }
        if (!Objects.equals(this.wood, other.wood)) {
            return false;
        }
        if (!Objects.equals(this.competition, other.competition)) {
            return false;
        }
        if (!Arrays.deepEquals(this.items, other.items)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        if (this.totalPrice != other.totalPrice) {
            return false;
        }
        return true;
    }
    
    
    
}
