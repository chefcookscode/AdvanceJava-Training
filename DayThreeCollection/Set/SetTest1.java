package DayThreeCollection.Set;


import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        // Create a Set of color names
        Set<String> colors = new HashSet<>();

        colors.add("blue");
        colors.add("red");
        colors.add("green");
        System.out.println("Initial Set: " + colors);

        colors.add("red");  // Duplicate not added
        System.out.println("After adding duplicate 'red': " + colors);

        colors.remove("green");
        System.out.println("After removing 'green': " + colors);

        System.out.println("Contains 'blue'? " + colors.contains("blue"));
        System.out.println("Contains 'green'? " + colors.contains("green"));

        System.out.println("Set size: " + colors.size());

        System.out.println("Iterating over colors:");
        for (String color : colors) {
            System.out.println(color);
        }


        colors.clear();
        System.out.println("After clearing, is the set empty? " + colors.isEmpty());

        // Use contains to check for an element
        if(colors.contains("Black")) {
            System.out.println("Set contains Black");
        } else {
            colors.add("Black");
            System.out.println("Black color is added");
            System.out.println("Set elements: " + colors);
            
           
        }

        Set<String> s2=new HashSet<>();
        s2.add("White");
        s2.add("Yellow");
        s2.add("Pink");

        colors.addAll(s2);
        System.out.println("Set elements after adding elements from given collection ");
        System.out.println(colors);


    }
}
