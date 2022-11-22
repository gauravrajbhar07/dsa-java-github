import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("enter your fruit name :");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits : " + fruit);
            case "apple" -> System.out.println("sweet red :" + fruit);
            case "orange" -> System.out.println("gr8 orange fruit : " + fruit);
            case "grapes" -> System.out.println("teasty green  fruit : " + fruit);
            default -> System.out.println("please enter a fruit ");
        }

    }
}