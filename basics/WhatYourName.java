import java.util.Scanner;
public class WhatYourName{
    public static void main(String st[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name:-");
     String name=sc.next();
     System.out.println("hello!  " +   name +"   have a good day:)");
     sc.close();
    }
}