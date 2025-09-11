package DayThreeCollection.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("20");
        a.add(30);
        a.add("Puneet");
        System.out.println(a);

        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add("300");
        a1.add("Priyanshu");
        a1.add(400);
        System.out.println(a1);

        // Add both list
        a.addAll(a1);
        System.out.println("After adding both list: " + a);
    }
}
