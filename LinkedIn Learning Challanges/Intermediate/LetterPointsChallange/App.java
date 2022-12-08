package LetterPointsChallange;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class App {
    public static List<String> findStudentWithIncompleteVolunteerEvents( List<String> students, Map<String, List<String>> attendeesMapping) {
        // TODO: implement function
        return Arrays.asList();
    }

    public static void main (String[] args) {
        List<String> students = Arrays.asList("Sally", "Polly", "Molly", "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.("Farmer's Market", "Car Wash Fundraiser", Arrays.asList("Molly", "Tony", "Polly"),
                "Cooking Workshop", Arrays.asList("Sally", "Molly", "Polly"),
                "Midnight Breakfast", Arrays.asList("Polly", "Molly"));

        System.out.println(findStudentWithIncompleteVolunteerEvents(students, attendeesMapping));
    }
}