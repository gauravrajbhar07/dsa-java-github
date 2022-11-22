import java.util.Scanner;

public class weekday_weekend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your your week number in int : ");
        int day = in.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekday ");
            case 6,7 -> System.out.println("weekend");
        }
    }
}
