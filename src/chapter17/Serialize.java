/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;
import java.io.*;

/**
 *
 * @author IAlsmadi
 */
public class Serialize {
   
    // Serialize an object into binary format inside a file
// stored in the location of the second parameter
private static void saveObject(Serializable object, String filename)
            throws IOException 
{
	 ObjectOutputStream objstream = new ObjectOutputStream(
                new FileOutputStream(filename));
       
// The writeObject() method automatically transforms the contents of
       // the object to bytes. 
       // An error is generated if the object does not implement the Serialize interface
	objstream.writeObject(object);
       
	objstream.close();
}

// Deserializes the object stored in the provied path and returns this
// object without any casting it to a specific type 
private static Object loadObject(String filename)
            throws ClassNotFoundException, IOException 
{
       // Open the file for reading
	ObjectInputStream objstream = new ObjectInputStream(
                new FileInputStream(filename));
       
       // Read the bytes and creates the object in memory
Object object = objstream.readObject();

       // Close the file
	objstream.close();

       // Returns the object without casting
       return object;
}

}
