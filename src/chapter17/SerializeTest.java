/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest {

     /**
      * @param args
      */
     public static void main(String[] args) {
          // TODO Auto-generated method stub
          TestObject o1 = new TestObject(1);
          TestObject o2 = new TestObject(2);
          TestObject o3 = new TestObject(3);
     
          try {
               ObjectOutputStream oout = new ObjectOutputStream(
                         new FileOutputStream("output.bin"));
               
               oout.writeObject(o1);
               oout.writeObject(o2);
               oout.writeObject(o3);
               oout.flush();
               oout.close();
               
               ObjectInputStream oin = new ObjectInputStream(
                         new FileInputStream("output.bin"));
               
               Object ob1 = oin.readObject();
               Object ob2 = oin.readObject();
               Object ob3 = oin.readObject();
               
               System.out.println(o1);
               System.out.println(o2);
               System.out.println(o3);
               
          } catch (Exception exc){ 
               exc.printStackTrace();
          }
     }
}
