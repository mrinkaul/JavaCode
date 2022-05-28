package org.mrinalini.software.java.testproject2;
import java.util.*;


public class RPS {

    List<String> gameChoices = new ArrayList<>();
    Random rand = new Random();
    boolean keep_going = true;
    int playerVal = 0;
    int compVal = 0;
    int finalVal = 3;

    public RPS() {
        gameChoices.add("Rock");
        gameChoices.add("Paper");
        gameChoices.add("Scissors");
    }

    public void checkWhoWins(String programChoice, String guestChoice) {

        if (guestChoice.equals("Rock")) {
            if (guestChoice.equals("Rock") && programChoice.equals("Paper")) {
                System.out.println("Paper beats Rock! Sorry!");
                compVal++;
            } else {
                System.out.println("Rock beats Scissors! Good job!");
                playerVal++;
            }
        } else if (guestChoice.equals("Paper")) {
            if (guestChoice.equals("Paper") && programChoice.equals("Rock")) {
                System.out.println("Paper beats rock! Good job!");
                playerVal++;
            } else {
                System.out.println("Scissors beat Paper! Better luck next time!");
                compVal++;

            }
        } else if (guestChoice.equals("Scissors")) {
            if (guestChoice.equals("Scissors") && programChoice.equals("Paper")) {
                System.out.println("Scissors beats Paper! Great job!");
                playerVal++;
            } else {
                System.out.println("Rock beats Scissors! Try again!");
                compVal++;

            }

        }
    }


    public void executeGame() {

        // Get random choice
        int randomIndex = rand.nextInt(gameChoices.size());
        String programChoice = gameChoices.get(randomIndex);
        //System.out.println("choice is " + programChoice);

        Scanner gc = new Scanner(System.in);
        System.out.println("Choose to throw one: Rock, Paper, or Scissors:");
        String guestChoice = gc.nextLine();

        if (guestChoice.equals(programChoice)) {
            System.out.println("You and the computer both threw " + guestChoice + "!");
            System.out.println("It's a tie for now!");
        } else {
            System.out.println("You threw " + guestChoice + " and the computer chose " + programChoice);
            checkWhoWins(programChoice, guestChoice);
        }
        executeLoop();


    }

    public void executeLoop() {
        while (keep_going == true) {
            if (compVal == finalVal) {
                System.out.println("Game Over...");
                System.out.println("L");
                keep_going = false;

            } else if (playerVal == finalVal) {
                System.out.println("You won!!");
                keep_going = false;

            } else {
                System.out.println("Play again?");
                Scanner kg = new Scanner(System.in);
                String again = kg.nextLine();

                if (again.equals("No")) {
                    keep_going = false;
                } else if(again.equals("Yes")) {
                    System.out.println("              You: " + playerVal);
                    System.out.println("         Computer: " + compVal);
                    executeGame();
                }
            }
        }

    }
}
