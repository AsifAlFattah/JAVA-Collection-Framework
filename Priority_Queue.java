//    Task Scheduling: Manage tasks based on priority.
//    Dijkstra's Algorithm: Find the shortest path in graphs.
//    A Search Algorithm:* Prioritize nodes with lowest estimated cost.
//    Event Simulation: Process events in chronological order.
//    Merging K Sorted Lists: Efficiently merge multiple sorted lists.
//    Job Scheduling: Execute jobs based on priority.
//    Real-time Data Processing: Handle high-priority data first.
//    Bandwidth Management: Prioritize network traffic.
//    Resource Allocation: Allocate resources based on priority.

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {

        //Declaration
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //MinHeap by default

        //Insert
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        // Print the PriorityQueue (elements may not be in sorted order)
        System.out.println("Priority queue elements: " + pq);

        // Peek at the top element (smallest element)
        System.out.println("Top element is: " + pq.peek());

        // Remove the top element (smallest element)
        pq.poll(); //The top element can also be received from this
        System.out.println("Priority queue elements after poll: " + pq);

        // Iterate through the PriorityQueue
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if the PriorityQueue contains a specific element
        if (pq.contains(5)) {
            System.out.println("PriorityQueue contains 5");
        } else {
            System.out.println("PriorityQueue does not contain 5");
        }

        // Get the size of the PriorityQueue
        System.out.println("Size of the PriorityQueue: " + pq.size());

        // Clear the PriorityQueue
        pq.clear();

        // Using PriorityQueue with custom comparator (Max-Heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);
        maxHeap.add(5);

        // Print the Max-Heap PriorityQueue
        System.out.println("Max-Heap PriorityQueue elements: " + maxHeap);

        // Peek at the top element (largest element)
        System.out.println("Top element in Max-Heap (peek): " + maxHeap.peek());

    }
}
