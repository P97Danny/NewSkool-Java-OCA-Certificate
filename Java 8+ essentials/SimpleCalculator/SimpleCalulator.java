package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalulator {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("This programm will add up two given numbers.");
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n");
        System.out.print("Enter the number to be added: ");
        int secondNumber = scanner.nextInt();
        System.out.print("\n");
        System.out.println(firstNumber + " + " + secondNumber + " = " + (secondNumber + firstNumber));
    }
}
