//Contains unique and sorted elements

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_Set {

    public static void main(String[] args) {
        //Creating HashSET
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

//        Scanner scan  = new Scanner(System.in);
//        System.out.println("Enter the number to search: ");
//        int num = scan.nextInt();
//
//        //Search
//        if(set.contains(num)){
//            System.out.println("Set contains 2");
//        }
        //Print all elements
        System.out.println(set);

        //Delete
        set.remove(2);
        System.out.println(set);

        //Using Iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if the set is empty
        if(set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }

        // Get the size of the set
        System.out.println("Size of the set: " + set.size());

        // Clear the set
        set.clear();
        System.out.println("Set after clearing all elements: " + set);


    }

}
