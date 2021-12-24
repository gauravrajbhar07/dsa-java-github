package com.Gaurav;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 number for addition ");
        float a = input.nextFloat();
        float b= input.nextFloat();
        float sum = a+b;
        System.out.println("sum of 2 number : " + sum);

    }
}
