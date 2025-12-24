import java.util.*;
public class Navigable_Set {

    public static void main(String[] args){

        NavigableSet<Integer> navSet = new TreeSet<>();

        for (int i = 1; i <= 10; i++) {

            navSet.add(i);
        }
        System.out.println(navSet);

        // Using the for loop to iterating through the element from the set we created 
        for(Integer i: navSet){
            System.out.println(i);
        }
        System.out.println(navSet);

        // Using .descendingSet() to reverse the order of the elements which are in by default acsending order in sortedSet.
        NavigableSet<Integer> decNav = navSet.descendingSet();
        System.out.println(decNav);
        
        // Using .headSet(<element, inclusive[include the starting element or not]) methods to print the first few element upto range given.
        NavigableSet<Integer> navHead = navSet.headSet(5, false);
        System.out.println(navHead);

        // Uing .tailSet(>element, inclusive[include the starting element or not]) methods to print the first few element from the range given.
        NavigableSet<Integer> navTail = navSet.tailSet(5, true);
        System.out.println(navTail);

        // Using pollFirst() methods to retrieve and remove the first element from the set
        // Uisng pollLast() methods to retrieve and remove the last element from the set 
        // poll methods are work on view order to access and remove the first as smallest and last as bigger number if they are in acsending order and in decsending order vis-versa.
        System.out.println(navSet.pollFirst());
        System.out.println(navSet.pollLast());     
        System.out.println(navSet);

        System.out.println(decNav.pollFirst());
        System.out.println(decNav.pollLast());
        System.out.println(decNav);
        
        // Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
        System.out.println(navSet.lower(4));

        // Returns the least element in this set strictly greater than the given element, or null if there is no such element.
        System.out.println(navSet.higher(4));

        // Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
        System.out.println(navSet.floor(6));

        // Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        System.out.println(navSet.ceiling(6));
        
    }
    
}
