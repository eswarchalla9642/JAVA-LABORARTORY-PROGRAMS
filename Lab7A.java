import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 class DemoofSerialization implements java.io.Serializable {
	 public int a;
	    public String b;
	  
	    // Default constructor
	    public DemoofSerialization(int a, String b)
	    {
	        this.a = a;
	        this.b = b;
	    }
	}
public class Lab7A {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DemoofSerialization object = new DemoofSerialization(1, "Eswar");
	        String filename = "C:\\Users\\srini\\Desktop\\a.txt";
	           // Serialization 
	        try
	        {   
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	              
	            // Method for serialization of object
	            out.writeObject(object);
	              
	            out.close();
	            file.close();
	              
	            System.out.println("Object has been serialized");
	  
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	  
	  
	        DemoofSerialization object1 = null;
	  
	        // Deserialization
	        try
	        {   
	            // Reading the object from a file
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	              
	            // Method for deserialization of object
	            object1 = (DemoofSerialization)in.readObject();
	              
	            in.close();
	            file.close();
	              
	            System.out.println("Object has been deserialized ");
	            System.out.println("a = " + object1.a);
	            System.out.println("b = " + object1.b);
	        }
	          
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	          
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	            }
	        }
}

