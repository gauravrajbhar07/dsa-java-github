//06_Input currency in rupees and output in USD.

package com.assignment;
import java.util.Scanner;
public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amt in INR:");
        float inr = input.nextInt();
        float usd = inr / 75;
        System.out.println("usd : "+ usd);
    }
}
