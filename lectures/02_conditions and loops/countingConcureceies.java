package com.conditions_and_loops;

public class countingConcureceies {

    public static void main(String[] args) {
         /*String n =  "1385757879";
        int count  = 0;
        for (int i = 0; i < n.length() ; i++) {
            //System.out.println(n.charAt(i));
            if(n.charAt(i) == '7' ){
                count++;
            }

        }

        System.out.println("count = "+ count);*/

        int n = 1385757879;
        int count  = 0;
        while (n>0){
            int remender = n % 10;
            if (remender == 7){
                count++;
            }

            n = n/10;


        }

        System.out.println("count = " + count);




    }
}
