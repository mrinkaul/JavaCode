package com.mrinalini.examples.kids.pets;

public class Parrot extends Pet {
    public Parrot(String name, int age, float weight, float height, String color) {
        super(name, age, weight, height, color);
    }

    public void talk() {
        System.out.println("I can talk since I am a "+this.getClass().getSimpleName());
    }
}
