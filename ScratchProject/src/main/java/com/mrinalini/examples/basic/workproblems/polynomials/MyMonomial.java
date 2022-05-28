package com.mrinalini.examples.basic.workproblems.polynomials;

public class MyMonomial {
    public int coefficient;
    public String variable;

    public String getStringRepresentation(){
        return "("+coefficient+""+variable+")";
    }
    public void print() {
        System.out.println("Monomial Expression : " + getStringRepresentation());
    }
}
