package SalaryCalculator;

import java.util.Scanner;

public class Main {

    public static Double askWeeklyHours() {

            boolean correctInput = false;
            System.out.print("Please input your weekly work hours: ");
            Scanner scannerWorkHours = new Scanner(System.in);
            Double weekHours = scannerWorkHours.nextDouble(); 
            // Ask user for weekly workhours       
                // while(correctInput == false){
                //     // scannerWorkHours = new Scanner(System.in);
                //     weekHours = scannerWorkHours.nextDouble(); 
                //     if(weekHours < 0) {
                //         System.out.println("Please enter a number above 0.");
                //     }
                //     else if(!scannerWorkHours.hasNextDouble()) {
                //         System.out.println("Please enter a number");
                //     }
                //     else if(weekHours > 168) {
                //         System.out.println("Please enter a valid amount");
                //     }
                //     else {
                //         correctInput = true;
                //     }
                // }

            // calculate monthly worked hours
            Double monthlyHours = weekHours * 4;

            return monthlyHours;
    }

    public static Double askMonthSalary() {
        // Ask user for hourly salary
        System.out.print("Now please input your monthly salary: ");
        Scanner scannerMonthSalary = new Scanner(System.in);
        Double hourSalary = scannerMonthSalary.nextDouble(); 

        return hourSalary;
    }

    public static Double calculateSalary(Double weekkHours, Double hourSalary) {
        // Calculatre salary based on weekly hours x4 and multiply by hourly salary
        Double monthSalary = weekkHours * hourSalary;
        System.out.print("Your monthly salary will be: " + monthSalary);

        return monthSalary;
    }

    public static void main(String[] args){
        System.out.println("This simple calculator will calculate your monthly salary.");
        Double hours = askWeeklyHours();
        Double salary = askMonthSalary();
        calculateSalary(hours, salary);
        
    }
}
