package DayThreeCollection;
import java.util.ArrayList;
import java.util.List;
public class Demo {
    public static void main(String[] args) {
        
        // List a = new ArrayList();
        List<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(14);
        a.add(37);

        System.out.println(a);

        a.add(2, 78);
        System.out.println(a);

        a.remove(1);

    }
    
}
