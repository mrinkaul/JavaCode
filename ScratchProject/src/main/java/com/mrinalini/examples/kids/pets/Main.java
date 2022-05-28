package com.mrinalini.examples.kids.pets;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Dori", 3,10.0F, (float)1.0, "red");
        fish.dive(2);
        fish.talk();

        Dog dog = new Dog("AA", 5, 11F, 3F, "brown");
        dog.talk();

        Parrot parrot = new Parrot("fruity pebbles", 3, 4F, 5F, "rainbow");
        parrot.talk();

        Pet p = new Pet("Gogo");
        p.sleep();

        if(parrot instanceof Pet) {
            System.out.println(parrot.name + " is a pet");
        }
    }
}
