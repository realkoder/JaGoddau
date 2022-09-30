package namethatday;

import java.util.Scanner;

public class NameThatDayTest {
    public void run() {
        int input = readInput();
        letsSwitch(input);
    }


    public static void main(String[] args) {
        new NameThatDayTest().run();
    }

    public int readInput() {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        System.out.println("Please type integer from 1 - 7 and you'll get a day in return!");
        do {
            if (scan.hasNextInt()) {
                input = scan.nextInt();
            } else {
                scan.nextLine();
                System.out.println("You must enter an integer from 1-7!");
            }
        } while (input == 0);
        return input;
    }
    private void letsSwitch(int input) {
        switch (input){
            case 1:
                System.out.println("I call that Monday");
                break;
            case 2:
                System.out.println("I call that Tuesday");
                break;
            case 3:
                System.out.println("I call that Wednesday");
                break;
            case 4:
                System.out.println("I call that Thursday");
                break;
            case 5:
                System.out.println("I call that Friday - yay");
                break;
            case 6:
                System.out.println("I call that Saturday - weehh");
                break;
            case 7:
                System.out.println("I call that Sunday - wayyhh");
                break;
            default:
                System.out.println("I call that wrong day!");
                break;
        }
    }
}
