package com.mrinalini.examples.basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class testProblems5722fr {


    private void problem1(String line) throws IOException {

        String p1 = line;
        System.out.println(p1.toUpperCase());

    }

    private void problem2(String line) throws IOException {

        String p2 = line;
        System.out.println(p2.toLowerCase());

    }

    private void problem3(String line) throws IOException {
        char c = 0;
        String p3 = line;
        int len = p3.length();
        StringBuffer strBuffer = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            c = p3.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            strBuffer.append(c);
        }
        System.out.println(strBuffer.toString());

    }

    private void problem4(String line) throws  IOException {
       String p4 = line;
        String adding = p4.substring(0, 2);
        String rest = (p4.substring(2));
        System.out.println(adding +"355"+ rest);


    }

    private void problem5(String line) throws IOException{

        String p5 = line;
        p5 = p5.replaceAll(" ", "7");
        System.out.println(p5);
    }


    public static void main(String[] args) throws IOException {

        System.out.println("enter a phrase");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
             line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        testProblems5722fr testProblems5722;
        testProblems5722 = new testProblems5722fr();


        testProblems5722.problem1(line);
        testProblems5722.problem2(line);
        testProblems5722.problem3(line);
        testProblems5722.problem4(line);
        testProblems5722.problem5(line);


    }


}






