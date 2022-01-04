package com.conditions_and_loops;

public class reverse_A_number
{
    public static void main(String[] args) {
        int rev = 0;
        int n = 987654321;
        while (n > 0 ){
            int rem = n % 10;
            rev = rev*10 + rem;
            n  = n / 10;

        }
        System.out.println("rev = "+ rev);
    }
}
