import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializing {  


    public static void main(String[] args) {
            userInput object = null;

        try {
            FileInputStream file = new FileInputStream("chethan.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            object = (userInput) in.readObject();
            in.close();
            file.close();
            System.out.println("Deserialized object: " + object.name + ", " + object.address + ", " + object.age);
        } catch (IOException  ex) {
            System.out.println("IOException has been occured ");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException has been occured");
        }
    }
    
}