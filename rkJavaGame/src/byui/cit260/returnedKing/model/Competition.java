/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author thiag
 */
public class Competition implements Serializable {

    // class instance variables
    private int playerInput;
    private int charStrength;
    private int actualStamina;
    private int maxStamina;
    private Game[] game;

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

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.playerInput;
        hash = 37 * hash + this.charStrength;
        hash = 37 * hash + this.actualStamina;
        hash = 37 * hash + this.maxStamina;
        hash = 37 * hash + Arrays.deepHashCode(this.game);
        return hash;
    }

    @Override
    public String toString() {
        return "Competition{" + "playerInput=" + playerInput + ", charStrength=" + charStrength + ", actualStamina=" + actualStamina + ", maxStamina=" + maxStamina + ", game=" + game + '}';
    }

    @Override
    public boolean equals(Object obj) {
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
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        return true;
    }

}
