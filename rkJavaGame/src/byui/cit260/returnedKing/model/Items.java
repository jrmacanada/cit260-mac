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
public class Items implements Serializable{
    
    // class instance variables
    private String inventoryType;
    private double quantityInStock;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.inventoryType);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + '}';
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
        return true;
    }
    
    
    
}
