package assignment12;

import java.text.*;
import java.util.*;

public class Processor {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        do {            
            System.out.println("1. Add new student");
            System.out.println("2. Update student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find the top student's highest gpa");
            System.out.println("6. Display student with scholarship");
            System.out.println("7. Display total tuition of all students");
            System.out.println("0. Exit");
            System.out.print("Your choice [0 - 7]: ");
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 0 -> {
                    choice = 0;
                    break;
                }
                case 1 -> {
                    Student student = new Student();
                    studentList.addStudent(student);
                    System.out.println();
                    break;
                }
                case 2 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    scanner.nextLine();
                    System.out.print("Enter student ID to update: ");
                    String idToUpdate = scanner.nextLine();
                    studentList.updateStudent(idToUpdate);
                    System.out.println();
                    break;
                }
                case 3 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    scanner.nextLine();
                    System.out.print("Enter student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudent(idToDelete);
                    System.out.println();
                    break;
                }
                case 4 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    System.out.println("|All students information|");
                    studentList.displayAllStudent();
                    System.out.println();
                    break;
                }
                case 5 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    System.out.println("|The top student(s)|");
                    studentList.findTopStudent();
                    System.out.println();
                    break;
                }
                case 6 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    System.out.println("|Student(s) with scholarship|");
                    studentList.findScholarshipStudents();
                    System.out.println();
                    break;
                }
                case 7 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty, please initiation !");
                        System.out.println();
                        break;
                    }
                    System.out.println("|Total tuition of all students|");
                    System.out.println(studentList.calculateTuitionOfAllStudents());
                    break;
                }
                default -> {
                    System.out.println("This case isn't exist, please type again !");
                    System.out.println();
                }
            }
        } while (choice != 0);
    }
}
