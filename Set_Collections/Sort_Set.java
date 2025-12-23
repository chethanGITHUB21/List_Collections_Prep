import java.util.*;

public class Sort_Set {

    public static void main(String[] args){
        
        // Sorted set for integer
        SortedSet<Integer> numSet = new TreeSet<>();

        for(int i =1; i<= 100; i+=10){
            numSet.add(i);

        }
        // using subSet(from value, to value) to filter the value by given range of value from element - to element  
        System.out.println(numSet.subSet(10,60));
        System.out.println(numSet.tailSet(50));
        System.out.println(numSet.headSet(30));
        
        System.out.println(numSet.first());
        System.out.println(numSet.last());

        System.out.println(numSet.contains(256));

        System.out.println(numSet.remove(23));
        System.out.println(numSet);

        // Soretd set for String element
        SortedSet<String> numSet1 = new TreeSet<>();

        numSet1.add("chethan");
        numSet1.add("chethan");
        numSet1.add("chethan");
        numSet1.add("pooja");

        System.out.println(numSet1);

        // using iterator in both integer and string sorted set 
        Iterator itnum = numSet.iterator();
        Iterator itstr = numSet1.iterator();

        while(itnum.hasNext()){
            System.out.println(itnum.next());
        }
        while(itstr.hasNext()){
            System.out.println(itstr.next());
        }
        
        

    

    }
    
}
