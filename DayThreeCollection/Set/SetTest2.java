package DayThreeCollection.Set;

import java.util.Set;
import java.util.HashSet;
public class SetTest2 {
    public static void main(String[] args) {
        
        Set<String> s = new HashSet<String>();
        boolean check = s.isEmpty();
        System.out.println("Is set empty: " + check);
        s.add("Apple");
        s.add("Banana");
        s.add("Orange");
        s.add("Apple"); // Duplicate, will not be added

        System.out.println("Set: " + s);

        // Check if set contains "Banana"
        System.out.println("Set contains 'Banana': " + s.contains("Banana"));

        if(s.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
            System.out.println("Elements in the set: " + s);  

        }

        s.remove("Orange");
        System.out.println("Set element after removing 'Orange': " + s);

        System.out.println("Set size: " + s.size());
    }
    
}
