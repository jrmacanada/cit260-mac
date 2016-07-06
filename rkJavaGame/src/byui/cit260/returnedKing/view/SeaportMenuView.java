/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.view;

//import java.util.Scanner;

/**
 *
 * @author michaelcavey
 */
public class SeaportMenuView extends View {

    public SeaportMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n|                 Seaport                 |"
                + "\n--------------------------------------------"
                + "\n Your options for this scene are:"
                + "\n1 - Talk to sailor"
                + "\n2 - Camp on beach"
                + "\n3 - Board ship to America"
                + "\n--------------------------------------------"
                + "\nN - Move North"
                + "\nS - Move South"
                + "\nE - Move East"
                + "\nW - Move West"
                + "\n--------------------------------------------"
                + "\n  At anytime you may use D-X-L-R"
                + "\n--------------------------------------------"
                + "\nQ - Quit to Game Menu"
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to uppercase

        switch (value) {
            case "1":
                this.talkSailor();
                break;
            case "2":
                this.campBeach();
                break;
            case "3":
                this.enterAmerica();
                break;
            case "N":
                this.enterChurch();
                break;
            case "S":
                this.notAvailable();
                break;
            case "E":
                this.notAvailable();
                break;
            case "W":
                this.enterHabortown();
                break;
            case "D":
                this.mapView();
                break;
            case "X":
                this.tellMore();
                break;
            case "L":
                this.mySupplies();
                break;
            case "R":
                this.myStats();
                break;
                
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }
    
    private void tellMore() {
        System.out.println(" The seaport is a dangerous place that plays by its own rules."
                + "\n Foriegn travelers have never been subject to the King's rule."
                + "\n Neither have they been rebelous. They only defend their iberty");
    }

    private void enterChurch() {
        ChurchMenuView churchMenuView = new ChurchMenuView();
        churchMenuView.display();
    }
    
    private void enterHabortown() {
        HarbortownMenuView harbortownMenuView = new HarbortownMenuView();
        harbortownMenuView.display();
    }
    
    private void notAvailable() {
        System.out.println(" You can go for a swim to relax, but you'll "
                + "\n need a boat to continue in this direction.");
    }

    private void mapView() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }

    private void mySupplies() {
        // This function should list the player's supplies 
        // (food, coin, weapons, artifacts) stored in his wagon.
        // For now it redirects to the Items List of all available items.
        ItemListMenuView itemListMenuView = new ItemListMenuView();
        itemListMenuView.display();
    }

    private void myStats() {
        System.out.println(" This function will display the player's"
                + "\n Stamina, Strength, and Aura statistics.");
    }
    
    private void talkSailor() {
        System.out.println("*** stub to talkSailor() function ***");
    }

    private void campBeach() {
        System.out.println("*** stub to campBeach() function ***");
    }

    private void enterAmerica() {
        System.out.println("*** stub to enterAmerica() function ***");
    }

}
