package StudentVolunteersChallange;

import java.util.List;
import java.util.Map;


public class App {
    public static List<String> findStudentWithIncompleteVolunteerEvents( List<String> students, Map<String, List<String>> attendeesMapping) {
        // TODO: implement function

        return List.of();
    }

    public static void main (String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of( "Farmer's , market", List.of("Sally", "Molly", "Tony"), "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentWithIncompleteVolunteerEvents(students, attendeesMapping));
    }
}