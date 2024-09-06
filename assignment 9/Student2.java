package assignment.pkg9;

public class Student2 {
    int id;
    String name;
    
    public Student2 (int id, String name) {
        this.id = id;
        this.name = name;
    }
    void displayInformation () {
        System.out.println("ID: " + this.id + ",Name :" + this.name);
    }
    
    public static void main(String[] args) {
        Student2 stu = new Student2(1, "Nam");
        Student2 stu1 = new Student2(2, "Lan");
        stu.displayInformation();
        stu1.displayInformation();
    }
}
