import java.util.Scanner;

public class Funitons_1 {
    public static void main(String[] args) {
        compu();

    }

    //both the function must be static

    static void compu(){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter 2 number : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater number");
        }
        else if (num1 == num2){
            System.out.println("both are same number");
        }
        else {
            System.out.println(num2 + " is greater number");
        }
    }
    /*

        Access modifires (we look in OOPS) return type name(){
            //body of the funcitons
            retuen statement
        }


    */

}
