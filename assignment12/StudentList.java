package assignment12;

import java.text.ParseException;
import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {}
    public StudentList (ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public void addStudent (Student student) throws ParseException {
        student.addStudent();
        studentList.add(student);
    }
    public void updateStudent (String id) throws ParseException {
        int count = 0;
        
        for (Student i : studentList) {
            if (id.equalsIgnoreCase(i.getId())) {
                i.addStudent();
                break;
            }
            count++;
            if (count == studentList.size())
                System.out.println("This ID isn't exist !");
        }
    }
    public void deleteStudent (String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equalsIgnoreCase(studentList.get(i).getId())) {
                studentList.remove(i);
                System.out.println("Delete success !");
            }
            else if (i == (studentList.size() - 1))
                System.out.println("This ID isn't exist !");
        }
    }
    public Student findStudentById (String id) {
        if (studentList.isEmpty()) {
            System.out.println("List is empty, please initiation !");
            return null;
        }
        
        for (Student i : studentList) {
            if (id.equalsIgnoreCase(i.getId()))
                return i;
        }
        return null;
    }
    public void displayAllStudent() {
        for (Student i : studentList) {
            i.displayInfo();
        }
    }
    public Student findTopStudent() {
        if (studentList.isEmpty())
            return null;
        
        Student topStudent = studentList.get(0);
        for (Student i : studentList) {
            if (topStudent.getGpa() < i.getGpa())
                topStudent = i;
        }
        
        for (Student i : studentList) {
            if (topStudent.getGpa() == i.getGpa())
                i.displayInfo();
        }
        return topStudent;
    }
    public ArrayList<Student> findScholarshipStudents() {
        if (studentList.isEmpty())
            return null;
        
        ArrayList<Student> scholarshipStudentList = new ArrayList<>();
        for (Student i : studentList) {
            if (i.getSchoolarship() == true)
                scholarshipStudentList.add(i);
        }
        if (scholarshipStudentList.isEmpty()) {
            System.out.println("");
        }
        return scholarshipStudentList;
    }
    public double calculateTuitionOfAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("List is empty, please initiation !");
            return 0;
        }
        double totalTuition = 0;
        for (Student i : studentList) {
            totalTuition += i.getTuition();
        }
        return totalTuition;
    }    
}
