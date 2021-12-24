//02_Take name as input and print a greeting message for that name.

package com.assignment;
import java.util.Scanner;
public class greeting_message {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("enter your name : ");
        name = input.nextLine();
        System.out.println("hello " + name + " how are you hope you are fine my friend !");

    }
}
