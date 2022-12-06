package StudentProfile;

public class StudentProfile {

    String firstName;
    String lastName;
    int graduateYear;
    double GPA;
    String major;

    public StudentProfile(String firstName, String lastName, int graduateYear, double GPA, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduateYear = graduateYear;
        this.GPA = GPA;
        this.major = major;
    }
}
