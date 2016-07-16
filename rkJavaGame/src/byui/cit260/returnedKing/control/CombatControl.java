/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnedKing.control;

import byui.cit260.returnedKing.exceptions.CombatControlException;
import byui.cit260.returnedKing.model.Actor;
import byui.cit260.returnedKing.model.Game;
import byui.cit260.returnedKing.model.Player;
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
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();

        String pInput = null;
        int myInt = 0;
        int playerStrength = player.getStrength();
        int playerIntelligence = player.getIntellegence();
        int playerStamina = player.getActualStamina();
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
//            
            double damageReceived = (playerStrength + playerIntelligence + playerAttackItem - opponentStrength);
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            player.setActualStamina((int) (player.getActualStamina() - playerDamageReceived));
            
            while (Actor.Guard.actorActStam > 0 && player.getActualStamina() > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + player.getActualStamina());
            }
            if (Actor.Guard.actorActStam <= 0) {
                throw new CombatControlException("You won!");
            } //else {
            if (player.getActualStamina() <= 0) {
                this.console.println("You have died.");
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
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();
// <editor-fold defaultstate="collapsed" desc="East Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        int playerStrength = player.getStrength();
        int playerIntelligence = player.getIntellegence();
        int playerStamina = player.getActualStamina();
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
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            player.setActualStamina((int) (player.getActualStamina() - playerDamageReceived));
            
            while (Actor.Guard.actorActStam > 0 && player.getActualStamina() > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + player.getActualStamina());
            }
            if (Actor.Bandit.actorActStam <= 0) {
                this.console.println("You won!");

                RoadEastClearView roadEastClearView = new RoadEastClearView();
                roadEastClearView.display();
            }
            if (player.getActualStamina() <= 0) {
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
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();
// <editor-fold defaultstate="collapsed" desc="North Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        int playerStrength = player.getStrength();
        int playerIntelligence = player.getIntellegence();
        int playerStamina = player.getActualStamina();
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
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            player.setActualStamina((int) (player.getActualStamina() - playerDamageReceived));
            
            while (Actor.Guard.actorActStam > 0 && player.getActualStamina() > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + player.getActualStamina());
            }
            if (Actor.Bandit.actorActStam <= 0) {
                this.console.println("You won!");

                RoadEastClearView roadEastClearView = new RoadEastClearView();
                roadEastClearView.display();
            }
            if (player.getActualStamina() <= 0) {
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
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();
// <editor-fold defaultstate="collapsed" desc="South Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        int playerStrength = player.getStrength();
        int playerIntelligence = player.getIntellegence();
        int playerStamina = player.getActualStamina();
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
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            player.setActualStamina((int) (player.getActualStamina() - playerDamageReceived));
            
            while (Actor.Guard.actorActStam > 0 && player.getActualStamina() > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + player.getActualStamina());
            }
            if (Actor.Bandit.actorActStam <= 0) {
                this.console.println("You won!");

                RoadEastClearView roadEastClearView = new RoadEastClearView();
                roadEastClearView.display();
            }
            if (player.getActualStamina() <= 0) {
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
        Game game = RkJavaGame.getCurrentGame(); 
        Player player = game.getPlayer();
// <editor-fold defaultstate="collapsed" desc="West Road Battle. Click on the + sign to OPEN.">
        String pInput = null;
        int myInt = 0;
        int playerStrength = player.getStrength();
        int playerIntelligence = player.getIntellegence();
        int playerStamina = player.getActualStamina();
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
            Actor.Guard.actorActStam = Actor.Guard.actorActStam - damageReceived;
            double playerDamageReceived = (opponentStrength - playerStrength + opponentAttack);
            player.setActualStamina((int) (player.getActualStamina() - playerDamageReceived));
            
            while (Actor.Guard.actorActStam > 0 && player.getActualStamina() > 0) {
                throw new CombatControlException("You hit for " + damageReceived
                        + " You have received a hit for " + playerDamageReceived
                        + "\nYour current health is " + player.getActualStamina());
            }
            if (Actor.Bandit.actorActStam <= 0) {
                this.console.println("You won!");

                RoadEastClearView roadEastClearView = new RoadEastClearView();
                roadEastClearView.display();
            }
            if (player.getActualStamina() <= 0) {
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
