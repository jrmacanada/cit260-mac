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
public class Item implements Serializable {

    // class instance variables
    private String inventoryType;
    private String description;
    private int quantityInStock;
    private int unitPrice;
    private double calcUsableVolumeOfWagon;

    private Location[] location;

    public Item() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int i) {
        this.unitPrice = i;
    }

    public double getCalcUsableVolumeOfWagon() {
        return calcUsableVolumeOfWagon;
    }

    public void setCalcUsableVolumeOfWagon(double calcUsableVolumeOfWagon) {
        this.calcUsableVolumeOfWagon = calcUsableVolumeOfWagon;
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
        final Item other = (Item) obj;
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
