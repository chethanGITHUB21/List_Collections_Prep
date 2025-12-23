import java.util.*;
public class Tree_Set {

    public static void main(String[] args) {
        
        NavigableSet<Integer> t = new TreeSet<>();

        for(int i=1;i<=10;i++){

            t.add(i);
            
        }

        // Using Stringbuilder for string mutation and manipulation
        StringBuilder name = new StringBuilder("chethan");

        name.append("innovator");
        System.out.println(name);
        name.codePointAt(4);
        System.out.println(name);
        name.replace(0,3,"T");
        System.out.println(name);
        name.reverse();
        System.out.println(name);

        String result = name.toString();
        System.out.println("Final comparision: "+result);        
        
        // Using comparable in treeset to compare two object 
        Set<StringBuffer> ts = new TreeSet<>(new Comparator<StringBuffer>() {

            @Override
            public int compare(StringBuffer name, StringBuffer name1){
                return name.toString().compareTo(name1.toString());

            }            
        });

        ts.add(new StringBuffer("chethan"));
        ts.add(new StringBuffer("1"));
        ts.add(new StringBuffer("202"));
        ts.add(new StringBuffer("developer"));
        ts.add(new StringBuffer("innovator"));

        System.out.println(ts);
        

        

        
    }
    
}
