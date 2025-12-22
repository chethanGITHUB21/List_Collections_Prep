import java.util.HashSet;

public class Set_Prac{

    public static void main(String[] args){

        // Using HashSet for number and string both data types 
        HashSet<Integer> SetNum = new HashSet<>();
        // Using add() operation to insert element
        SetNum.add(654);
        SetNum.add(32);
        SetNum.add(43);
        SetNum.add(321);


        // step1: User enter the element in hashSet 
        String h = "Apple";
        Integer ih = 23;
        // step2: the entered element will convert into hashcode like appl.hashCode() = 63476538 and for int.hashCode() the same output will be printed
        int hashCode = h.hashCode();
        int intHash = ih.hashCode();

        // printing hashcode to check the hash number of entered element
        System.out.println(hashCode);
        System.out.println(intHash);

        // SPREAD Operation: h ^ (h >>> table.size())
        int xor = hashCode ^ (hashCode >>> 16);
        System.out.println(xor);

        int intXor = intHash ^ (intHash >>> 16);
        System.out.println(intXor);

        // MASKING Operation: index = (table.size() -1 ) & spread HashCode
        int index = (16 -1) >>> xor;
        int intIndex = (16 -1) >>> intXor;

        System.out.println(index);
        System.out.println(intIndex);

        // Check whether the two element are having same index (Collision) 
        // if yes then check the value of element using equal() method to compare two non-primitive values 
        // if two primitive values are equal then hashmap wont accept the value inside the index which is also called as null
        // =============================================================================================================================================
        // if the collision occurs which different value then following step takes place:
        //  METHOD 1: in single index all the element are stored as a linked list upto specific thresHold (index.size() > 8 and table.size() >64)
        //  METHOD 2: this method are used when table and index size reach to the threshold. Then the element started to get store in the RED-BLACK Tree 
        // =============================================================================================================================================
        // if(index == intIndex){
        //     String StrInt= ih.toString();

        //     if(h.equals(StrInt)){

        //         Boolean equal = hashCode == intHash;
        //             System.out.println(equal);

        //     }

        // }
    }      
    
}
