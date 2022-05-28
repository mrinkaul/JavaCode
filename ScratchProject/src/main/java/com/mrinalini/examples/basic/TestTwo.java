package com.mrinalini.examples.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TestTwo {
    public TestOne testOne;

    public TestTwo() {
        testOne = new TestOne();
    }

    public void add(int y , int z){
        int a = sum(y, z, 0);
        System.out.println("a Value:"+ a);
    }

    public void divide(int x, float y){
        try {
            float a = x / y;
            System.out.println(x + " divided by " + y + " is " + a);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    private int sum(int a, int b, int c) {
        return a+b+c;
    }

    public void multiply(int x){
        printTable(x, 10);
    }

    public void printTable(int number1, int limit) {
        for(int i=1; i <= limit; i++){
            //System.out.println(x*i);
            System.out.println(number1+" * "+i+" = "+number1*i);
        }
    }


    public static void main(String[] args){

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter an integer: ");
        //int number1 = input.nextInt();

        // INit
        int number1 = 1;

        // Ask for input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        Boolean stop = false;

        while(stop == false) {
            System.out.println("Enter an integer: ");
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Convert to int
            try {
                number1 = Integer.parseInt(line);
                stop = true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                stop = false;
            }
        }


        TestTwo testTwo;
        testTwo = new TestTwo();
        testTwo.printTable(number1, 5);

       testTwo.add(100, -50);

        int val = testTwo.sum(50, 30, 65);
        System.out.println(val);

        testTwo.multiply(3);


        testTwo.testOne.decrementValue();

        testTwo.divide(10,0.5f);


    }
}