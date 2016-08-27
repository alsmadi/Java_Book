package chapter17;

import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class TestDataStream {
  public static void main(String[] args) throws IOException {
    try ( // Create an output stream for file temp.dat
      DataOutputStream output =
        new DataOutputStream(new FileOutputStream("temp.dat"));
    ) {
      // Write student test scores to the file
      output.writeUTF("John");
      output.writeDouble(85.5);
      output.writeUTF("Jim");
      output.writeDouble(185.5);
      output.writeUTF("George");
      output.writeDouble(105.25);
    }
     byte[] response = "Test".getBytes();
    // String path=TestDataStream.class.getResource("us.gif").toString();
     File image= new File("us.gif");
     InputStream in=new FileInputStream(image);
  DataInputStream dIn=new DataInputStream(in);
    try ( // Create an input stream for file temp.dat
      DataInputStream input =
        new DataInputStream(new FileInputStream("temp.dat"));
             Socket socket = new Socket("localhost", 9701);
           
    
            ByteArrayInputStream baos=new ByteArrayInputStream(response);
  DataInputStream dos=new DataInputStream(baos);

        DataInputStream input1 = new DataInputStream(socket.getInputStream());

        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

    ) {
      // Read student test scores from the file
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
      System.out.println(input.readUTF() + " " + input.readDouble());
    }
  }
}
