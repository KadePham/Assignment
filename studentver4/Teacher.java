package studentver4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teacher extends Person{
    private String department, teachingSubject;

    public Teacher() {}
    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getTeachingSubject() { return teachingSubject; }
    public void setTeachingSubject(String teachingSubject) { this.teachingSubject = teachingSubject; }
    
    @Override
    public void addPerson() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("|Enter Teacher Informations|");
            System.out.print("ID = "); setId(scanner.nextLine());
            System.out.print("Full_Name = "); setFullName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setDateOfBirht(formatter.parse(scanner.nextLine()));
            System.out.print("Department = "); setDepartment(scanner.nextLine());
            System.out.print("Teaching_Subject = "); setTeachingSubject(scanner.nextLine());
        } catch (ParseException ex) {
            System.out.println("Wrong format !");
        }
    }
    @Override
    public void updatePerson(String id) {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("|Enter Teacher Informations|");
            setId(id);
            System.out.print("Full_Name = "); setFullName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setDateOfBirht(formatter.parse(scanner.nextLine()));
            System.out.print("Department = "); setDepartment(scanner.nextLine());
            System.out.print("Teaching_Subject = "); setTeachingSubject(scanner.nextLine());
        } catch (ParseException ex) {
            System.out.println("Wrong format !");
        }
    }
    @Override
    public void displayInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(" Student { ID = " + getId() + ", Full_Name = " + getFullName()
                + ", Date_Of_Birth = " + formatter.format(getDateOfBirht())
                + ", Department = " + getDepartment() + ", Teaching_Subject =" + getTeachingSubject() + " }");
    }
}
