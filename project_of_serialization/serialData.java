import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class serialData {

    public static void printData(demo object){
        System.out.println("This is Transient type of data: "+object.a);
        System.out.println("This is Static typed data: "+object.b);
        System.out.println("This is name of the user: "+object.name);
        System.out.println("This is age of the user: "+object.age);

    }

    public static void main(String[] args){

        demo object = new demo("chethan", 23, 20, 1000);

        String filename = "StaticData.ser";

        try {
            
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("The serialization initiated Succesfully.......");

            printData(object);

            
        } catch (NotSerializableException ex){
            System.out.println("Class has not been Serialized");
        }catch (IOException ex) {
            System.out.println("IOException is occured");
        } 

        demo object1 = null;

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (demo) in.readObject();
            in.close();
            file.close();
            System.out.println("The Deserializing process done successfully");

            object1.b = 3000;
            printData(object1);

        } catch (IOException ex) {
            System.out.println("IOException has been occured");
        } catch (ClassNotFoundException ex){
            System.out.println("Class has not found");
        }
    }
    
}

class demo implements Serializable{

    private static final long serialVersionUID = 1L;
    transient int a;
    static int b;
    String name;
    int age;

    public demo(String name, int age, int a, int b){
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
    }

}
