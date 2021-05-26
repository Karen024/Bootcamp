package OptionalClasswork.RpgGame;

import OptionalClasswork.RpgGame.Character.Assassin;
import OptionalClasswork.RpgGame.Character.Character;
import OptionalClasswork.RpgGame.Character.Mage;
import OptionalClasswork.RpgGame.Character.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Character player;
    private Character npc;

    public static Character GameCreateCharacter() {
        System.out.println("Please choose your profession");
        System.out.println("1 - Warrior");
        System.out.println("2 - Assassin");
        System.out.println("3 - Mage");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        Character chosenCharacter = null;
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
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


    public static Character GameCreateOpponent() {
        System.out.println("Please choose npc profession");
        System.out.println("1 - Warrior");
        System.out.println("2 - Assassin");
        System.out.println("3 - Mage");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        Character chosenCharacter = null;
        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
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

    public void startGame() {
        player = GameCreateCharacter();
        npc = GameCreateOpponent();
        printCharactersInfo();
        System.out.println();
        System.out.println("To start roll the dice (to decide first attacker) by typing roll");
        Scanner scn = new Scanner(System.in);
        String answer = scn.next();
        while (!answer.equals("roll")) {
            System.out.println("Wrong input pls type roll");
            answer = scn.next();
        }
        Random rnd = new Random();
        boolean first = playerFirstOrNotWithDice();
        if (first) {
            startBattle(player, npc);
        } else {
            startBattle(npc, player);
        }

    }

    //start game from player
    public void startBattle(Character player, Character npc) {
        boolean round = false;
        Random rnd = new Random();
        int playerSkillCooldown = 0;
        int npcSkillCooldown = 0;
        boolean stunCountPlayer = false;
        boolean stunCountNpc = false;
        boolean criticalReadyPlayer = false;
        boolean criticalReadyNpc = false;
        while (player.getHealth() >= 0 && npc.getHealth() >= 0) {
            if (round == false) {
                if (stunCountPlayer) {
                    stunCountPlayer = false;
                    round = true;
                    continue;
                }
                if (criticalReadyPlayer) {
                    attackCritical(player, npc);
                    printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                    criticalReadyPlayer = false;
                    round = true;
                    continue;
                }
                if (rnd.nextBoolean() == true && playerSkillCooldown <= 0) {
                    if (player.getEnergy() > 0) {
                        if (player.getSkill().getSkillName() == "Stun") {
                            stunCountNpc = true;
                        }
                        if (player.getSkill().getSkillName() == "Prepare Critical") {
                            criticalReadyPlayer = true;
                        }
                        playerSkillCooldown = useSkill(player, npc);
                        printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                        round = true;
                        continue;
                    }
                } else if (playerSkillCooldown > 0) {
                    playerSkillCooldown--;
                }
                attack(player, npc);
                printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                round = true;
            } else {
                if (stunCountNpc) {
                    stunCountNpc = false;
                    round = false;
                    continue;
                }
                if (criticalReadyNpc) {
                    attackCritical(npc, player);
                    printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                    criticalReadyNpc = false;
                    round = false;
                    continue;
                }
                if (rnd.nextBoolean() == true && npcSkillCooldown <= 0) {
                    if (npc.getEnergy() > 0) {
                        if (npc.getSkill().getSkillName() == "Stun") {
                            stunCountPlayer = true;
                        }
                        if (npc.getSkill().getSkillName() == "Prepare Critical") {
                            criticalReadyNpc = true;
                        }
                        npcSkillCooldown = useSkill(npc, player);
                        printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                        round = false;
                        continue;
                    }
                } else if (npcSkillCooldown > 0) {
                    npcSkillCooldown--;
                }
                attack(npc, player);
                printInGameInfo(player, npc, playerSkillCooldown, npcSkillCooldown);
                round = false;
            }
        }
        if (player.getHealth() <= 0 && npc.getHealth() <= 0) {
            System.out.println("Draw");
            return;
        } else if (player.getHealth() <= 0) {
            System.out.println(npc.getName() + " won the game");
            return;
        } else if (npc.getHealth() <= 0) {
            System.out.println(player.getName() + " won the game");
            return;
        }
    }

    public void attackCritical(Character player1, Character player2) {
        Random rnd = new Random();
        int damageReceivedByPlayer2FromPlayer1 = player1.getDamage() * 3 - rnd.nextInt(30) + 1;
        System.out.println(player2.getName() + " received " + damageReceivedByPlayer2FromPlayer1 + " damage");
        player2.setHealth(player2.getHealth() - damageReceivedByPlayer2FromPlayer1);
    }

    public void attack(Character player1, Character player2) {
        Random rnd = new Random();
        int damageReceivedByPlayer2FromPlayer1 = (player1.getDamage() - ((player2.getDefense() * player1.getDamage()) / 100)) - rnd.nextInt(10) + 1;
        System.out.println(player2.getName() + " received " + damageReceivedByPlayer2FromPlayer1 + " damage");
        player2.setHealth(player2.getHealth() - damageReceivedByPlayer2FromPlayer1);
    }

    public boolean playerFirstOrNotWithDice() {
        Random rnd = new Random();
        int dicePlayer = rnd.nextInt(6) + 1;
        int diceNpc = rnd.nextInt(6) + 1;
        System.out.println("Player dice dropped " + dicePlayer + " and npc dropped " + diceNpc);
        if (dicePlayer > diceNpc) {
            System.out.println("Players starting first");
            return true;
        } else if (dicePlayer < diceNpc) {
            System.out.println("Npc starts first");
            return false;
        } else {
            return rnd.nextBoolean();
        }
    }

    public int useSkill(Character player1, Character player2) {
        Random rnd = new Random();

        int damage = player1.getSkill().getSkillDamage();
        int cost = player1.getSkill().getSkillCost();
        int cooldown = player1.getSkill().getSkillCooldown();

        if (player1.getSkill().getSkillName() == "Fireball") {
            player2.setHealth(player2.getHealth() - damage);
            player1.setEnergy(player1.getEnergy() - cost);
            printSkillUsageInfo("Fireball", player1, player2, damage);
            return cooldown;

        } else if (player1.getSkill().getSkillName() == "Magic Armor") {

            player1.setHealth(player1.getHealth() + damage);
            System.out.println(player1.getName() + " used Magic Armor skill on himself");
            System.out.println(player1.getName() + " healed by " + damage + " points");

            player1.setEnergy(player1.getEnergy() - cost);
            return cooldown;

        } else if (player1.getSkill().getSkillName() == "Slice") {
            player2.setHealth(player2.getHealth() - damage);
            player1.setEnergy(player1.getEnergy() - cost);
            printSkillUsageInfo("Slice", player1, player2, damage);
            return cooldown;

        } else if (player1.getSkill().getSkillName() == "Stun") {
            player2.setHealth(player2.getHealth() - damage);
            player1.setEnergy(player1.getEnergy() - cost);
            printSkillUsageInfo("Stun", player1, player2, damage);
            return cooldown;

        } else if (player1.getSkill().getSkillName() == "Triple Shot") {
            int tripleDamage = (player1.getDamage() * 3) - (rnd.nextInt(10) + 1) * 3;
            player2.setHealth(player2.getHealth() - tripleDamage);
            player1.setEnergy(player1.getEnergy() - cost);
            printSkillUsageInfo("Triple Shot", player1, player2, tripleDamage);
            return cooldown;

        } else {
            player1.setEnergy(player1.getEnergy() - cost);
            System.out.println(player1.getName() + " used Prepare Critical skill on " + player2.getName());
            return cooldown;
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", npc=" + npc +
                '}';
    }

    public void printCharactersInfo() {
        System.out.println();
        System.out.println(player.toString());
        System.out.println(npc.toString());
        System.out.println();
        System.out.println(player.getSkill().toString());
        System.out.println(npc.getSkill().toString());
    }

    public void printSkillUsageInfo(String string, Character player1, Character player2, int damage) {
        if (string == "Fireball") {
            System.out.println(player1.getName() + " used Fireball skill on " + player2.getName());
            System.out.println(player1.getName() + " dealt " + damage + " damage to " + player2.getName());
        }
        if (string == "Slice") {
            System.out.println(player1.getName() + " used Slice skill on " + player2.getName());
            System.out.println(player1.getName() + " dealt " + damage + " damage to " + player2.getName());
        }
        if (string == "Stun") {
            System.out.println(player1.getName() + " used Stun skill on " + player2.getName());
            System.out.println(player1.getName() + " dealt " + damage + " damage to " + player2.getName());
        }
        if (string == "Triple Shot") {
            System.out.println(player1.getName() + " used Triple Shot skill on " + player2.getName());
            System.out.println(player1.getName() + " dealt " + damage + " damage to " + player2.getName());
        }
        if (string == "Magic Heal") {
            System.out.println(player1.getName() + " used Magic Armor skill on himself");
            System.out.println(player1.getName() + " healed by " + damage + " points");
        }
    }

    public void printInGameInfo(Character player1, Character player2, int player1SkillCooldown, int player2SkillCooldown) {
        System.out.println(player1.getName() + " health = " + player1.getHealth() + ", " + player2.getName() + " health = " + player2.getHealth());
        System.out.println(player1.getName() + " skill cooldown = " + player1SkillCooldown + " " + player2.getName() + " skill cooldown = " + player2SkillCooldown);
        System.out.println();
    }
}
