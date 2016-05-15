/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;
import java.io.*;

class TestObject implements Serializable {
     private int foo;
     
     public TestObject(int i) {
          foo = i;
     }
     
     public String toString() {
          return "TestObject::"+foo;
     }
     
     public static final long serialVersionUID = 1l;
}
