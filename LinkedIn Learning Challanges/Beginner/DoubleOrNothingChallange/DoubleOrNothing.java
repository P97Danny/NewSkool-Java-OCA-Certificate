// This programm is a small double or nothing game, the user starts with 10 points and has the option to take a gamble.
// If the player wins, the points they own will be doubled and the player will be asked to play again or to walk away.
// If the player loses, all points will be lost and the game ends.\

package DoubleOrNothingChallange;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing 
{
    


    public static void printWelcome()
    {
        System.out.println("Weclome to double or nothing, in this game you can take the chance to double your points or lose it all.");
        System.out.println("You will start with 10 points");
    }

    public static void printCurrentPoints(int currentPoints)
    {
        System.out.println("You currently have " + currentPoints + " coins");
    }

    public static int doublePoints(int currentPoints)
    {
        int newPoints = currentPoints*2;
        return newPoints;
    }

    public static boolean askToPlayagain()
    {
        String response;
        System.out.print("Do you want to play again? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        response = scanner.nextLine();
        scanner.close();
        return(response == "Y" || response == "y"); 
    }

    public static void decidePlayerFate(int currentPoints)
    {
        // Generate a random boolean
        Random random = new Random();

        // Decide player's fate
        if (random.nextBoolean() == true)
        {
            // Notify the player that they have won
            System.out.print("You win! Your points will be doubled");

            // Double player's current points
            doublePoints(currentPoints);
            printCurrentPoints(currentPoints);

            // Ask player if they want to play again
            

        }
        else
        {
            // Notify the player that they've lost
            // End the game
        }

    }

    public void playGame()
    {
        boolean continuePlaying = false;
        int currentPoints;
        // This instance will call all other instances to run the code
        try {
            do{
                printWelcome();
                decidePlayerFate(currentPoints);
            }
            while(continuePlaying);
        }
        catch (Exception e)
        {
            System.out.println("Programm stopped");
        }
    }


}
