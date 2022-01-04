package com.conditions_and_loops;

import  java.util.*;
public class loops {
    //print number from 1 to 5
    public static void main(String[] args) {
        //Q : print number from 1 to 5 with 3 type of loops
        //for loop



        /*
        for(initialisation ; condition ; inc/dec){
            //code
        */
       /* System.out.println("for loop:");
        for (int i  = 1 ; i <= 5 ; i++){
            System.out.println("i = "+ i);
        }
        System.out.println("while loop:");
        int a = 1;
        while (a <=5){

            System.out.println("a = "+ a);
            a++;

        }
        */

        //Q  : print all the number from 1 t0 n

        //Scanner input = new Scanner(System.in);
       /* int n = 5;

        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
        */
        int n = 1 ;
        do{                         //execute for 1 time
            System.out.println(n);
            n++;
        }while(n <=5);
    }
}
