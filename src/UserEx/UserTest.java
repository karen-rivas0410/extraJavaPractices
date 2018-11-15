package UserEx;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("What is your age? ");
//        String userInput = sc.nextLine();
        int userInput = sc.nextInt();
        System.out.println(user.setAge(sc));
        sc.nextLine();
    }
}
