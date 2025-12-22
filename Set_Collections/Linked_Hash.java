import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Linked_Hash{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> chethanLHS = new LinkedHashSet<>();
        
        for(int i=0;i< 6; i++){
            System.out.println("enter the elements you want to enter: ");
            // I used replaceAll("[^a-zA-Z0-9]", "") to replace all the characters excluding the character which is given inside the brackets. Used for filtering out the unnecesaary characters which are not in use.
            chethanLHS.add(sc.nextLine().strip().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));
        }

        System.out.println(chethanLHS.remove(3));

        Iterator it = chethanLHS.iterator();

        while(it.hasNext()){

            System.out.println(it.next());

        }

        for(String lem : chethanLHS){
            System.out.println(lem);

        }
            
    }
}