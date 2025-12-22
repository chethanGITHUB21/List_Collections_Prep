import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Prac {

    public static void main(String[] args) {

        // ==============================
        // 1️⃣ LIST CREATION
        // ==============================
        List<String> list = new ArrayList<>();

        // add(E e)
        list.add("java");
        list.add("python");
        list.add("sql");

        // add(int index, E e)
        list.add(1, "c++");

        System.out.println("Initial List: " + list);

        // ==============================
        // 2️⃣ LIST BASIC METHODS
        // ==============================

        // get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // set(int index, E e)
        list.set(2, "javascript");
        System.out.println("After set(): " + list);

        // contains(Object o)
        System.out.println("Contains java? " + list.contains("java"));

        // indexOf(Object o)
        System.out.println("Index of java: " + list.indexOf("java"));

        // lastIndexOf(Object o)
        list.add("java");
        System.out.println("Last index of java: " + list.lastIndexOf("java"));

        // size()
        System.out.println("Size of list: " + list.size());

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // subList(int from, int to)
        List<String> subList = list.subList(1, 3);
        System.out.println("SubList (1 to 3): " + subList);

        // ==============================
        // 3️⃣ ITERATOR (FORWARD + REMOVE)
        // ==============================

        System.out.println("\nIterator Traversal & Removal:");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String element = it.next();
            System.out.println("Reading: " + element);

            // remove()
            if (element.equals("java")) {
                it.remove();   // SAFE removal
            }
        }

        System.out.println("After Iterator removal: " + list);

        // ==============================
        // 4️⃣ LISTITERATOR (FORWARD + UPDATE + ADD)
        // ==============================

        System.out.println("\nListIterator Forward Traversal:");

        ListIterator<String> listIt = list.listIterator();

        while (listIt.hasNext()) {
            String value = listIt.next();

            // set(E e) → update
            listIt.set(value.toUpperCase());

            // add(E e) → add safely during iteration
            if (value.equalsIgnoreCase("sql")) {
                listIt.add("MYSQL");
            }
        }

        System.out.println("After ListIterator update/add: " + list);

        // ==============================
        // 5️⃣ LISTITERATOR (BACKWARD)
        // ==============================

        System.out.println("\nListIterator Backward Traversal:");

        ListIterator<String> reverseIt = list.listIterator(list.size());

        while (reverseIt.hasPrevious()) {
            System.out.println("Reverse: " + reverseIt.previous());
        }

        // ==============================
        // 6️⃣ REMOVE METHODS
        // ==============================

        // remove(int index)
        list.remove(0);

        // remove(Object o)
        list.remove("MYSQL");

        System.out.println("\nAfter remove methods: " + list);

        // ==============================
        // 7️⃣ BULK OPERATIONS
        // ==============================

        // addAll(Collection)
        list.addAll(Arrays.asList("GO", "RUST"));

        // removeAll(Collection)
        list.removeAll(Arrays.asList("GO"));

        // retainAll(Collection)
        list.retainAll(Arrays.asList("PYTHON", "JAVASCRIPT", "SQL", "RUST"));

        System.out.println("After bulk operations: " + list);

        // ==============================
        // 8️⃣ SORTING & REPLACEMENT
        // ==============================

        // sort()
        Collections.sort(list);

        // replaceAll()
        list.replaceAll(e -> e + "_LANG");

        System.out.println("After sort & replaceAll: " + list);

        // ==============================
        // 9️⃣ ARRAY CONVERSION
        // ==============================

        // toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // toArray(T[] a)
        String[] strArr = list.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(strArr));

        // ==============================
        // 🔟 CLEAR LIST
        // ==============================

        // clear()
        list.clear();

        System.out.println("After clear(): " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}


