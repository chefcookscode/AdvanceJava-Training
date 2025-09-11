package DayThreeCollection.ArrayList;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Hello");
        a.add(1,null);
        a.add("Puneet");
        a.add("World");

        System.out.println(a);

        a.remove(2);

        System.out.println("After removing element at index 2: " + a);
    }
}
