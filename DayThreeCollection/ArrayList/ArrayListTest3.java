package DayThreeCollection.ArrayList;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {

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
