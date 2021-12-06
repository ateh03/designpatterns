package adapter;

import java.util.ArrayList;

public class MedicalRecordAdapter<Date> {
    private HealthRecord record;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Object healthRecord;
    private Date gender;
    private ArrayList<Visit> visit;

    public MedicalRecordAdapter(HealthRecord record) {
        new record Object HealthRecord = this.healthRecord;
    }

    public String getFirstName() {
        String firstName = this.firstName;
        return firstName;
    }

    public String getLastName() {
        String lastName = this.lastName;
        return lastName;
    }
    
    public Date getBirthday() {
        Date birthday = this.birthday;
        return birthday;
    }

    public Gender getGender() {
        Date gender = this.gender;
        return gender;
    }

    public void addVisit(Date date, boolean well, String description) {
        return date;
        return well;
        return description;
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visit = this.visit;
        return visit;
    }


}
