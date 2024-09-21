package studentver4;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();
        personList.addStudent();
        personList.addStudent();
        personList.addTeacher();
        System.out.print("\nEnter id to update: "); String idToUpdate = scanner.nextLine();
        personList.updatePerson(idToUpdate);
        System.out.print("\nEnter id to delete: "); String idToDelete = scanner.nextLine();
        personList.deletePersonById(idToDelete);
        personList.displayEveryone();
        System.out.print("\nEnter id to find: "); String idToFind = scanner.nextLine();
        personList.findPersonById(idToFind).displayInfo();
        personList.findTopStudent().displayInfo();
        System.out.print("\nEnter department to find teacher: "); String departmentToFind = scanner.nextLine();
        personList.findTeacherByDepartment(departmentToFind).displayInfo();
    }
}
