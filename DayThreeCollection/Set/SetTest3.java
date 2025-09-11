package DayThreeCollection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {
    public static void main(String[] args) {
        Set<Character> charSet = new HashSet<Character>();
        charSet.add('A');

        charSet.add('B');
        charSet.add('C');
        charSet.add('A'); // Duplicate, will not be added
        System.out.println("Character Set: " + charSet);

        // Call contain method to check an element
        System.out.println("Set contains 'B': " + charSet.contains('B'));
        System.out.println("Set contains 'D': " + charSet.contains('D'));
    
        // Remove an element
        charSet.remove('C');
        System.out.println("Character Set after removing 'C': " + charSet);

        // contains method to check an element
        System.out.println("Set contains 'C': " + charSet.contains('C'));

        int hashcode = charSet.hashCode();
        System.out.println("Hash code of the set: " + hashcode);
        
    
    
    }
}
