package DayThreeCollection.ArrayList;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Hello");
        a.add(1,null);
        a.add("Puneet");
        a.add("World");

        System.out.println(a);
    // use get, size, contains
        System.out.println("Element at index 2: " + a.get(2));
        System.out.println("Size of the list: " + a.size());
        System.out.println("List contains 'Puneet': " + a.contains("Puneet"));
        System.out.println("List contains 'Java': " + a.contains("Java"));

        String element = a.get(3);
        System.out.println("Element at index 3: " + element);

        int name = a.indexOf("Puneet");
        System.out.println("Index of 'Puneet': " + name);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Integer List: " + list);    

        // Index of element 20
        int index = list.indexOf(20);
        System.out.println("Index of 20: " + index);

        // use LastIndexOf
        System.out.println(list.lastIndexOf(30)); 


    
}
}
