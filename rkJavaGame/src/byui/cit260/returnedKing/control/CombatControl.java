/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CombatControlException;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.view.ErrorView;
import byui.cit260.returnedKing.view.RoadEastClearView;
import byui.cit260.returnedKing.view.RoadNorthClearView;
import byui.cit260.returnedKing.view.RoadSouthClearView;
import byui.cit260.returnedKing.view.RoadWestClearView;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Random;
import rkjavagame.RkJavaGame;

/**
 * May 28, 2016
 *
 * @author thiago
 */
public class CombatControl {

    protected final BufferedReader keyboard = RkJavaGame.getInFile();
    protected final PrintWriter console = RkJavaGame.getOutFile();

    public double damageGiven()
            throws CombatControlException {

        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.Guard.actorStrength;
        double opponentStamina = Actor.Guard.actorStamina;
        //double opponentDefensePlace = 1;

//        this.console.println("How much Strength do you want to use?");
        try {
//            pInput = keyboard.readLine();
//        } catch (IOException ex) {
//            Logger.getLogger(CombatControl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            myInt = Integer.parseInt(pInput);
//            int playerAttackPlace = myInt;

//            if (playerAttackPlace < 1 || playerAttackPlace > 3) {
//                throw new CombatControlException("??");
//            }
//            if (playerAttackPlace == opponentDefensePlace) {
//                throw new CombatControlException("??");
//            }
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;
            /*
             if (Actor.Guard.actorActStam < 0) {
             throw new CombatControlException("You have defeated your enemy!");
             } else {
             if (PlayerControl.actualStamina < 0) {
             throw new CombatControlException("Your lost the battle!");
             } else {
                    
             }
             }
             */
            while (Actor.Guard.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + PlayerControl.actualStamina);
            }
            if (Actor.Guard.actorActStam <= 0) {
                throw new CombatControlException("You won!");
            } //else {
            if (PlayerControl.actualStamina <= 0) {
                System.out.println("You have died.");
//               MainMenuView mainM = new MainMenuView();
//               mainM.display();
                System.exit(0);
                //throw new CombatControlException("You Lost");

            }

            /*while (Actor.Guard.actorActStam > 0) {
             throw new CombatControlException("You hit for " + damageReceived);
             }
            
             while (PlayerControl.actualStamina > 0) {
             throw new CombatControlException("You have received a hit by " + playerDamageReceived);
             }
            
             if (Actor.Guard.actorActStam < 0) {
             throw new CombatControlException("You have defeated your enemy!");
  
             }
            
            
            
             if (PlayerControl.actualStamina < 0) {
             throw new CombatControlException("You loose the Battle");
             }
            
             */
            //return damageReceived;
        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");

        }

        return myInt;

    }

    public double fightBandit()
            throws CombatControlException {
// <editor-fold defaultstate="collapsed" desc="East Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.Bandit.actorStrength;
        double opponentStamina = Actor.Bandit.actorStamina;

        try {
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.Bandit.actorActStam = Actor.Bandit.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;

            while (Actor.Bandit.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + PlayerControl.actualStamina);

            }
            if (Actor.Bandit.actorActStam <= 0) {
                this.console.println("You won!");

                RoadEastClearView roadEastClearView = new RoadEastClearView();
                roadEastClearView.display();
            }
            if (PlayerControl.actualStamina <= 0) {
                this.console.println("You have died. Your quest and the game is ended.");

                System.exit(0);
            }

        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");
        }
        return myInt;
    }// </editor-fold>

    public double fightPrisonGuard()
            throws CombatControlException {
// <editor-fold defaultstate="collapsed" desc="North Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.PrisonGuard.actorStrength;
        double opponentStamina = Actor.PrisonGuard.actorStamina;

        try {
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.PrisonGuard.actorActStam = Actor.PrisonGuard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;

            while (Actor.PrisonGuard.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + PlayerControl.actualStamina);

            }
            if (Actor.PrisonGuard.actorActStam <= 0) {
                this.console.println("You won!");

                RoadNorthClearView roadNorthClearView = new RoadNorthClearView();
                roadNorthClearView.display();
            }
            if (PlayerControl.actualStamina <= 0) {
                this.console.println("You have died. Your quest and the game is ended.");

                System.exit(0);
            }

        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");
        }
        return myInt;
    }// </editor-fold>

    public double fightDrunkSailor()
            throws CombatControlException {
// <editor-fold defaultstate="collapsed" desc="South Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.DrunkSailor.actorStrength;
        double opponentStamina = Actor.DrunkSailor.actorStamina;

        try {
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.DrunkSailor.actorActStam = Actor.DrunkSailor.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;

            while (Actor.DrunkSailor.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + PlayerControl.actualStamina);

            }
            if (Actor.DrunkSailor.actorActStam <= 0) {
                this.console.println("You won!");

                RoadSouthClearView roadSouthClearView = new RoadSouthClearView();
                roadSouthClearView.display();
            }
            if (PlayerControl.actualStamina <= 0) {
                this.console.println("You have died. Your quest and the game is ended.");

                System.exit(0);
            }

        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");
        }
        return myInt;
    }// </editor-fold>

    public double fightRogueWarrior()
            throws CombatControlException {
// <editor-fold defaultstate="collapsed" desc="West Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        double playerStrength = PlayerControl.strength;
        double playerIntelligence = PlayerControl.intellegence;
        double playerStamina = PlayerControl.actualStamina;
        Random r = new Random();
        int low = 10;
        int high = 40;
        int playerAttackItem = r.nextInt(high - low) + low;
        int olow = 1;
        int ohigh = 15;
        int opponentAttack = r.nextInt(ohigh - olow) + olow;
        double opponentStrength = Actor.RogueWarrior.actorStrength;
        double opponentStamina = Actor.RogueWarrior.actorStamina;

        try {
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.RogueWarrior.actorActStam = Actor.RogueWarrior.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            PlayerControl.actualStamina = PlayerControl.actualStamina - playerDamageReceived;

            while (Actor.RogueWarrior.actorActStam > 0 && PlayerControl.actualStamina > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + PlayerControl.actualStamina);

            }
            if (Actor.RogueWarrior.actorActStam <= 0) {
                this.console.println("You won!");

                RoadWestClearView roadWestClearView = new RoadWestClearView();
                roadWestClearView.display();
            }
            if (PlayerControl.actualStamina <= 0) {
                this.console.println("You have died. Your quest and the game is ended.");

                System.exit(0);
            }

        } catch (NumberFormatException nf) {
            int playerAttackPlace = myInt;
            ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a valid number ***");
        }
        return myInt;
    }// </editor-fold>

}
