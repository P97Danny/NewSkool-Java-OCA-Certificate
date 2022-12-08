package ChallangeSolution;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothinSolution {

    private static int startPoints = 10;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int current = startPoints;
    private boolean isStillPlaying = true;

    public void playGame() {
        printWelcome();
        askUserToContinue();

        while (this.isStillPlaying) {
            printTryToDouble();

            if (shouldDouble()) {
                doubleCurrent();
                printGongrats();
                askUserToContinue();
            }
            else {
                printLost();
                return;
            }
        }

        printWalkawayMessage();
    }

    private void printWelcome() {
        System.out.println("Let's play Double or Nothing. In this game you can take a chance to double your points or lose them all");
        System.out.println("You start with 10 points");
    }

    private void printTryToDouble() {
        System.out.println("Let's try to double your points.");
    }

    private void printGongrats() {
        System.out.println("You win! You now have " + this.current + " points.");
    }

    private void printLost() {
        System.out.println("You lost! And all your points will be lost.");
    }

    private void printWalkawayMessage() {
        System.out.println("Congrats! You finish with " + this.current + " points");
    }

    private boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }

    private void doubleCurrent() {
        this.current = this.current *2;
    }

    private void askUserToContinue() {
        System.out.println("Would you like to take another chance to double your points? (Yes/No)");
        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }

    protected boolean getIsStillPlaying() {
        return this.isStillPlaying;
    }


}
