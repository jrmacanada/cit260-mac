/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;

/**
 *
 * @author Craig
 */
public class Combat implements Serializable {
    
    //class instance variables
    private int damageGiven;
    private int damageReceived;
    private int playerStrength;
    private int playerInteligence;
    private int attackItems;
    private int defenceItems;
    private int playerInput;
    
    private Game[] game;

    public Combat() {
    }
    
    

    public int getDamageGiven() {
        return damageGiven;
    }

    public void setDamageGiven(int damageGiven) {
        this.damageGiven = damageGiven;
    }

    public int getDamageReceived() {
        return damageReceived;
    }

    public void setDamageReceived(int damageReceived) {
        this.damageReceived = damageReceived;
    }

    public int getPlayerStrength() {
        return playerStrength;
    }

    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    public int getPlayerInteligence() {
        return playerInteligence;
    }

    public void setPlayerInteligence(int playerInteligence) {
        this.playerInteligence = playerInteligence;
    }

    public int getAttackItems() {
        return attackItems;
    }

    public void setAttackItems(int attackItems) {
        this.attackItems = attackItems;
    }

    public int getDefenceItems() {
        return defenceItems;
    }

    public void setDefenceItems(int defenceItems) {
        this.defenceItems = defenceItems;
    }

    public int getPlayerInput() {
        return playerInput;
    }

    public void setPlayerInput(int playerInput) {
        this.playerInput = playerInput;
        
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
        hash = 41 * hash + this.damageGiven;
        hash = 41 * hash + this.damageReceived;
        hash = 41 * hash + this.playerStrength;
        hash = 41 * hash + this.playerInteligence;
        hash = 41 * hash + this.attackItems;
        hash = 41 * hash + this.defenceItems;
        hash = 41 * hash + this.playerInput;
        return hash;
    }

    @Override
    public String toString() {
        return "Combat{" + "damageGiven=" + damageGiven + ", damageReceived=" + damageReceived + ", playerStrength=" + playerStrength + ", playerInteligence=" + playerInteligence + ", attackItems=" + attackItems + ", defenceItems=" + defenceItems + ", playerInput=" + playerInput + '}';
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
        final Combat other = (Combat) obj;
        if (this.damageGiven != other.damageGiven) {
            return false;
        }
        if (this.damageReceived != other.damageReceived) {
            return false;
        }
        if (this.playerStrength != other.playerStrength) {
            return false;
        }
        if (this.playerInteligence != other.playerInteligence) {
            return false;
        }
        if (this.attackItems != other.attackItems) {
            return false;
        }
        if (this.defenceItems != other.defenceItems) {
            return false;
        }
        if (this.playerInput != other.playerInput) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
