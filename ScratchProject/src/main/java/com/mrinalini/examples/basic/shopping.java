package com.mrinalini.examples.basic;


import java.util.Scanner;

public class shopping {




    public static void main(String[] args) {


        double dozenEgg = 2.46;
        double breadLoaf = 3.26;
        double milkCarton = 2.08;
        double chipBag = 2.52;
        double canOfBeans = 0.99;
        double pastaBox = 3.92;
        Scanner kbReader = null;
        kbReader = new Scanner(System.in);
        System.out.println("Welcome to A Grocery Store That Ceases to Exist!");
        System.out.println("Items you can buy:" +
                "Eggs" +
                "Bread" +
                "Milk" +
                "Chips" +
                "Beans" +
                "Pasta");
        double total = 0;
        System.out.println("Enter your first item here:");
        String item = kbReader.nextLine();
        if (item == "Eggs") {
            total = dozenEgg;
        } else if (item == "Bread") {
            total = breadLoaf;
        } else if (item == "Milk") {
            total = milkCarton;
        }
        else if(item == "Chips"){
            total = chipBag;
        }
        else if(item == "Beans"){
            total = canOfBeans;
        }
        else if(item =="Pasta"){
            total = pastaBox;
        }
        double total1 = total;
        kbReader = new Scanner(System.in);
        System.out.println("Proceed to checkout?");
        String answer = kbReader.nextLine();
        if (answer == "no"){
            System.exit(-1);
        }
        else{
            System.out.println("Checking out...");
        }
        double price = total1;
        double discount = price > 50 ? 10 : 5;

        System.out.println("Your discount is " + discount + " percent.");


    }
}
