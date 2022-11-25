import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("enter your number : ");
        System.out.println(ArmNum(num));
    }
    static String ArmNum(int num){
        int checkArm = num ;
        int sum = 0;

        while (num!=0){
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num / 10;

        }
        System.out.println(sum);

        if(sum == checkArm){
            return "is a armstrong number";
        }
        else {
            return "is not a armstrong number";
        }


    }
}

