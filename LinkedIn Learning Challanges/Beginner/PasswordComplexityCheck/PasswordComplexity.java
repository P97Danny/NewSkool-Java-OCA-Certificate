package Beginner.PasswordComplexityCheck;

import java.util.Scanner;

import Beginner.PasswordComplexityCheck.ComplexityCheck.passwordStatus;

public class PasswordComplexity {
    
    public static passwordStatus passwordCheck(String password) {

        boolean hasUppercase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        if(password.length() < 6) {
            return passwordStatus.Wrong_Length;
        }
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
        
        if(hasUppercase == false) {
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
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a password: ");
            password = scanner.nextLine();
            status = passwordCheck(password);

            switch (status) {
                case Wrong_Length:
                    System.out.println("Please enter a password with at least 6 characters");
                    break;
                case No_Uppercase:
                    System.out.println("Please use at least one uppercase letter");
                    break;
                case No_Lowercase:
                    System.out.println("Please use at least one lowercase letter");
                    break;
                case No_Number:
                    System.out.println("Please use ast least one number");
                    break;
                default:
                    System.out.println("Your password is complex enough");
                    break;
            }
        }
        while(status != passwordStatus.Ok);
}

    public static void main(String[] args) {
        isPasswordComplex();
    }
}
