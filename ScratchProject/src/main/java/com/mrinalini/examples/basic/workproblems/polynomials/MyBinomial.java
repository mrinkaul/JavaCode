package com.mrinalini.examples.basic.workproblems.polynomials;

public class MyBinomial {
    public int coefficient;
    public String variable;
    public String operation;
    public int constant;

    public String getStringRepresentation(){
        return "("+coefficient+variable+operation+constant+")";
    }

    public void print() {
        System.out.println("Binomial Expression : " + getStringRepresentation());
    }
}
