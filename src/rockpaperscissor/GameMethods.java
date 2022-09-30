package rockpaperscissor;

import java.util.Scanner;

public class GameMethods {

    public GameMethods() {

    }
    public int readPlayersChoice() {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Make your choice - type 1: Rock 2: Scissor 3: Paper");
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                scan.nextLine();
                System.out.println("You must enter 1,2 or 3!");
            }
        } while (choice == 0);
        return choice;
    }

    public void printPlayerChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("So you choose the rock");
                break;
            case 2:
                System.out.println("So you choose the scissor");
                break;
            case 3:
                System.out.println("So you choose the paper");
                break;
            default:
                System.out.println("That's silly - you made no choice and now you lost the round!");
                break;
        }
    }
}
