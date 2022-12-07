package Beginner.PasswordComplexityCheck;

import java.util.Scanner;

import Beginner.PasswordComplexityCheck.enumStatus.passwordStatus;;

public class PasswordComplexity {
    
    public static passwordStatus passwordCheck(String password) {

        boolean hasUppercase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        // Check for each letter of the password if the letter is an uppercase, lowercase or number
        for ( int i=0; i < password.length(); i++ ) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUppercase = true;
            }
            else if(Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            else if(Character.isDigit(ch)) {
                hasNumber = true;
            }
        }
        
        // Return the correct status if the password is missing one of the assigned criteria
        if(password.length() < 6){
            return passwordStatus.Wrong_Length;
        }
        else if(hasUppercase == false) {
            return passwordStatus.No_Uppercase;
        }
        else if(hasLowerCase == false) {
            return passwordStatus.No_Lowercase;
        }
        else if(hasNumber == false) {
            return passwordStatus.No_Number;
        }
        else {
            return passwordStatus.Ok;
        }
    }

    public static void isPasswordComplex() {

        passwordStatus status = passwordStatus.Invalid_Status;
        String password;

        // Loop through the password scanner until the password meets al criteria
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            status = passwordCheck(password);

            // Return the right message depending on the missing criteria
            switch (status) {
                case Wrong_Length:
                    System.out.println("Please enter a password with at least 6 characters");
                    break;
                case No_Uppercase:
                    System.out.println("Please use at least one uppercase character");
                    break;
                case No_Lowercase:
                    System.out.println("Please use at least one lowercase character");
                    break;
                case No_Number:
                    System.out.println("Please use ast least one number");
                    break;
                default:
                    // The password passed all checks
                    System.out.println("Your password is complex enough");
                    scanner.close();
                    break;
            }
        }
        while(status != passwordStatus.Ok);
}

    public static void main(String[] args) {
        isPasswordComplex();
    }
}
