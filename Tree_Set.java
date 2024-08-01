//We should use a TreeSet when we need a collection that:
//
//        Maintains Sorted Order: Elements are automatically sorted in natural order or by a specified comparator.
//        Ensures Uniqueness: Elements are unique, similar to a HashSet.
//        Provides Sorted Set Operations: Requires range views (e.g., headSet, tailSet, subSet).
//        Retrieves Ordered Elements Efficiently: Quickly access the smallest or largest elements.
//        Common use cases:
//
//        Storing and retrieving sorted data.
//        Implementing navigable sets.
//        Maintaining a set of unique elements in a specific order.

import java.util.TreeSet;
import java.util.Comparator;

public class Tree_Set {
    public static void main(String[] args) {

        // Declaration
        TreeSet<Integer> ts = new TreeSet<>();

        // Insertion
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);

        // Print all elements (will be sorted)
        System.out.println("TreeSet elements: " + ts);

        // Check if a specific element is present
        if (ts.contains(3)) {
            System.out.println("TreeSet contains 3");
        } else {
            System.out.println("TreeSet does not contain 3");
        }

        // First and Last elements
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        // Remove an element
        ts.remove(2);
        System.out.println("TreeSet after removing 2: " + ts);

        // Iterate through TreeSet
        System.out.println("Iterating through TreeSet:");
        for (Integer num : ts) {
            System.out.println(num);
        }

        // HeadSet and TailSet
        System.out.println("HeadSet (elements less than 3): " + ts.headSet(3));
        System.out.println("TailSet (elements greater than or equal to 3): " + ts.tailSet(3));

        // SubSet
        System.out.println("SubSet (elements from 2 to 4): " + ts.subSet(2, 4));

        // Comparator
        Comparator<? super Integer> comparator = ts.comparator();
        if (comparator == null) {
            System.out.println("TreeSet uses natural ordering");
        } else {
            System.out.println("TreeSet uses custom comparator");
        }

        // Clear the TreeSet
        ts.clear();
        System.out.println("TreeSet after clearing all elements: " + ts);

        // Check if the TreeSet is empty
        if (ts.isEmpty()) {
            System.out.println("TreeSet is empty");
        } else {
            System.out.println("TreeSet is not empty");
        }

        // Declaration with custom comparator (descending order)
        TreeSet<Integer> ts2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // Sort in descending order
            }
        });

    }
}
