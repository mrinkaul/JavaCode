package com.mrinalini.examples.basic.three;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        try {
            TestThree testThree = new TestThree();
            Scanner input = new Scanner(System.in);

            Boolean ask = true;
            while (ask) {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();
                int x = Math.abs(testThree.getMySecretNumber() - number);

                if (x == 0) {
                    System.out.println("Correct!This was the answer!");
                    ask = false;
                    input.close();
                } else if (x > 90) {
                    System.out.println("Freezing!");
                } else if (x > 70) {
                    System.out.println("Very Cold.");
                } else if (x > 50) {
                    System.out.println("Cold.");
                } else if (x > 30) {
                    System.out.println("Chilly!");
                } else if (x > 20) {
                    System.out.println("Warm!");
                } else if (x > 15) {
                    System.out.println("Warmer...");
                } else if (x > 10) {
                    System.out.println("Hot!");
                } else if (x <= 10) {
                    System.out.println("Super hot!");
                }else if(x<=5){
                    System.out.println("Super, extra, totally on fire!");
                }
            }

    } catch(Exception e) {
        e.printStackTrace();
    }
}

}