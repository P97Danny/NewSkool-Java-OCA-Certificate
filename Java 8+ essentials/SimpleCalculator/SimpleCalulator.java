package SimpleCalculator;

import java.util.Scanner;

public class SimpleCalulator {
    
    Scanner scanner = new Scanner(System.in);

    protected void printTekst() {

        System.out.println("This simple programm will ask for two different numbers, and than will add those numbers");
    }

    protected int getFirstNumber() {

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n");

        return firstNumber;
    }

    protected int getSecondNumber() {

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("\n");

        return secondNumber;
    }

    protected int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    protected void printSum() {

        int numberSum = calculateSum(getFirstNumber(), getSecondNumber());
        int firstNumber =  getFirstNumber();
        int secondNumber = getSecondNumber();
        System.out.println(firstNumber + " + " + secondNumber + " = " + numberSum);
    }

    public static void main(String args[]) {
        
    }
}
