import java.util.Scanner;

public class Greeting_with_args {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = in.next();
        String greet = myGreet(name );
        System.out.println(greet);
    }
    static String myGreet(String name){
        return "welcome " + name + " hope u r going well in your life ";

    }
}
