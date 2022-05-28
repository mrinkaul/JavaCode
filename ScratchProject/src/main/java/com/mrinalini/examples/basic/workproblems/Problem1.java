package com.mrinalini.examples.basic.workproblems;

public class Problem1 {
    public Problem1() {
        System.out.println("constructed");
    }

    public int diff21(int n) {
        if (n > 21) {
            int y = Math.abs(n - 21);
            return y * 2;
        } else {
            int x = Math.abs(n - 21);
            return x;
        }
    }

    public int diff21x(int n) {
        int x = Math.abs(n - 21);
        if (n > 21)
            return x * 2;
        else
            return x;
    }

    public Boolean makes10(int a, int b){
        if (a == 10 || b == 10 ||a + b == 10){
            return true;

        }
        return false;
    }



}
