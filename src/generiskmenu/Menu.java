package generiskmenu;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    public Menu(String menuHeader, String leadText, String[] menuItems) {
        setMenuHeader(menuHeader);
        setLeadText(leadText);
        setMenuItems(menuItems);
    }

    public String getMenuHeader() {
        return menuHeader;
    }

    public String getLeadText() {
        return leadText;
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setMenuHeader(String menuHeader) {
        this.menuHeader = menuHeader;
    }

    public void setLeadText(String leadText) {
        this.leadText = leadText;
    }

    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }

    public void printMenu() {
        System.out.println(getMenuHeader()+"\n" + getLeadText()+"\n" + Arrays.toString(getMenuItems()));
    }
    public int readChoice() {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Enter an integer:");
            if (scan.hasNextInt()) {
                input = scan.nextInt();
            } else {
                scan.nextLine();
                System.out.println("You must enter an integer!");
            }
        } while (input == 0);
        return input;
    }
}
