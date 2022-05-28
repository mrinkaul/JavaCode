package com.mrinalini.examples.basic.workproblems.polynomials;

import java.util.Scanner;

public class PolyMain {

    MyMonomial m1 = null;
    MyBinomial b1 = null;
    Scanner kbReader = null;

    /**
     * Constructor
     */
    public PolyMain() {
        kbReader = new Scanner(System.in);
        m1 = new MyMonomial();
        b1 = new MyBinomial();
    }


    /**
     * Reads Monomial and saves it m1
     */
    public void readMyMonomial() {
        System.out.print("Enter the integer coefficient of the monomial here: ");
        String tmp = kbReader.nextLine();
        m1.coefficient = Integer.valueOf(tmp);

        System.out.print("Enter the variable of the first term here: ");
        m1.variable = kbReader.nextLine();
        if(m1.variable.length() > 1) {
            System.out.println("Invalid variable "+m1.variable);
            System.exit(-1);
        }
        // TODO: CHeck if this is a digit. If so, give error

        m1.print();
    }

    /**
     * Reads Binomial and saves in m2
     */
    public void readMyBinomial() {
        System.out.print("Enter the integer coefficient of the first term of the binomial here: ");
        String tmp = kbReader.nextLine();
        b1.coefficient = Integer.valueOf(tmp);

        System.out.print("Enter the variable of the first term here: ");
        b1.variable = kbReader.nextLine();
        if(b1.variable.length() > 1) {
            System.out.println("Invalid variable "+b1.variable);
            System.exit(-1);
        }
        // TODO: Check if this is a digit. If so, give error

        System.out.print("Enter the operation of the binomial here (+/-): ");
        b1.operation = kbReader.nextLine();
        if(b1.operation.length() > 1) {
            System.out.println("Invalid operation "+b1.operation);
        }
        if(b1.operation.equals("+") || b1.operation.equals("-")) {
            // do nothing
        }
        else {
            System.out.println("Invalid operation "+b1.operation);
            System.exit(-1);
        }

        System.out.print("Enter the integer coefficient of the second term here: ");
        String tmp4 = kbReader.nextLine();
        b1.constant = Integer.valueOf(tmp4);

        b1.print();
    }


    /**
     * Accept or Decline
     */
    public void acceptOrDecline(){
        System.out.println("You want to multiply ("+b1.coefficient+b1.variable+b1.operation+b1.constant+")"+ "("+m1.coefficient+""+m1.variable+")");
        System.out.print("Accept or Decline?: ");
        String question = kbReader.nextLine();

        if(question.equals("Decline")) {
            System.out.println("Operation Declined.");
            System.exit(0);
        }

        else if(question.equals("Accept")){
            System.out.println("Operation Accepted.");
        }
    }

    /**
     * Multiply and print
     */
    public void multiplyAndPrint() {
        String acceptedquestion = "("+b1.coefficient+b1.variable+b1.operation+b1.constant+")"+ "("+m1.coefficient+""+m1.variable+")";
        int term1 = b1.coefficient*m1.coefficient;
        String var;
        if(b1.variable.equals(m1.variable))
            var = b1.variable+"^2";
        else
            var = b1.variable+m1.variable;
        String endterm1 = term1+var;

        int term2 = b1.constant*m1.coefficient;
        if(term2 < 0 && b1.operation.equals("-")) {
            term2 = term2 * -1;
        } else if(term2 >= 0 && b1.operation.equals("-")) {
            // do nothing
        } else if(term2 < 0 && b1.operation.equals("+")) {
            b1.operation = "";
        } else if(term2 >= 0 && b1.operation.equals("+")) {
            // do nothing
        }
        String endterm2 = term2+m1.variable;

        System.out.println("The answer to "+acceptedquestion+" is "+endterm1+b1.operation+endterm2);
    }

    /**
     * This is the actual test which reads the monomial, binomial and prints the answer
     */
    public void myTest() {
        System.out.println("Starting Actual Test...");
        try {
            readMyMonomial();
            readMyBinomial();
            acceptOrDecline();
            multiplyAndPrint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unitTests() {
        System.out.println("Starting Unit Tests...");
        // Test 1
        m1.coefficient = 2; m1.variable = "x";
        b1.coefficient = 2; b1.variable = "x"; b1.operation = "+"; b1.constant = 3;
        multiplyAndPrint();
        // Test 2
        m1.coefficient = 2; m1.variable = "x";
        b1.coefficient = 2; b1.variable = "y"; b1.operation = "+"; b1.constant = 3;
        multiplyAndPrint();
        // Test 3
        m1.coefficient = 2; m1.variable = "x";
        b1.coefficient = 2; b1.variable = "x"; b1.operation = "-"; b1.constant = 3;
        multiplyAndPrint();
        // Test 4
        m1.coefficient = 2; m1.variable = "x";
        b1.coefficient = 2; b1.variable = "x"; b1.operation = "+"; b1.constant = -3;
        multiplyAndPrint();
        // Test 5
        m1.coefficient = 2; m1.variable = "x";
        b1.coefficient = -2; b1.variable = "x"; b1.operation = "+"; b1.constant = 3;
        multiplyAndPrint();
        // Test 6
        m1.coefficient = -2; m1.variable = "x";
        b1.coefficient = -2; b1.variable = "x"; b1.operation = "+"; b1.constant = 3;
        multiplyAndPrint();
        // Test 6
        m1.coefficient = -2; m1.variable = "x";
        b1.coefficient = -2; b1.variable = "x"; b1.operation = "+"; b1.constant = -3;
        multiplyAndPrint();
        // Test 7
        m1.coefficient = -2; m1.variable = "x";
        b1.coefficient = -2; b1.variable = "x"; b1.operation = "-"; b1.constant = -3;
        multiplyAndPrint();
        System.out.println("-------------------");
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        PolyMain polyMain = new PolyMain();
        polyMain.unitTests();
        polyMain.myTest();
    }
}
