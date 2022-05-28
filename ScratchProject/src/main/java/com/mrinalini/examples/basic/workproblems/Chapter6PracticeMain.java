package com.mrinalini.examples.basic.workproblems;
import java.util.Scanner;


public class Chapter6PracticeMain {
    public static void main(String[] args) {

        Scanner math = new Scanner(System.in);
        System.out.println("enter a number:");
        double c = math.nextInt();
        System.out.println(Math.sqrt(c));

        int j = 56;
        int m = -2;
        int k = j*Math.abs(m);
        System.out.println(k);

        double b = 2;
        double e = 1.5;
        System.out.println(Math.pow(b, e));

       System.out.println( Math.ceil(-157.2));
        System.out.println( Math.floor(-157.2) );
       System.out.println( Math.ceil(157.2));
       System.out.println( Math.floor(157.2));
       System.out.println( Math.round(-157.76543234567));
        


    }
}
