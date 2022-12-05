package MultipleChoice;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //Declare variables
        String choiceOne = "Earth";
        String ChoiceTwo = "Jupiter";
        String ChoiceThree = "Saturn";

        String correctAnswer = ChoiceTwo;
        String answer = "";
        
        // Give user the question
        System.out.println("What is the largesr planet in our solar system?");
        System.out.print("Option 1: " + choiceOne + "\n" + "Option 2: " + ChoiceTwo + "\n" + "Option 3: " + ChoiceThree + "\n");

        // Ask user for answer
        System.out.print("Your answer: ");
        Scanner askAnwser = new Scanner(System.in);
        answer = askAnwser.nextLine();

        // Keep repeating the question until the right answer is given
        while (!answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Answer is not correct, please try again.");
            System.out.print("Your answer: ");
            answer = askAnwser.nextLine();
            if (!answer.equalsIgnoreCase(choiceOne))
        }

        // Confirm correct answer and close programm
        System.out.println(answer + " is the correct answer!");
        askAnwser.close();
    }
}
