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

    public Item(String type, String description, int quantityInStock, int unitPrice) {
        this.inventoryType = type;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Item(Item item) {
        this.inventoryType = item.inventoryType;
        this.description = item.description;
        this.quantityInStock = item.quantityInStock;
        this.unitPrice = item.unitPrice;
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
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.inventoryType);
        hash = 41 * hash + Objects.hashCode(this.description);
        hash = 41 * hash + this.quantityInStock;
        hash = 41 * hash + this.unitPrice;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) ^ (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) >>> 32));
        hash = 41 * hash + Arrays.deepHashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", description=" + description + ", quantityInStock=" + quantityInStock + ", unitPrice=" + unitPrice + ", calcUsableVolumeOfWagon=" + calcUsableVolumeOfWagon + ", location=" + location + '}';
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (Double.doubleToLongBits(this.calcUsableVolumeOfWagon) != Double.doubleToLongBits(other.calcUsableVolumeOfWagon)) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
