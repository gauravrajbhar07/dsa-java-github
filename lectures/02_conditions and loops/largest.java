package com.conditions_and_loops;
import  java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();



        //Q : find the largest of 3 numebers
      /*  int max = a;
        if (b>a){
            max = b;
        }
        if(c>max){
            max = c;
        }*/
        int max = Math.max(c,Math.max(a,b));
        System.out.println("max = " + max );
    }
}
