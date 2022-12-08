package CalculateWaterBillChallange;

import java.util.Scanner;



public class App {
    
    private static double pricePerm3 = 0.87;
    private static double fixedCosts = 82.82/12;
    private static double fixedWaterTax = 0.36;


    private static void printWaterCosts(double totalCosts) {
        System.out.println("You water bill will be " + totalCosts + " euros");
    }

    private static double getWaterUsage() {
        System.out.print("How many liters of water did you use this month? :");
        Scanner scanner = new Scanner(System.in);
        double usage = scanner.nextDouble();
        scanner.close();
        return usage/1000;
    }

    private static double CalculateWaterBill(double literUsage, double pricePerm3, double fixedCosts, double fixedWaterTax) {

        return ((fixedCosts + pricePerm3 * literUsage) * fixedWaterTax) * 1.09;
    }

    public static void main(String[] args) {
        try {
            printWaterCosts(CalculateWaterBill(getWaterUsage(), pricePerm3, fixedCosts, fixedWaterTax));

        }
        catch (Exception e) {
            System.out.println("Program interupted");
        }

    }
}
