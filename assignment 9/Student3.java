package assignment.pkg9;

public class Student3 {
    int id;
    String name;
    
    void display () { System.out.println(this.id + " " + this.name); }
    
    public static void main(String[] args) {
        Student3 stu = new Student3();
        Student3 stu2 = new Student3();
        stu.display();
        stu2.display();
    }
}
