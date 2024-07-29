//LinkedList is better for manipulating data.

import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.addFirst("A");
        list.add("D");
        list.addFirst("B");
        list.addLast("C");

        // Display the list
        System.out.println("Initial List: " + list);

        // Size of the list
        System.out.println("Size of list: " + list.size());

        // Print the values of the list
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Remove elements
        list.removeFirst(); // Remove the first element
        list.removeLast();  // Remove the last element
        list.remove("D");   // Remove element by value

        // Display the list after removals
        System.out.println("List after removals: " + list);

        // Check if list contains an element
        System.out.println("Contains 'A': " + list.contains("A"));
        System.out.println("Contains 'B': " + list.contains("B"));

        // Get elements by index
        if(!list.isEmpty()) {
            System.out.println("First element: " + list.getFirst());
            System.out.println("Last element: " + list.getLast());
        }

        // Clear the list
        list.clear();

        // Display the list after clearing
        System.out.println("List after clearing: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
