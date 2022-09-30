package generiskmenu;

public class MenuTest {
    public void run() {
        Menu minMenu = new Menu("Menu", "vælg en mulighed", new String[]{"Choose 1", "Choose 2",
                "Choose 3", "Choose 9 - for quit"});
        int choice = 0;
        boolean keeprunning = true;
        minMenu.printMenu();
        do {
            choice = minMenu.readChoice();
            if (choice >= 1 && choice <= 3) {
                keeprunning = false;
            } else {
                System.out.println("You can only choose one of the options from the menu!!!");
            }
        } while (keeprunning);
        switch (choice) {
            case 1:
                System.out.println("You choose " + choice);
                break;
            case 2:
                System.out.println("You choose " + choice);
                break;
            case 3:
                System.out.println("You choose " + choice);
                break;
            case 9:
                System.out.println("You choose " + choice);
                break;
        }
    }

    public static void main(String[] args) {
        new MenuTest().run();
    }
}
