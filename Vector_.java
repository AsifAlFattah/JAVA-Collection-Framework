//Use Vector when need a dynamic array that is thread-safe without external synchronization.
import java.util.*;

public class Vector_ {

    public static void main(String[] args) {
        // Declaration
        Vector<Integer> vector = new Vector<>();

        // Insertion
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        // Print all elements
        System.out.println("Vector elements: " + vector);

        // Get an element at a specific index
        int element = vector.get(2); // Retrieves the element at index 2
        System.out.println("Element at index 2: " + element);

        // Update an element at a specific index
        vector.set(2, 10); // Updates the element at index 2 to 10
        System.out.println("Vector elements after update: " + vector);

        // Remove an element at a specific index
        vector.remove(2); // Removes the element at index 2
        System.out.println("Vector elements after removal: " + vector);

        // Iterate through the Vector
        System.out.println("Iterating through Vector:");
        for (Integer num : vector) {
            System.out.println(num);
        }

        // Size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Check if the Vector contains a specific element
        boolean contains = vector.contains(3);
        System.out.println("Vector contains 3: " + contains);

        // Clear the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);

        // Check if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Vector is empty: " + isEmpty);
    }

}
