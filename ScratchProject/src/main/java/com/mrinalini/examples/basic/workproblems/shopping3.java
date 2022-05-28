package com.mrinalini.examples.basic.workproblems;

import java.util.Scanner;

public class shopping3 {

    public static void main(String[] args) {
        Scanner kbReader = null;
        kbReader = new Scanner(System.in);
        String food[] = {"Eggs", "Bread", "Milk", "Chips", "Beans", "Pasta"};
        double total = 0;
        double dozenEgg = 2.46;
        double breadLoaf = 3.26;
        double milkCarton = 2.08;
        double chipBag = 2.52;
        double canOfBeans = 0.99;
        double pastaBox = 3.92;

        System.out.println("You can buy "+ food);
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

        System.out.println(total);

    }
}