package com.Gaurav;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("enter temp in C :");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5)  + 32;

        System.out.print("temp in F:" + tempF);
    }
}
