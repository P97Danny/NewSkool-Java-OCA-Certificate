// Programm made by Danny Peters for the Java OCA certificate
// This programm is a small double or nothing game, the user starts with 10 points and has the option to take a gamble.
// If the player wins, the points they own will be doubled and the player will be asked to play again or to walk away.
// If the player loses, all points will be lost and the game ends.

package DoubleOrNothingChallange;

import DoubleOrNothingChallange.DoubleOrNothing;

public class App 
{
    private static int starterPoints = 10;
    public static void main(String[] args)
    {
        int currentPoints = starterPoints;
        DoubleOrNothing game = new DoubleOrNothing();
        game.playGame(currentPoints);
    }    
}
