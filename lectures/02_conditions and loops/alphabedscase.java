package com.conditions_and_loops;
import java.util.*;
public class alphabedscase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println("lower case ");
        }else if (ch >= 'A' && ch <='Z'){
            System.out.println("upper case");

        }else {
            System.out.println("invalid input");
        }
    }
}
