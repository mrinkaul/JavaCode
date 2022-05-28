package com.mrinalini.examples.kids.pets;

public class Pet {
    String name;
    int age;
    float weight;
    float height;
    String color;

    public Pet(String name, int age, float weight, float height, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public Pet(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " is sleeping. " +
                "Good night, see you tomorrow!");
    }

    public void eat(){
        System.out.println(
                "I’m so hungry, let me have a snack like nachos!");
    }

    public String talk(String aWord){
        String petResponse = "OK!! OK!! " +aWord;
        return petResponse;
    }


    public void talk(){
        System.out.println("Hello! I am just an ordinary " + this.getClass().getSimpleName() + ". I can't talk");
    }
}
