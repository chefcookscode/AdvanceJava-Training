package DayThreeCollection.LinkedList;

import java.util.LinkedList;


public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Puneet");
        name.add("Priyanshu");
        name.add("Sudhanshu");
        System.out.println(name);
        System.out.println("Size of LinkedList: " + name.size());
        System.out.println("Linkedlist insertion order" + name);

        LinkedList cities  = new LinkedList();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("New York");
        System.out.println(cities);

        System.out.println("Remove Mumbai: " + cities.remove("Mumbai"));
        System.out.println("After removing Mumbai: " + cities);

        System.out.println("Remove First New york" + cities.removeFirst());
        System.out.println("After removing first element: " + cities);

        
    }
}
