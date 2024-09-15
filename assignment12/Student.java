package assignment12;

import java.text.*;
import java.util.*;

public class Student extends Person {
    private String major;
    private float gpa;
    private double tuition;
    private boolean schoolarship;

    public Student() {}
    public Student(String major, float gpa, double tuition, boolean schoolarship) {
        this.major = major;
        this.gpa = gpa;
        this.tuition = tuition;
        this.schoolarship = schoolarship;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public double getTuition() {
        return tuition;
    }
    public void setTuition(double tuition) {
        this.tuition = tuition;
    }
    public boolean getSchoolarship() {
        return schoolarship;
    }
    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }
    
    public void addStudent() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("|Type Student Information|");
        System.out.print("ID = "); String id = scanner.nextLine();
        setId(id);
        System.out.print("Full_Name = "); String fullName = scanner.nextLine();
        setFullName(fullName);
        System.out.print("Date_Of_Birth = "); String dateOfBirthString  = scanner.nextLine();
        Date dateOfBirth = formatter.parse(dateOfBirthString);
        setDateOfBirth(dateOfBirth);
        System.out.print("Gpa = "); float gpa = Float.parseFloat(scanner.nextLine());
        setGpa(gpa);
        System.out.print("Major = "); String major = scanner.nextLine();
        setMajor(major);
        System.out.print("Tuition = "); double tuition = Double.parseDouble(scanner.nextLine());
        setTuition(tuition);
        if (getGpa() >= 9)
            setSchoolarship(true);
        else setSchoolarship(false);
        calculateTuition();
//        System.out.print("Scholarship = "); boolean scholarship = scanner.nextBoolean();
//        setSchoolarship(schoolarship);
    }
    public double calculateTuition() {
        final float discount = 0.5f;
        if (getSchoolarship()) {
            setTuition(getTuition() * discount);
            return getTuition();
        }
        return 0;
    }
    
    @Override
    public void displayInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Student { ID = " + getId());
        System.out.print(", Full_Name = " + getFullName());
        System.out.print(", Date_Of_Birth = " + formatter.format(getDateOfBirth()));
        System.out.print(", Gpa = " + getGpa());
        System.out.print(", Major = " + getMajor());
        System.out.print(", Tuition = " + getTuition());
        System.out.println(", Scholarship = " + getSchoolarship() + " }");
    }
    
}
