package assignment.pkg9;

public class Calculation4 {
    long sum (int a, long b) { return a + b; }
    int sum (int a, int b, int c) { return a + b + c; }
    
    public static void main(String[] args) {
        Calculation4 obj = new Calculation4();
        System.out.println(obj.sum(20, 20));
        System.out.println(obj.sum(20, 20, 20));
    }
}
