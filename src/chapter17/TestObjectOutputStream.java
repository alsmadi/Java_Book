package chapter17;

import java.io.*;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException {
    try ( // Create an output stream for file object.dat
      ObjectOutputStream output =
        new ObjectOutputStream(new FileOutputStream("object.dat"));
    ) {
      // Write a string, double value, and object to the file
      output.writeUTF("Izzat");
      output.writeDouble(80.5);
      output.writeObject(new java.util.Date());
    }
  }
}
