package Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements in the ArrayList: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        
        removeDuplicates(list);

        
        System.out.println("The ArrayList without duplicates is: " + list);

        scanner.close();
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        list.removeIf(e -> !set.add(e));
    }
}