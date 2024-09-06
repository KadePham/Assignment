package assignment.pkg9;

public class Caculation {
    int sum (int a, int b) {
        return a + b;
    }
    int sum (int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Caculation obj = new Caculation();
        System.out.println(obj.sum(20, 20));
        System.out.println(obj.sum(10, 10, 10));
    }
}
