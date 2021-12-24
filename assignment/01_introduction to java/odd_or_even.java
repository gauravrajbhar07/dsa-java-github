
//01_Write a program to print whether a number is even or odd, also take input.
package com.assignment;
import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("its even !");
        }
        else{
            System.out.println("its odd !");
        }
    }
}
