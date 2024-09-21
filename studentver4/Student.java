package studentver4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student extends Person{
    private float gpa;
    private String major;

    public Student() {}
    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    
    @Override
    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("|Enter Student Informations|");
            System.out.print("ID = "); setId(scanner.nextLine());
            System.out.print("Full_Name = "); setFullName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setDateOfBirht(formatter.parse(scanner.nextLine()));
            System.out.print("GPA = "); setGpa(Float.parseFloat(scanner.nextLine()));
            System.out.print("Major = "); setMajor(scanner.nextLine());
        } catch (ParseException ex) {
            System.out.println("Wrong format !");
        }
    }
    @Override
    public void updatePerson(String id) {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("|Enter Student Informations|");
            setId(id);
            System.out.print("Full_Name = "); setFullName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setDateOfBirht(formatter.parse(scanner.nextLine()));
            System.out.print("GPA = "); setGpa(Float.parseFloat(scanner.nextLine()));
            System.out.print("Major = "); setMajor(scanner.nextLine());
        } catch (ParseException ex) {
            System.out.println("Wrong format !");
        }
    }
    @Override
    public void displayInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(" Student { ID = " + getId() + ", Full_Name = " + getFullName()
                + ", Date_Of_Birth = " + formatter.format(getDateOfBirht()) + ", GPA = " + getGpa()
                + ", Major =" + getMajor() + " }");
    }
}
