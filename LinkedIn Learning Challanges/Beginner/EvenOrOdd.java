package Beginner;

import java.util.Scanner;

public class EvenOrOdd {

    public static boolean CheckEven(int number) {
        // TODO: implement functionality
        
        // boolean isEven;
        // if(number %2 == 0){
        //     isEven = false;
        // }
        // else{
        //     isEven = true;
        // }

        return number %2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + CheckEven(userNum));
    }
}
