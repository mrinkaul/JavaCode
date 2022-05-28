package com.mrinalini.examples.basic.three;
import java.util.Scanner;


import java.util.Random;

public class TestThree {

    private int mySecretNumber = 0;

    /**
     * COnstructor
     * ALso allocates mySecretNumber between 0 and 100
     */
    public TestThree() {
        mySecretNumber = getRandomNumberInRange(0, 100);
        //System.out.println("The secret number is "+mySecretNumber);
    }

    /**
     * Generates a random number betwenn min and max and returns it
     * @param min
     * @param max
     * @return
     */
    private int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        //System.out.println("nextInt "+r.nextInt());
        //System.out.println("nextInt with bound "+r.nextInt(200));
        return r.nextInt((max - min) + 1) + min;
    }

    public int getMySecretNumber() {
        return mySecretNumber;
    }
}




