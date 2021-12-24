//07_To calculate Fibonacci Series up to n numbers.
//0 1 1 2 3 5 8 13 21 ................
package com.assignment;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = input.nextInt();
        int a= 0, b = 1,c;

        System.out.print(" " + a);
        System.out.print(" " + b);
        int i = 1;
        while (i<=n){
            c = a+ b;
            System.out.print(" " + c);
            a= b;
            b = c;
            i++;

        }
    }
}
