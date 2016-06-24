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
 * @author Craig
 */
public class Scene implements Serializable {
    
    // class instance variables
    private String description;
    private String blockedLocation;
    private String publicInfo;
    private String privateInfo;
    private String activityType;
    private double activityScore;
    private String enemyType;
    private String enemySpecialSkill;
    private String finalCombat;
    private String finalRevelation;
    private String characterType;
    private String characterSpecialSkill;
    
    private Location location;
    
    private Character[] character;

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getPublicInfo() {
        return publicInfo;
    }

    public void setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
    }

    public String getPrivateInfo() {
        return privateInfo;
    }

    public void setPrivateInfo(String privateInfo) {
        this.privateInfo = privateInfo;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public double getActivityScore() {
        return activityScore;
    }

    public void setActivityScore(double activityScore) {
        this.activityScore = activityScore;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public String getEnemySpecialSkill() {
        return enemySpecialSkill;
    }

    public void setEnemySpecialSkill(String enemySpecialSkill) {
        this.enemySpecialSkill = enemySpecialSkill;
    }

    public String getFinalCombat() {
        return finalCombat;
    }

    public void setFinalCombat(String finalCombat) {
        this.finalCombat = finalCombat;
    }

    public String getFinalRevelation() {
        return finalRevelation;
    }

    public void setFinalRevelation(String finalRevelation) {
        this.finalRevelation = finalRevelation;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public String getCharacterSpecialSkill() {
        return characterSpecialSkill;
    }

    public void setCharacterSpecialSkill(String characterSpecialSkill) {
        this.characterSpecialSkill = characterSpecialSkill;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.blockedLocation);
        hash = 53 * hash + Objects.hashCode(this.publicInfo);
        hash = 53 * hash + Objects.hashCode(this.privateInfo);
        hash = 53 * hash + Objects.hashCode(this.activityType);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.activityScore) ^ (Double.doubleToLongBits(this.activityScore) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.enemyType);
        hash = 53 * hash + Objects.hashCode(this.enemySpecialSkill);
        hash = 53 * hash + Objects.hashCode(this.finalCombat);
        hash = 53 * hash + Objects.hashCode(this.finalRevelation);
        hash = 53 * hash + Objects.hashCode(this.characterType);
        hash = 53 * hash + Objects.hashCode(this.characterSpecialSkill);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedLocation=" + blockedLocation + ", publicInfo=" + publicInfo + ", privateInfo=" + privateInfo + ", activityType=" + activityType + ", activityScore=" + activityScore + ", enemyType=" + enemyType + ", enemySpecialSkill=" + enemySpecialSkill + ", finalCombat=" + finalCombat + ", finalRevelation=" + finalRevelation + ", characterType=" + characterType + ", characterSpecialSkill=" + characterSpecialSkill + '}';
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.activityScore) != Double.doubleToLongBits(other.activityScore)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.publicInfo, other.publicInfo)) {
            return false;
        }
        if (!Objects.equals(this.privateInfo, other.privateInfo)) {
            return false;
        }
        if (!Objects.equals(this.activityType, other.activityType)) {
            return false;
        }
        if (!Objects.equals(this.enemyType, other.enemyType)) {
            return false;
        }
        if (!Objects.equals(this.enemySpecialSkill, other.enemySpecialSkill)) {
            return false;
        }
        if (!Objects.equals(this.finalCombat, other.finalCombat)) {
            return false;
        }
        if (!Objects.equals(this.finalRevelation, other.finalRevelation)) {
            return false;
        }
        if (!Objects.equals(this.characterType, other.characterType)) {
            return false;
        }
        if (!Objects.equals(this.characterSpecialSkill, other.characterSpecialSkill)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
