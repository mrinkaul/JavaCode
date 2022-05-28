package com.mrinalini.examples.kids.pets;

public class Fish extends Pet {


    public Fish(String name, int age, float weight, float height, String color) {
        super(name, age, weight, height, color);
    }

    public void swim() {
        System.out.println(name+ " is swimming");
    }

    int currentDepth = 0;

    public int dive(int howDeep){
        currentDepth=currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("I am a little fish and "
                    + " can't dive below 100 feet");
            currentDepth=currentDepth - howDeep;
        }else{
            System.out.println("Diving for " + howDeep +
                    " feet");
            System.out.println("I'm at " + currentDepth +
                    " feet below the sea level");
        }
        return currentDepth;
    }

}
