//03_Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.assignment;

import java.util.Scanner;
public class simple_intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principal, time, rate , finalamt,totalamt;
        System.out.print("enter your principal amt ");
        principal = input.nextFloat();

        System.out.print("enter your time in year ");
        time = input.nextFloat();

        System.out.print("enter your  rate ");
        rate = input.nextFloat();

        finalamt= (principal *rate*time) /100;
        totalamt = finalamt + principal;


        System.out.println("your simple intrest :" + finalamt);
        System.out.println("your total pay  :" + totalamt);


    }
}
