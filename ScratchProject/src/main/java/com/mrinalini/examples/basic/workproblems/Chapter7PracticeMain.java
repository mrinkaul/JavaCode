package com.mrinalini.examples.basic.workproblems;

import java.util.*;

public class Chapter7PracticeMain {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

         System.out.print("Enter your String here: ");
         String s= kbReader.nextLine( );
         System.out.println("This is my string,..["+s+"]");


         System.out.println("Enter the integer coefficient of the first term here: ");
         //int first_coefficient = kbReader.nextInt();
         String first_coefficient_string = kbReader.nextLine();
         int first_coefficient = Integer.valueOf(first_coefficient_string);

         System.out.println("Enter the variable of the first term here: ");
         String first_term_variable = kbReader.nextLine();

         System.out.println("Enter the operation(+ or -) of the binomial here.");
         String operation = kbReader.nextLine();

         System.out.println("Enter the integer constant here: ");
         int constant = kbReader.nextInt();

         System.out.println("Your binomial is: ("+first_coefficient+first_term_variable+" "+operation+""+constant+")");
    }
}
