package com.Gaurav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        System.out.println("hi how are you ??");
        Scanner input  = new Scanner(System.in);
        System.out.println(input.nextLine());

    }

    public static class premitives {
        public static void main(String[] args) {
            //primitive
            int rollnumber = 89;
            char letter = 'N';
            float marks = 89.67f;        //why f?
            double largerdecimalnumber = 4522182.51561522;
            long largeInters = 123456789089776646L;
            boolean check = true;   // true or false


            //string in not primitive
            //primitive datatype : datatype which can't divided ;
            String name = "gaurav rajbhar";
            System.out.println(name);
        }
    }
}
