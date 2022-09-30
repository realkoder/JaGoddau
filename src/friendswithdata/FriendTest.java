package friendswithdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FriendTest {
    Scanner scan = new Scanner(System.in);
    private Friend[] friends;

    public void run() {
        createArrayWFriends(getFriendAmount());
        addFriendsToArray(friends);
        /* for (int i = 0; i < friends.length; i++){
            System.out.println(friends[i].getName()+" is your friends name."+"\n"+
                    friends[i].getPhoneNum()+" is the phonenumber."+
                    friends[i].getEmail()+" is the email."+"\n");
        }
         */
        System.out.println(Arrays.toString((getFriends())));
    }

    public static void main(String[] args) {
        new FriendTest().run();
    }

    public Friend[] createArrayWFriends(int friendsAmount) {
        friends = new Friend[friendsAmount];
        return friends;
    }

    public int getFriendAmount() {
        System.out.println("Type how many friends to input:");
        int friendsAmount = scan.nextInt();
        scan.nextLine();
        return friendsAmount;
    }

    public void addFriendsToArray(Friend[] friends) {
        for (int i = 0; i < friends.length; i++) {
            friends[i] = new Friend(getNameInput(), getPhoneNumInput(), getEmailInput());
        }
    }

    public String getNameInput() {
        System.out.println("What's your friends name");
        String name = scan.nextLine();
        return name;
    }

    public String getPhoneNumInput() {
        System.out.println("What's your friends phone number");
        String phoneNum = scan.nextLine();
        return phoneNum;
    }

    public String getEmailInput() {
        System.out.println("What's your friends email address");
        String email = scan.nextLine();
        return email;
    }

    public Friend[] getFriends(){
        return friends;
    }
}
