/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 05-26-2016 Recommit with proper message
 * @author michaelcavey
 */
public class Items implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private double quantityInStock;
    private double calcUsableVolumeOfWagon;
    
    private Game game;
    
    private Location[] location;

    public Items() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getCalcUsableVolumeOfWagon() {
        return calcUsableVolumeOfWagon;
    }

    public void setCalcUsableVolumeOfWagon(double calcUsableVolumeOfWagon) {
        this.calcUsableVolumeOfWagon = calcUsableVolumeOfWagon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.inventoryType);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) ^ (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", calcUsableVolumeOfWagon=" + calcUsableVolumeOfWagon + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Items other = (Items) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) != Double.doubleToLongBits(other.calcUsableVolumeOfWagon)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
