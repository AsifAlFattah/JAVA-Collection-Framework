import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element/update/change
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //looping
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //sorting (lower to higher)
        Collections.sort(list);
        System.out.println(list);

        //sorting (higher to lower)
        Collections.sort(list, Collections.reverseOrder()); // or Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);

    }
}
