package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SCMedicalRecord implements MedicalRecord {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Gender gender;
    private ArrayList<Visit> visits;
    /**
     * The constructor for the Medical Record class.
     * @param firstName self identifies the first name as a variable
     * @param lastName self identifies the last name as a variable
     * @param birthday self identifies the birthday as a variable
     * @param gender self identifies the gender as a variable
     */
    public SCMedicalRecord(String firstName, String lastName, Date birthday, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.visits = new ArrayList<Visit>();
    }
    /**
     * The public variables for the medical record
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }
    /**
     * Adds a visit to the system, composed of the date, well and desc. variables.
     */
    public void addVisit(Date date, boolean well, String description) {
        visits.add(new Visit(date, well, description));
        System.out.println("Added visit.");
    }
    /**
     * Fetches the amount of visits
     */
    public ArrayList<Visit> getVisitHistory() {
        return visits;
    }
    /**
     * Fetches the inputted birthday 
     * @return the date in the appropriate mm/dd/yyyy format
     */
    private String getFormattedBirthday() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(birthday);
    }
    /**
     * Fetches the gender of the given participant 
     * @return the gender and convert it to an uppercase string
     */
    private String getFormattedGender() {
        String genderText = gender.toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }
    /**
     * The following converts the given variables to a string
     */
    public String toString() {
        String result = "***** " + firstName + " " + lastName + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(visits.size() == 0) {
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
