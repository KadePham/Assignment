package assignment.pkg9;

public class Calculation2 {
    int sum (int a, int b) { return a + b; }
    double sum (double a, double b) { return a + b; }
    
    public static void main(String[] args) {
        Calculation2 obj = new Calculation2();
        System.out.println(obj.sum(10.5, 10.5));
        System.out.println(obj.sum(20, 20));
    }
}
