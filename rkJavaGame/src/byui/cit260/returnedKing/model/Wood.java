/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;


/**
 *
 * @author thiag
 */
public class Wood implements Serializable{
    
    // class instance variables
    private int charStamina;
    private int charStrength;
    private double reward;
    private int playerInput;
    private int actualStamina;
    private int maxStamina;
    private int axeBonus;
    
    private Game[] game;
     
    public Wood() {
    }

    public int getCharStamina() {
        return charStamina;
    }

    public void setCharStamina(int charStamina) {
        this.charStamina = charStamina;
    }

    public int getCharStrength() {
        return charStrength;
    }

    public void setCharStrength(int charStrength) {
        this.charStrength = charStrength;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public int getPlayerInput() {
        return playerInput;
    }

    public void setPlayerInput(int playerInput) {
        this.playerInput = playerInput;
    }

    public int getActualStamina() {
        return actualStamina;
    }

    public void setActualStamina(int actualStamina) {
        this.actualStamina = actualStamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public int getAxeBonus() {
        return axeBonus;
    }

    public void setAxeBonus(int axeBonus) {
        this.axeBonus = axeBonus;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.charStamina;
        hash = 79 * hash + this.charStrength;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 79 * hash + this.playerInput;
        hash = 79 * hash + this.actualStamina;
        hash = 79 * hash + this.maxStamina;
        hash = 79 * hash + this.axeBonus;
        return hash;
    }

    @Override
    public String toString() {
        return "Wood{" + "charStamina=" + charStamina + ", charStrength=" + charStrength + ", reward=" + reward + ", playerInput=" + playerInput + ", actualStamina=" + actualStamina + ", maxStamina=" + maxStamina + ", axeBonus=" + axeBonus + '}';
    }
      
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wood other = (Wood) obj;
        if (this.charStamina != other.charStamina) {
            return false;
        }
        if (this.charStrength != other.charStrength) {
            return false;
        }
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (this.playerInput != other.playerInput) {
            return false;
        }
        if (this.actualStamina != other.actualStamina) {
            return false;
        }
        if (this.maxStamina != other.maxStamina) {
            return false;
        }
        if (this.axeBonus != other.axeBonus) {
            return false;
        }
        return true;
    }
    
     
    
    
    
}

