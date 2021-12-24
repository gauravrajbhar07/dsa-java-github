package com.Gaurav;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        //float num1 = input.nextInt(); //this will work
        //int num2 = input.nextFloat();  //this will give error
//        int num = input.nextInt();
//        System.out.println(num);

   //error     int num = 67.456f;

        //type casting
//        int num = (int)(56.252f);
//        System.out.println(num);


        //automatic type promotion in expression
//        int a = 257;  // 257 % 256  = 1
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a= 10 , b= 20 , c= 30;
//        double d= a*b/c;
//        System.out.println(d);

        int a = 'A';
        int b = 'Z';
        System.out.println("नमस्ते");
        System.out.println("a = "+ a+ " z= "+b);

        int num1 = 'a' ,num2 = 'z';
        String n = "नमस्ते";
        System.out.println("hello = "+ n);
        System.out.println("A= "+ num1 +" Z= "+num2);


    }
}
