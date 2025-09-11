package DayThreeCollection;
import java.util.ArrayList;
import java.util.List;
public class Demo1 {
    public static void main(String[] args) {
        // List one 
        List<String> a = new ArrayList<String>();
        a.add("Hello");
        a.add("World");
        a.add("Java");
        System.out.println("List contain: " + a);

        // List two
        List<String> a1 = new ArrayList<String>();

        a1.add("11");
        a1.add("22");
        a1.add("33");
        System.out.println("List two contain: " + a1);
        a.addAll(2, a1);
        System.out.println("After adding list two into list one at index 2: " + a);

        
    }
}
