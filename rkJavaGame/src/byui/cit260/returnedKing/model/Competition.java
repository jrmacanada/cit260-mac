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
public class Competition implements Serializable{
    
    // class instance variables
    private int playerInput;
    private int charStrength;
    private int actualStamina;
    private int maxStamina;

    public Competition() {
    }
    
    

    public int getPlayerInput() {
        return playerInput;
    }

    public void setPlayerInput(int playerInput) {
        this.playerInput = playerInput;
    }

    public int getCharStrength() {
        return charStrength;
    }

    public void setCharStrength(int charStrength) {
        this.charStrength = charStrength;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.playerInput;
        hash = 73 * hash + this.charStrength;
        hash = 73 * hash + this.actualStamina;
        hash = 73 * hash + this.maxStamina;
        return hash;
    }

    @Override
    public String toString() {
        return "Competition{" + "playerInput=" + playerInput + ", charStrength=" + charStrength + ", actualStamina=" + actualStamina + ", maxStamina=" + maxStamina + '}';
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
        final Competition other = (Competition) obj;
        if (this.playerInput != other.playerInput) {
            return false;
        }
        if (this.charStrength != other.charStrength) {
            return false;
        }
        if (this.actualStamina != other.actualStamina) {
            return false;
        }
        if (this.maxStamina != other.maxStamina) {
            return false;
        }
        return true;
    }
    



}
