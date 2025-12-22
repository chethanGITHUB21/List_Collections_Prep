import java.util.Scanner;
// using enum type in java to understand default data handling 
public class EnumType {
    enum Gender{
    MALE,
    FEMALE,
    TRANSGENDER,
    GAY,
    LESBIAN;
}
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Write your gender: ");
        // in this i removed two properties of input data:
        // CASE SENSITIVITY: I removed case sensativity to improve the experience of user who enters the value (he can type in lower as well as in uppercase and the program wont crash).
        // SPACE SENSITIVITY: I removed the Space sensitivity to fix the strictness of valueOf() method which stricty restrict the input value with space which allow the program to crash. I fixed it with using trim() methods which can take the user input value with space without crash.
        Gender gender = Gender.valueOf(sc.nextLine().trim().toUpperCase());

        switch(gender){

            case FEMALE:
                System.out.println("i am female");
                break;
            case TRANSGENDER:
                System.out.println("i am Transgender");
                break;
            case GAY:
                System.out.println("i am gay");
                break;
            case LESBIAN:
                System.out.println("i am lesbian");
                break;
            case MALE:
                System.out.println("i am male"); 
                break;
            default:
                System.out.println("Invalid Input");
                                   
        }

        String name1 = "CHETHAN";
        String name2 = sc.nextLine().toUpperCase();
        Boolean status = name1.equals(name2);

        System.out.println(status);

        // DEMO CODE FOR STRIP() method
        String s = "\u00A0male\u00A0";
        
        // using trim() only remove whitespace, tab and nextline. It is very old method to remove the unused symbols and providing the usefull data.
        System.out.println(s.trim());
        // =========================================================================================================================================================================================================
        // using strip() are more efficient in mordern development because it removes all the unused space, tab, newline, non-breaking space and other related unicode symbol.
        // why because when user enetered the copied file from pdf and website the unicode symbols are hard to deduct in order to remove it and strip() detect that unused symbol and show only usefull information
        // using StripLeading() for removal of whitespace from start and StripTrailing() for removing of whitespace from end of the data.
        System.out.println(s.strip());
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
        // =========================================================================================================================================================================================================

    }
    
}