// This programm is a small double or nothing game, the user starts with 10 points and has the option to take a gamble.
// If the player wins, the points they own will be doubled and the player will be asked to play again or to walk away.
// If the player loses, all points will be lost and the game ends.\

package DoubleOrNothingChallange;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    
    private static int stratingPoints = 10;
    private int currentPoints = stratingPoints;
    private Scanner scanner = new Scanner(System.in);
    private boolean isStillPlaying = true;
    private String playerChoice;

    private static void printWelcome() {
        System.out.println("Weclome to double or nothing, in this game you can take the chance to double your points or lose it all.");
        System.out.println("You will start with 10 points");
    }

    private void printCurrentPoints() {
        System.out.println("You currently have " + this.currentPoints + " points");
    }

    private void doublePoints() {
        this.currentPoints  = this.currentPoints *2;
    }

    private void askToPlayagain() {
        System.out.print("Do you want to take a chance to double your points? (Yes/No): ");
        this.playerChoice = this.scanner.nextLine();
        if (this.playerChoice.toUpperCase().startsWith("N")) {
            printWalkawayMessage();
            this.isStillPlaying = false;
        }
        else if (this.playerChoice.toUpperCase().startsWith("Y")) {
            this.isStillPlaying = true;
        }
        else {
            System.out.println("Invalid input, try again");
            askToPlayagain();
        }
    }

    private void printWalkawayMessage() {
        System.out.println("You walk away with " + this.currentPoints + " points...");
    }

    private void decidePlayerFate() {
        // Generate a random boolean
        Random random = new Random();

        // Decide player's fate
        if (random.nextBoolean() == true) {
            // Notify the player that they have won
            System.out.println("You win! Your points will be doubled");

            // Double player's current points
            doublePoints();
            printCurrentPoints();

            // Ask player if they want to play again
            askToPlayagain();

        }
        else if (random.nextBoolean() == false) {
            // Notify the player that they've lost
            System.out.println("You lose! And you end up with nothing...");
            this.isStillPlaying = false;
        }
    }

    public void playGame() {
        // This instance will call all other instances to run the code
        try {
            printWelcome();
            askToPlayagain();
            while(isStillPlaying == true) {
                decidePlayerFate();
            }
        }
        catch (Exception e) {
            System.out.println("Programm interupted");
        }
    }


}
