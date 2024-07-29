//ArrayList is better for storing and accessing data.

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(2);
        list.add(3);

        // Print the list
        System.out.println("Initial List: " + list);

        // Get elements
        int element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // Add element in between
        list.add(1, 1);
        System.out.println("After adding 1 at index 1: " + list);

        // Set element / update / change
        list.set(0, 5);
        System.out.println("After setting index 0 to 5: " + list);

        // Delete element
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // Size
        int size = list.size();
        System.out.println("Size of list: " + size);

        // Looping through the list
        System.out.print("Elements of list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting (lower to higher)
        Collections.sort(list);
        System.out.println("Sorted list (ascending): " + list);

        // Sorting (higher to lower)
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list (descending): " + list);

        // Check if list contains an element
        System.out.println("List contains 1: " + list.contains(1));
        System.out.println("List contains 5: " + list.contains(5));

        // Clear the list
        list.clear();
        System.out.println("List after clearing: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
