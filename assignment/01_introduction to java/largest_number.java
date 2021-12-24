//05_Take 2 numbers as input and print the largest number.
package com.assignment;
import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
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
}
