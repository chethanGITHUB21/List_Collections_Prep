import java.util.Stack;
import java.util.Vector;


public class StackVec {
    
    public static void main(String[] args) {

        Vector<Integer> vec = new Vector<>(3);


        // using add() operation to add the element add(obj) add(index, obj)
        vec.add(1);
        System.out.println(vec.capacity());
        vec.add(156);
        vec.add(2);
        System.out.println(vec.capacity());
        vec.add(34);
        vec.add(34);
        vec.add(5);        
        vec.add(3);

        // initial capacity is 10 and when full it will increment with capacity()*2
        // if set the increment and initial size like vector(3, 5), when full the 3 index the capacity(3)*5 = 15
        System.out.println(vec.capacity());

        System.out.println(vec);

        // we use the updating element using set(index, obj)
        System.out.println(vec.set(3,1000));

        // we can use the remove() method to remove element with parameter like remove(obj), remove(index)
        System.out.println(vec.remove(3));
        System.out.println(vec.remove(5));

        // =========================================
                    // Stack                      
        // =========================================

        Stack<String> stk = new Stack<>();
System.out.println(stk.capacity());
        // use add()  or push() to insert element
        stk.push("chethan");
        stk.add("pooja");
        stk.add("tanuj");

        System.out.println(stk);
        
        // use pop() to remove the head element of stack
        System.out.println(stk.pop());

        // use peek() to view the head element of the stack 
        System.out.println(stk.peek());
        
        // use empty() methods to check whether the stack is empty or not 
        System.out.println(stk.empty());

        
        // using customizable method using class pair and inserting both string and integer datatypes 
        Stack<pair> stk2 = new Stack<>();

        stk2.push(new pair("chethan",23));

        System.out.println("admin name and his age is given here: "+ stk2.peek());



       
    }
    
}

// this class give us the preveledge to insert mutiDataType data at onces
class pair{
    String str;
    Integer num;

    pair(String st, Integer nm){
        this.str = st.toString();
        this.num = nm;
    }

     @Override
    public String toString() {
        return "Name: " + str + ", Age: " + num;
    }
}
