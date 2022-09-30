package rockpaperscissor;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    Random random = new Random();
    Player player = new Player(0, false);
    Player computer = new Player(0, false);
    private int roundCount = 0;

    public int getRoundCount() {
        return roundCount;
    }

    public int makeComputerChoice() {
        int computerChoice = random.nextInt(3) + 1;
        return computerChoice;
    }

    public void makeBattle(int choice, int computerChoice) {
        switch (choice) {
            case 1://rock
                doFor1(computerChoice);
                break;
            case 2://scissor
                doFor2(computerChoice);
                break;
            case 3://paper
                doFor3(computerChoice);
                break;
            default:
                computer.setPlayerScore(1);
                roundCount++;
                break;
        }
    }
    public void checkWhoWin(){

    }

    public void doFor1(int computerChoice) {
        if (computerChoice == 1) {
            System.out.println("You both went with rock - the round is tie");
            roundCount++;
        } else if (computerChoice == 2) {
            System.out.println("Computer went with scissor - you win the round!");
            player.setPlayerScore(1);
            roundCount++;
        } else {
            System.out.println("Computer went with paper - you lose the round!");
            computer.setPlayerScore(1);
            roundCount++;
        }
    }

    public void doFor2(int computerChoice) {
        if (computerChoice == 1) {
            System.out.println("Computer went with rock - you lose the round");
            computer.setPlayerScore(1);
            roundCount++;
        } else if (computerChoice == 2) {
            System.out.println("You both went with scissor - the round is tie!");
            roundCount++;
        } else {
            System.out.println("Computer went with paper - you win the round!");
            player.setPlayerScore(1);
            roundCount++;
        }
    }

    public void doFor3(int computerChoice) {
        if (computerChoice == 1) {
            System.out.println("Computer went with rock - you win the round");
            player.setPlayerScore(1);
            roundCount++;
        } else if (computerChoice == 2) {
            System.out.println("Computer went with scissor - you lose the round!");
            computer.setPlayerScore(1);
            roundCount++;
        } else {
            System.out.println("You both went with paper - the round is tie!");
            roundCount++;
        }
    }
}
