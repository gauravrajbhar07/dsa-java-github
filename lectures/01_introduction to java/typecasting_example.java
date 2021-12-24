package com.Gaurav;

public class typecasting_example {
    public static void main(String[] args) {
        byte a= 45;
        char b= 'd';
        short c = 1025;
        int i = 5000;
        float f = 5.67f;
        double d = 0.124;
        double result = (a*b) +(c/i) + (f%d);
        System.out.println((a*b) + " " + (c/i)  + " " +  (f%d));
        System.out.println("result = "+ result);

    }
}
