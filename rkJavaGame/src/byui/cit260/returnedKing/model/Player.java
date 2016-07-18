/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author michaelcavey
 */
public class Player implements Serializable {

    // class instance variables
    private String name;
    private double bestScore;
    private Game[] game;
    private ArrayList<Item> inventory;
    static private int maxStamina;
    static private int strength;
    private int actualStamina;
    static private int intellegence;

    public Player() {
        this.maxStamina = 80;
        this.strength = 100;
        this.actualStamina = 80;
        this.intellegence = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestScore() {
        return bestScore;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getActualStamina() {
        return actualStamina;
    }

    public void setActualStamina(int actualStamina) {
        this.actualStamina = actualStamina;
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
        hash = 59 * hash + Arrays.deepHashCode(this.game);
        hash = 59 * hash + Objects.hashCode(this.inventory);
        hash = 59 * hash + this.maxStamina;
        hash = 59 * hash + this.strength;
        hash = 59 * hash + this.actualStamina;
        hash = 59 * hash + this.intellegence;
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestScore=" + bestScore + ", inventory=" + inventory + ", maxStamina=" + maxStamina + ", strength=" + strength + ", actualStamina=" + actualStamina + ", intellegence=" + intellegence + ", game=" + game + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestScore) != Double.doubleToLongBits(other.bestScore)) {
            return false;
        }
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (this.maxStamina != other.maxStamina) {
            return false;
        }
        if (this.strength != other.strength) {
            return false;
        }
        if (this.actualStamina != other.actualStamina) {
            return false;
        }
        if (this.intellegence != other.intellegence) {
            return false;
        }
        return true;
    }

}
