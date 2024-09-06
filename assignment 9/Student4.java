package assignment.pkg9;

public class Student4 {
    int id;
    int age;
    String name;

    Student4 (int i, String n) {
        this.id = i;
        this.name = n;
    }
    Student4 (int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }
    void display () { System.out.println(this.id + " " + this.name + " " + this.age); }
    
    public static void main(String[] args) {
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
