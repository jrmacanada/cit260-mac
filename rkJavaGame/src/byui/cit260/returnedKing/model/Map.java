/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.model;

import byui.cit260.returnedKing.view.ErrorView;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author michaelcavey
 */
public class Map implements Serializable {

    // class instance variables
    private int rowCount;
    private int columnCount;
    private Game[] game;
    public Location[][] locations;
    private Location currentLocation;
    private int currentRow = 0;
    private int currentColumn = 0;
    private Scene[] scenes;
    private Map currentMap;

    public Map() {
    }

    public Map(int rowCount, int columnCount) {

        if (rowCount < 1 || columnCount < 1) {
            ErrorView.display(this.getClass().getName(),
                    "*** The number of rows and columns must be > zero ***");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;

        // create 2-D array for Location objects
        this.locations = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                // create and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                // assign the location object to the current position in the array
                locations[row][column] = location;
            }
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public Map getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(Map currentMap) {
        this.currentMap = currentMap;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + Arrays.deepHashCode(this.game);
        hash = 37 * hash + Arrays.deepHashCode(this.locations);
        hash = 37 * hash + Objects.hashCode(this.currentLocation);
        hash = 37 * hash + this.currentRow;
        hash = 37 * hash + this.currentColumn;
        hash = 37 * hash + Arrays.deepHashCode(this.scenes);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", game=" + game + ", locations=" + locations + ", currentLocation=" + currentLocation + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", scenes=" + scenes + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Arrays.deepEquals(this.scenes, other.scenes)) {
            return false;
        }
        return true;
    }

}
