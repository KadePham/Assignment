package assignment8;

import java.util.*;

public class NumberExercise {
    public static ArrayList<Integer> enterData (ArrayList<Integer> arrays) {
        arrays.clear();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers of element: ");
        int numbersOfElement = scanner.nextInt();
        int i = 0;
        while (i < numbersOfElement) {            
            System.out.print("Enter element " + i + " : ");
            int element = scanner.nextInt();
            arrays.add(element);
            i++;
        }
        
        return arrays;
    }
    public static void printData (ArrayList<Integer> arrays) {
        if (arrays.isEmpty())
            System.out.println("Array is empty please initization !");
        else
            System.out.println("\nYour arrays: " + Arrays.toString(arrays.toArray()));
    }
    public static int findMax2 (ArrayList<Integer> arrays) {
        if (arrays.isEmpty()) {
            System.out.println("Array is empty please initization !");
            return 0;
        }
        Collections.sort(arrays);
        int max = arrays.get(arrays.size() - 1);
        int max2 = 0;
        
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) > max2 && arrays.get(i) < max) {
                max2 = arrays.get(i);
            }
        }
        
        return max2;
    }
    public static void deleteOddNumber (ArrayList<Integer> arrays) {
        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i) % 2 != 0) {
                arrays.remove(i);
                i = 0;
            }
        }
        
        printData(arrays);
    }
}
