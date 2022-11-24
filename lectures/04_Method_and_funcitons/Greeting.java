import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = in.next();
        System.out.println( GreetingF(name) ); //funciotn call

    }
    static String GreetingF(String name ){
        String welcome_msg = "hello " + name + " welcome to our university ";
        return welcome_msg;

    }
}
