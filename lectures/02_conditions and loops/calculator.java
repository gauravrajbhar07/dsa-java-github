package com.conditions_and_loops;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //taking input from the use until user does't press X or x
        int ans = 0;
        while (true){
            //taking the operation a input
            System.out.println("enter the operator");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op =='/' || op =='*' || op=='%'){
                //input 2 numbers
                System.out.println("enter 2 numbers :" );
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '/'){
                    ans = num1 / num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '%'){
                    ans = num1 % num2;
                }

            }
            else if(op == 'X' || op == 'x'){
                break;
            }else {
                System.out.println("invalid operations ");
            }

            System.out.println("result = "+ ans);
        }


    }
}
