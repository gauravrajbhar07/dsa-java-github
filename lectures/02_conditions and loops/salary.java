package com.conditions_and_loops;

public class salary {
    public static void main(String[] args) {
        int sal = 24000;

        if(sal >= 10000){
            sal += 2000;
            System.out.println("you sal this month =  "+ sal);
        }

        else if (sal > 50000){
            sal += 5000;
            System.out.println("you sal this month =  "+ sal);
        }
        else {
            System.out.println("you sal this month =  "+ sal);
        }
    }
}

