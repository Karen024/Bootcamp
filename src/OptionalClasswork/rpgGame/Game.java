package OptionalClasswork.rpgGame;

import OptionalClasswork.rpgGame.character.Assassin;
import OptionalClasswork.rpgGame.character.Character;
import OptionalClasswork.rpgGame.character.Mage;
import OptionalClasswork.rpgGame.character.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Character player;
    private Character npc;
    private int playerSkillCooldown;
    private int npcSkillCooldown;

    public static Character gameCreateCharacter() {
        professionMenu("Please choose your profession");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        Character chosenCharacter = null;
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
        chosenCharacter = professionChoose(choice, chosenCharacter);
        return chosenCharacter;
    }

    private static Character professionChoose(int choice, Character chosenCharacter) {
        switch (choice) {
            case 1:
                Warrior warrior = new Warrior();
                warrior = Warrior.getCharacter(warrior);
                chosenCharacter = warrior;
                break;
            case 2:
                Assassin assassin = new Assassin();
                assassin = Assassin.getCharacter(assassin);
                chosenCharacter = assassin;
                break;
            case 3:
                Mage mage = new Mage();
                mage = Mage.getCharacter(mage);
                chosenCharacter = mage;
        }
        return chosenCharacter;
    }

    private static void professionMenu(String s) {
        System.out.println(s);
        System.out.println("1 - Warrior");
        System.out.println("2 - Assassin");
        System.out.println("3 - Mage");
    }

    public static Character gameCreateOpponent() {
        professionMenu("Please choose npc profession");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        Character chosenCharacter = null;
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
        chosenCharacter = professionChoose(choice, chosenCharacter);
        return chosenCharacter;
    }

    public void startGame() {
        player = gameCreateCharacter();
        npc = gameCreateOpponent();
        printCharactersInfo();
        System.out.println();
        System.out.println("To start roll the dice (to decide first attacker) by typing roll");
        Scanner scn = new Scanner(System.in);
        String answer = scn.next();
        while (!answer.equals("roll")) {
            System.out.println("Wrong input pls type roll");
            answer = scn.next();
        }
        startBattle(player, npc);
    }

    private void startBattle(Character player, Character npc) {
        Random rnd = new Random();
        playerSkillCooldown = 0;
        npcSkillCooldown = 0;
        battleAction(player, npc, rnd);
        if (player.getHealth() == 0 && npc.getHealth() == 0) {
            System.out.println("Draw");
            return;
        } else if (player.getHealth() == 0) {
            System.out.println(npc.getName() + " won the game");
            return;
        } else if (npc.getHealth() == 0) {
            System.out.println(player.getName() + " won the game");
            return;
        }
    }

    private void battleAction(Character player, Character npc, Random rnd) {
        boolean round;
        round = !playerFirstOrNotWithDice();
        while (player.getHealth() > 0 && npc.getHealth() > 0) {
            if (!round) {
                round = playerStart(player, npc, rnd);
                System.out.println();
            } else {
                round = npcStart(player, npc, rnd);
                System.out.println();
            }
        }
    }

    private boolean playerStart(Character player, Character npc, Random rnd) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (stunCheckPlayer(player)) return true;
        attackTurnCasesPlayer(player, npc, rnd);
        System.out.println();
        printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
        return true;
    }

    private void attackTurnCasesPlayer(Character player, Character npc, Random rnd) {
        if (player instanceof Assassin) {
            if (((Assassin) player).isCriticalState()) {
                ((Assassin) player).attackCritical(npc);
            } else if (!useSkillOrNotPlayer(player, npc, rnd)) {
                if (playerSkillCooldown > 0) {
                    playerSkillCooldown--;
                }
                player.attack(npc);
            }
        } else {
            if (!useSkillOrNotPlayer(player, npc, rnd)) {
                if (playerSkillCooldown > 0) {
                    playerSkillCooldown--;
                }
                player.attack(npc);
            }
        }
    }

    private boolean stunCheckPlayer(Character player) {
        if (player.isStunState()) {
            player.setStunState(false);
            return true;
        }
        return false;
    }

    private boolean npcStart(Character player, Character npc, Random rnd) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (stunCheckNpc(npc)) return false;
        attackCasesNpc(player, npc, rnd);
        System.out.println();
        printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
        return false;
    }

    private void attackCasesNpc(Character player, Character npc, Random rnd) {
        if (npc instanceof Assassin) {
            if (((Assassin) npc).isCriticalState()) {
                ((Assassin) npc).attackCritical(player);
            } else if (!useSkillOrNotNpc(npc, player, rnd)) {
                if (npcSkillCooldown > 0) {
                    npcSkillCooldown--;
                }
                npc.attack(player);
            }
        } else {
            if (!useSkillOrNotNpc(npc, player, rnd)) {
                npc.attack(player);
                if (npcSkillCooldown > 0) {
                    npcSkillCooldown--;
                }
            }
        }
    }

    private boolean stunCheckNpc(Character npc) {
        if (npc.isStunState()) {
            npc.setStunState(false);
            return true;
        }
        return false;
    }

    private boolean useSkillOrNotPlayer(Character player, Character npc, Random rnd) {
        if (rnd.nextBoolean() && player.getEnergy() > 0 && playerSkillCooldown == 0) {
            playerSkillCooldown = player.useSkill(npc, playerSkillCooldown);
            return true;
        }
        return false;
    }

    private boolean useSkillOrNotNpc(Character npc, Character player, Random rnd) {
        if (rnd.nextBoolean() && npc.getEnergy() > 0 && npcSkillCooldown == 0) {
            npcSkillCooldown = npc.useSkill(player, npcSkillCooldown);
            return true;
        }
        return false;
    }

    private boolean playerFirstOrNotWithDice() {
        Random rnd = new Random();
        int dicePlayer = rnd.nextInt(6) + 1;
        int diceNpc = rnd.nextInt(6) + 1;
        printSouts(dicePlayer, diceNpc);
        if (playerStartCheck(dicePlayer, diceNpc)) return true;
        if (npcStartCheck(dicePlayer, diceNpc)) return false;
        return rnd.nextBoolean();

    }

    private boolean npcStartCheck(int dicePlayer, int diceNpc) {
        if (dicePlayer < diceNpc) {
            System.out.println();
            System.out.println("Npc starts first");
            return true;
        }
        return false;
    }

    private boolean playerStartCheck(int dicePlayer, int diceNpc) {
        if (dicePlayer > diceNpc) {
            System.out.println();
            System.out.println("Players starting first");
            return true;
        }
        return false;
    }

    private void printSouts(int dicePlayer, int diceNpc) {
        System.out.println();
        System.out.println("Players Dice");
        printDice(dicePlayer);
        System.out.println();
        System.out.println("Npc Dice");
        printDice(diceNpc);
        System.out.println();
    }

    private void printDice(int number) {
        switch (number) {
            case 1:
                System.out.print("  *  ");
                break;
            case 2:
                System.out.print("*\n\n  *");
                break;
            case 3:
                System.out.print("*\n  *  \n    *");
                break;
            case 4:
                System.out.print("*   * \n\n*   *");
                break;
            case 5:
                System.out.print("*   * \n  *  \n*   *");
                break;
            case 6:
                System.out.print("*    *\n*    *\n*    *");
        }
    }

    private void printCharactersInfo() {
        System.out.println();
        System.out.println(player.toString());
        System.out.println(npc.toString());
        System.out.println();
        System.out.println(player.getSkill().toString());
        System.out.println(npc.getSkill().toString());
    }

    private void printInGameInfo(Character player1, Character player2, int player1SkillCooldown, int player2SkillCooldown) {
        System.out.println(player1.getName() + " health = " + player1.getHealth() + ", " + player2.getName() + " health = " + player2.getHealth());
        System.out.println(player1.getName() + " skill cooldown = " + player1SkillCooldown + " " + player2.getName() + " skill cooldown = " + player2SkillCooldown);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", npc=" + npc +
                '}';
    }


}
