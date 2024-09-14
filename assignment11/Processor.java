package assignment11;

import java.text.*;
import java.util.*;

public class Processor {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        StudentList studentList = new StudentList();
        do {
            System.out.println("\n1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("0. Exit");
            System.out.print("Enter your choice [0 - 5]: "); choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    choice = 0;
                    break;
                }
                case 1 -> {
                    Student student = new Student();
                    studentList.addStudent(student);
                    break;
                }
                case 2 -> {
                    if (studentList.getStudentList().isEmpty()) {
                        System.out.println("List is empty please initiation !");
                        break;
                    }
                    Student student = new Student();
                    scanner.nextLine();
                    System.out.print("Enter id for upadte: ");
                    String idToUpadte = scanner.nextLine();
                    for (Student i : studentList.getStudentList() ) {
                        if (i.getId().equalsIgnoreCase(idToUpadte))
                        {
                            i.addStudent();
                        }
                    }
                    break;
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.print("\nEnter id for delete: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    break;
                }
                case 4 -> {
                    studentList.displayAllStudent();
                }
                case 5 -> {
                    studentList.findTopStudent();
                    break;
                }
                default -> {
                    System.out.println("This case isn't exist");
                }
            }
        }while (choice != 0);
    }
}
