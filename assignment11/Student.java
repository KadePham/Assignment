package assignment11;

import java.text.*;
import java.util.*;

abstract class Person implements IPerson{
    private String id, fullName;
    Date dateOfBirth = new Date();

    public Person() {}
    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() { return id; }
    public void setId (String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName (String fullName) { this.fullName = fullName; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth (Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    
    @Override
    public abstract void displayInfo();
}

public class Student extends Person {
    private float gpa;
    private String major;

    public Student() {}
    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() { return gpa; }
    public void setGpa (float gpa) { this.gpa = gpa; }
    public String getMajor() { return major; }
    public void setMajor (String major) { this.major = major; }
    
    public void addStudent() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("|Enter student information|");
        System.out.print("ID = "); String id = scanner.nextLine();
        setId(id);
        System.out.print("Name = "); String fullName = scanner.nextLine();
        setFullName(fullName);
        System.out.print("Date_Of_Birth (dd/mm/yyyy) = "); String dateOfBirthString = scanner.nextLine();
        dateOfBirth = formatter.parse(dateOfBirthString);
        setDateOfBirth(dateOfBirth);
        System.out.print("GPA = "); float gpa = Float.parseFloat(scanner.nextLine());
        setGpa(gpa);
        System.out.print("Major = "); String major = scanner.nextLine();
        setMajor(major);
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("\nStudent { ");
        System.out.print("ID = " + getId());
        System.out.print(", Full_Name = " + getFullName());
        System.out.print(", Date_Of_Birth = " + formatter.format(getDateOfBirth()));
        System.out.print(", GPA = " + getGpa());
        System.out.print(", Major = " + getMajor() + " } ");
        System.out.println();
    }
}