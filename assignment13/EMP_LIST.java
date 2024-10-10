package assignment13;

import java.util.ArrayList;
import java.util.Scanner;

public class EMP_LIST {
    private ArrayList<EMPLOYEE> emList = new ArrayList<>();

    public ArrayList<EMPLOYEE> getEmList() {
        return emList;
    }

    public void setEmList(ArrayList<EMPLOYEE> emList) {
        this.emList = emList;
    }
    
    public void addNew (EMPLOYEE emp) {
        emp.input();
        emList.add(emp);
    }
    public void update (String emId) {
        for (EMPLOYEE employee : emList) {
            if (emId.equals(employee.getEmId())) {
                if (employee instanceof EMP_FULLTIME) {
                    ((EMP_FULLTIME) employee).update(emId);
                }
                else if (employee instanceof EMP_PARTTIME) {
                    ((EMP_PARTTIME) employee).update(emId);
                }
            }
        }
    }
    public void find (String emId) {
        for (EMPLOYEE employee : emList) {
            if (emId.equals(employee.getEmId())) {
                employee.output();
            }
        }
    }
    public void delete (String emId) {
        for (int i = 0; i < emList.size(); i++) {
            if (emId.equals(emList.get(i).getEmId())) {
                emList.remove(i);
            }
        }
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        EMP_LIST empList = new EMP_LIST();
        int choice = 0;
        String id;
        do{
            System.out.print("\n1. Add full time employee"
                                + "\n2. Add part time employee"
                                + "\n3. Update employee by id"
                                + "\n4. Delete employee bt id"
                                + "\n5. Find employee by id"
                                + "\n6. Display all employees"
                                + "\n0. Exist"
                                + "\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    EMPLOYEE emp = new EMP_FULLTIME();
                    empList.addNew(emp);
                    break;
                }
                case 2 -> {
                    EMPLOYEE emp = new EMP_PARTTIME();
                    empList.addNew(emp);
                    break;
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter id: ");
                    id = sc.nextLine();
                    empList.update(id);
                    break;
                }
                case 4 -> {
                    sc.nextLine();
                    System.out.print("Enter id: ");
                    id = sc.nextLine();
                    empList.delete(id);
                    break;
                }
                case 5 -> {
                    sc.nextLine();
                    System.out.print("Enter id: ");
                    id = sc.nextLine();
                    empList.find(id);
                    break;
                }
                case 6 -> {
                    for (EMPLOYEE employee : empList.getEmList()) {
                        employee.output();
                    }
                    break;
                }
                case 0 -> { break; }
                default -> {
                    System.out.println("This case isn't exist !");
                }
            }
        } while (choice != 0);
    }
}
