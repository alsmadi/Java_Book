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
public class Student implements Serializable{
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Student(String name1, String street1, String city1, String state1, String zip1 ){
        this.city=city1;
        this.name=name1;
        this.state=state1;
        this.zip=zip1;
        this.street=street1;
    }
    
    public String getName(){
        return this.name;
    }
     public String getStreet(){
        return this.street;
    }
      public String getCity(){
        return this.city;
    }
       public String getState(){
        return this.state;
    }
        public String getZip(){
        return this.zip;
    }
    
}
