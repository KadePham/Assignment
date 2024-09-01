package assignment8;

import java.util.*;

public class Process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int choose;
        
        do {            
            System.out.println("1. importData");
            System.out.println("2. printData");
            System.out.println("3. findMax2");
            System.out.println("4. deleteOddNumber");
            System.out.println("5. End process !");
            System.out.print("Enter your choose (1 -> 5): ");
            choose = scanner.nextInt();
            
            switch (choose) {
                case 1 ->  {
                    NumberExercise.enterData(numbers);
                }
                case 2 ->  {
                    NumberExercise.printData(numbers);
                }
                case 3 ->  {
                    System.out.println("The second maximum number of array: " + NumberExercise.findMax2(numbers));
                }
                case 4 ->  {
                    NumberExercise.deleteOddNumber(numbers);
                }
                default -> {
                    if (choose == 5) break;
                    else System.out.println("That case isn't exist ! Choose again please !");
                }
            }
        } while (choose != 5);
    }
}
