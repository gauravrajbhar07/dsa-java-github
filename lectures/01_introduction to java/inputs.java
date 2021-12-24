package com.Gaurav;
import  java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your rollnumber!");
        int rollno = input.nextInt();
        System.out.println("your roll number = " + rollno);

        int a = 232_000_000;
        System.out.println(a);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        double bill = input.nextDouble();
        System.out.println("double =" + bill);

    }

}
