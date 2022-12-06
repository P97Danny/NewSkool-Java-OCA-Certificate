package StudentProfile;

// This is a class object
public class StudentProfile {

    // These are class attributes
    String firstName;
    String lastName;
    int graduateYear;
    double GPA;
    String major;

    // This is a constructor
    public StudentProfile(String firstName, String lastName, int graduateYear, double GPA, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduateYear = graduateYear;
        this.GPA = GPA;
        this.major = major; 
    }

    public void expectedYearToGraduate() {
        this.graduateYear = this.graduateYear +1;
    }

     
}
