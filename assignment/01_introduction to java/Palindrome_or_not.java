package com.assignment;
import  java.util.Scanner;
public class Palindrome_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string ");
        String name = input.nextLine();
        int len = name.length();
        char ch;


        String revname = "";
        for (int i = 0; i < name.length() ;i++){
            ch = name.charAt(i);
            //System.out.println(ch);
            revname = ch + revname;

        }
        if(name.equals(revname)){
            System.out.println(name + " is a  palindrome !");
        }
        else{
            System.out.println(" is not a palindrom");
        }


    }
}
