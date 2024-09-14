package assignment11;

import java.text.*;
import java.util.*;

public class StudentList {
    ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {}
    public StudentList (ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() { return studentList; }
    public void setStudentList(ArrayList<Student> studentList) { this.studentList = studentList; }
    
    public void addStudent (Student student) throws ParseException {
        student.addStudent();
        studentList.add(student);
    }
    public void deleteStudentById (String id) {
        if (studentList.isEmpty())
            System.out.println("List is empty please initiation !");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(id)) {
                studentList.remove(i);
                System.out.println("Delete success !");
                break;
            }
            if (i == (studentList.size() - 1)) {
                System.out.println("This id isn't exist !");
            }
        }
        
    }
    public Student findStudentById (String id) {
        if (studentList.isEmpty()) {
            System.out.println("List is empty please initiation !");
            return null;
        }
        
        for (Student i : studentList) {
            if (i.getId().equalsIgnoreCase(id)) {
                System.out.print("\n|Student found|");
                i.displayInfo();
                return i;
            }
        }
        return null;
    }
    public void displayAllStudent() {
        if (studentList.isEmpty())
            System.out.println("List is empty please initiation !");
        
        for (Student i : studentList) {
            i.displayInfo();
        }
    }
    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            System.out.println("\nList is empty please initiation !");
            return null;
        }
        
        Student topStudent = studentList.get(0);
        for (Student i : studentList) {
            if (i.getGpa() > topStudent.getGpa()) {
                topStudent = i;
            }
        }
        
        System.out.print("\n|The top student by GPA|");
        for (Student i : studentList) {
            if (topStudent.getGpa() == i.getGpa()) {
                i.displayInfo();
            }
        }
        return topStudent;
    }
}
