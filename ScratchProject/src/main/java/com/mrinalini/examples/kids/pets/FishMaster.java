package com.mrinalini.examples.kids.pets;

public class FishMaster {


        public static void main(String[] args) {

            Fish myFish = new Fish("Dori", 3,10.0F, (float)1.0, "red");

            // Try to have the fish go below 100 feet

            myFish.dive(2);  // go 2 feet down
            myFish.dive(97); // go another 97 feet down
            myFish.dive(3);  // go 3 more feet down

            myFish.sleep();
        }
}

