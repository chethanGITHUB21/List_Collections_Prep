
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Linked_List {

    public static void main(String[] args) {

        // this is the arrayList under List
        List<String> chethanList = new ArrayList<>();

        chethanList.add("SQL");
        chethanList.add("Python");
        chethanList.add("Java");

        // this is the LinkedList under List
        List<String> chethanLink = new LinkedList<>();

        chethanLink.add("chethan");
        chethanLink.add("Pooja");
        chethanLink.add("Tanuj");

        // using addAll methods to add multiple elements
        chethanLink.addAll(Arrays.asList("Sonu", "Kittu"));
        chethanList.addAll(Arrays.asList("JWT", "Redish"));

        // using replaceAll methods to target individual elements inside the list and apply the string methods
        chethanLink.replaceAll(String::toLowerCase);
        chethanList.replaceAll(String::toUpperCase);

        // using replaceAll and Lambda symbol to targetting concatination over the chethanList
        chethanList.replaceAll(e -> e + "_Language");

        // using Collections to use the sort method and sort them alphabetically (uppercase --> lowercase)
        Collections.sort(chethanList);
        Collections.sort(chethanLink);

        System.out.println(chethanList);
        System.out.println(chethanLink);

        Queue<String> chethanq = new LinkedList<>();

        chethanq.add("Task1");
        chethanq.offer("Task2");

        System.out.println(chethanq);

        System.out.println(chethanq.element());
        System.out.println(chethanq.peek());

        System.out.println(chethanq.remove());
        System.out.println(chethanq.poll());

        System.out.println("Final Queue: " + chethanq);

        // Setting the Queue size using concurrent.LinkedBlockingQueue and try to run the queue operation to examine the exceptional cases and special values 
        Queue<String> chethanSet = new LinkedBlockingQueue<>(10);

        // use add() methods and offer() methods to add elements according to the size value given
        chethanSet.add("first");
        chethanSet.add("Second");
        chethanSet.offer("Third");
        chethanSet.offer("fourth");

        // throw exceptional error in add() methods and special value in offer() methods to safe adding because the size is fixed and you cant add five values
        chethanSet.add("fifth");
        chethanSet.offer("Fifth");

        // use remove() methods to remove the first element and poll() methods to safe removing the element
        chethanSet.remove();
        chethanSet.poll();

        // Using the element() methods for exceptional error and peek() methods for the returning the special values incase it wont find any head 
        // The Checking operations are used to check the head value of the queue not for the whole list elements
        System.out.println(chethanSet.element());
        System.out.println(chethanSet.peek());

        Deque<String> chethanDeq = new LinkedList<>();

        // Using Deque method to add and remove the elements from both the direction
        // using addFirst(), addLast() and offerFirst(), offerLast() methods to insert the elements from both side of queue
        chethanDeq.addFirst("first element");
        chethanDeq.addLast("last element");
        chethanDeq.offerFirst("first safe insertion");
        chethanDeq.offerLast("last safe insertion");

        // using getFirst(), getLast() and peekFirst(), peekLast() methods are used to look and examine the first and last element in queue
        chethanDeq.getFirst();
        chethanDeq.getLast();
        chethanDeq.peekFirst();
        chethanDeq.peekLast();

        // using removeFirst(), removeLast() and pollFirst(), pollLast() methods to remove the first and last element in queue
        chethanDeq.removeFirst();
        chethanDeq.removeLast();
        chethanDeq.pollFirst();
        chethanDeq.pollLast();

    }
}
