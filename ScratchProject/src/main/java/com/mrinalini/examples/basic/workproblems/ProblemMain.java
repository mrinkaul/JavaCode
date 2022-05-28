package com.mrinalini.examples.basic.workproblems;

public class ProblemMain {
    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        try {
            System.out.println(problem1.diff21(19));
            System.out.println(problem1.diff21(10));
            System.out.println(problem1.diff21(21));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
