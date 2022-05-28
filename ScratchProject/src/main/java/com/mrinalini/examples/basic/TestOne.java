package com.mrinalini.examples.basic;

public class TestOne {
    private int iteration;
    private String myString;

    public TestOne(int x) {
        this.iteration = x;
    }

    public TestOne() {
    }

    public void incrementValue() {
        System.out.println("incrementValue Prev value " + iteration);
        iteration++;
    }

    public void decrementValue() {
        System.out.println("decrementValue Prev value " + iteration);
        iteration--;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        System.out.println("setIteration Prev value " + iteration);
        this.iteration = iteration;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
}
