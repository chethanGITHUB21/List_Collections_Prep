import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Serializing{

    public static void main(String[] args){

        // User Input from the class and create the object for serialization
        userInput object = new userInput(23, "chethan",  "Medavakkam");

        // Automation File creation which create the file of extension .ser 
        String filename = "chethan.ser";

        try {
            // create the fileWriter
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();            
            System.out.println("The Data is been Serialized Successfully running...."); 
            
        }catch (NotSerializableException ex){
            System.out.println("Serialization is not been implemented");
        } catch (IOException ex) {
            System.out.println("IOException has been occured");
            ex.printStackTrace();
        } 
    }
}

    
