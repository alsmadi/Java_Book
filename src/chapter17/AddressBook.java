/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

import static chapter17.AddressBook.loadObject;
import java.io.*;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage; 
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.util.*;
/**
 *
 * @author Marcello
 */
public class AddressBook extends Application {
    
    public static void main(String[] args) { Application.launch(args); }
    
    /**
     * Write a program that stores, retrieves, adds, and updates addresses as 
     * shown in Figure 17.20. Use a fixed-length string for storing each attribute 
     * in the address. Use random access file for reading and writing an address. 
     * Assume that the size of name, street, city, state, and zip is 32, 32, 20, 2, 
     * 5 bytes, respectively.
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        Scene scene = new Scene(new BookPane1().getPane(), 400, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Students Records");
        primaryStage.show(); 
        
        //Object object= null;
       // try{
         //   object=loadObject("book.dat");
       // }
       // catch(Exception ex){
            
       // }
        
        
    }
    
     public static Object loadObject(String filename)
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

class BookPane1 {

    private FlowPane pane = new FlowPane();
    private TextField nameField = new TextField();
    private TextField streetField = new TextField();
    private TextField cityField = new TextField();
    private TextField stateField = new TextField();
    private TextField zipField = new TextField();
    private long length;
    
    private int numOfEntries;
    
    TextField[] fields = {nameField, streetField, cityField,
        stateField, zipField};
    
    RandomAccessFile file;
     void serial1() {
    
        DataInputStream input =null;
        try{
            input=new DataInputStream(new FileInputStream("book.dat"));
        
        boolean eof = false;

         

        while(eof == false) {

            char[] value = {'0', '1'};

            int b = input.readUnsignedByte();

            if (b == -1) {

                eof = true;

            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 8; ++i) {

                sb.append(value[b % 2]);

                b /= 2;

            }

            System.out.println(sb.reverse());

        }

          

        input.close();
     }
            catch(Exception ex){
    

}     

   }//end main method

    
    void serial(){
        FileInputStream input=null;
        DataInputStream buff =null;
        try {
      // Create an input stream for the file
      buff = new DataInputStream(new FileInputStream("book.dat"));
     
      // Read values from the file
      char c;
      while ((c = buff.readChar()) != -1)
        System.out.print(String.valueOf(c) + " ");
    }
        catch(Exception ex){
                String test= ex.getMessage();
                }
    
    }
    void serial2(){
        for(int k=0; k<10; k++){
        displayAddress(k);
        try{
            Object object=loadObject("book.dat");
            System.out.println(object);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
                }
    }
     ObjectOutputStream oout = null;
//new ObjectOutputStream(
          //               new FileOutputStream("output.bin"));
    void serializeArray(){
        try{
        oout.writeObject(students);
         oout.flush();
          oout.close();
        }
        catch(Exception ex){
            
        }
    }
     void writeObject(){
       Student st = new Student(this.nameField.getText(), this.streetField.getText(),this.cityField.getText()
       , this.stateField.getText(),this.zipField.getText());
          // TODO Auto-generated method stub
       //   TestObject o1 = new TestObject(1);
       //   TestObject o2 = new TestObject(2);
       //   TestObject o3 = new TestObject(3);
     
         
               try{
                   students.add(st);
             // oout.writeObject(st);
         //     oout.flush();
              clearFields();
                
                numOfEntries++;
              // oout.close();
             
               }
               catch(Exception ex){
                   ex.printStackTrace();
               }
               
           //    oout.writeObject(o2);
             //  oout.writeObject(o3);
            //   oout.flush();
            ///   oout.close();
               
       /*        ObjectInputStream oin = new ObjectInputStream(
                         new FileInputStream("output.bin"));
               
               Object ob1 = oin.readObject();
               Object ob2 = oin.readObject();
               Object ob3 = oin.readObject();
               
               System.out.println(o1);
               System.out.println(o2);
               System.out.println(o3); */
               
     //     } catch (Exception exc){ 
       //        exc.printStackTrace();
         // }
    // }
    }
    void readFObject()
            {
            
            try {
                
                file.seek(0);
               
                displayAddress();
                
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
    void readF2Object()
            {
            try{
           ObjectInputStream oin = new ObjectInputStream(
                         new FileInputStream("book.dat"));
               
               Object ob1 = oin.readObject();
            //   Object ob2 = oin.readObject();
             //  Object ob3 = oin.readObject();
               Student st = (Student)ob1;
               System.out.println(st.getName()+".."+st.getStreet()+".."+st.getCity()+
                       ".."+st.getState()+".."+st.getZip());
            }
            catch(Exception ex){
               ex.printStackTrace(); 
            }
        }
    void readF3Object()
            {
            try{
           ObjectInputStream oin = new ObjectInputStream(
                         new FileInputStream("book.dat"));
               
               ArrayList<Student> ob1 = (ArrayList<Student>)oin.readObject();
               
               for(int k=0; k< ob1.size();k++){
            //   Object ob2 = oin.readObject();
             //  Object ob3 = oin.readObject();
               Student st = ob1.get(k);
               System.out.println(st.getName()+".."+st.getStreet()+".."+st.getCity()+
                       ".."+st.getState()+".."+st.getZip());
            }
            }
            catch(Exception ex){
               ex.printStackTrace(); 
            }
        }
    void addObject(){
        
            
            try {
                
                long pos = file.length();
                
                long start = pos;

                file.seek(pos);
                file.writeUTF(nameField.getText());

                file.seek(pos + 32);
                file.writeUTF(streetField.getText());

                file.seek(pos + 64);
                file.writeUTF(cityField.getText());

                file.seek(pos + 84);
                file.writeUTF(stateField.getText());

                file.seek(pos + 88);
                file.writeUTF(zipField.getText());
                
                file.seek(start);
                System.out.println(file.readLine());

                file.seek(pos + 95);
                
                clearFields();
                
                numOfEntries++;
                
                System.out.println("Position is at " + file.getFilePointer());
                
                //System.out.println("length = " + file.length());
                
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
   
        
    }
    ArrayList<Student> students;
    public BookPane1() throws IOException {
        students = new ArrayList<Student>();
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(8);
        
        nameField.setMinWidth(310);
        streetField.setMinWidth(310);
        cityField.setMaxWidth(140);
        stateField.setMaxWidth(40);
        zipField.setMaxWidth(70);
        pane.getChildren().addAll(new Label("Name "), nameField,
                new Label("Street"), streetField, new Label("City   "),
                cityField, new Label("State"), stateField, new Label("Zip"),
                zipField);
        Button add = new Button("Add");
        Button first = new Button("First");
        Button next = new Button("Next");
        Button previous = new Button("Previous");
        Button last = new Button("Last");
        Button update = new Button("Update");
        Button DeSerialize = new Button("DeSerialize");
         Button Serialize = new Button("Serialize");

        pane.getChildren().addAll(add, first, next, previous, last, update,DeSerialize, Serialize);
        
        
        file = new RandomAccessFile("book.dat", "rw");
        length = file.length();
        
         try{
        oout = new ObjectOutputStream(
                         new FileOutputStream("book.dat"));}
        catch(Exception ex){
            
        }
        //  erases everything in the address book...
        //file.setLength(0);
        
        
        //  add entry to address book...
  //      Serialize.setOnAction(e -> serial2() );
        
      //  add.setOnAction(e -> addObject());
      //   try {
        //       ObjectOutputStream oout = new ObjectOutputStream(
          //               new FileOutputStream("output.bin"));

          add.setOnAction(e -> writeObject());
        Serialize.setOnAction( e -> serializeArray());
        DeSerialize.setOnAction( e -> readF3Object());
        first.setOnAction(e -> readF2Object());
        
        next.setOnAction(e -> {
//            try{
//                file.seek( file.getFilePointer() - 1);
//            } catch(IOException ex) {
//                
//            }
                
                displayAddress();
            
        });
        
        previous.setOnAction(e -> {
 
            try {
                long pos = file.getFilePointer();
                
                if(pos == 0)
                    file.seek(0);
                else
                    file.seek( (pos - 95) - 95);
                
                displayAddress();
                
            } catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        });
        
        last.setOnAction(e -> {
        
            try {
                file.seek(file.length() - 95);
                displayAddress();
            } catch(IOException ex) {
            
            }
        });
        
        update.setOnAction(e -> {
            try{
                
                long pos = file.getFilePointer() - 95;
                file.seek(pos);
                
                file.writeUTF(nameField.getText());

                file.seek(pos + 32);
                file.writeUTF(streetField.getText());

                file.seek(pos + 64);
                file.writeUTF(cityField.getText());

                file.seek(pos + 84);
                file.writeUTF(stateField.getText());

                file.seek(pos + 88);
                file.writeUTF(zipField.getText());

                file.seek(pos + 95);
                
            } catch(IOException ex) {
            
            }
        });
    }
    
    void displayAddress() {
        
        try {
            long pos = file.getFilePointer();
            long start = pos;
            //System.out.println("Position is " + file.getFilePointer());
            
            nameField.setText("" + file.readUTF());
            file.seek(pos += 32);
            //System.out.println("Position is " + file.getFilePointer());
            streetField.setText("" + file.readUTF());
            file.seek(pos += 32);
            //System.out.println("Position is " + file.getFilePointer());
            cityField.setText("" + file.readUTF());
            file.seek(pos += 20);
            //System.out.println("Position is " + file.getFilePointer());
            stateField.setText("" + file.readUTF());
            file.seek(pos += 4);
            //System.out.println("Position is " + file.getFilePointer());
            zipField.setText("" + file.readUTF());
            file.seek(start + 95);
            
            //System.out.println("Position is " + file.getFilePointer());
            
        } catch(IOException ex) {
            System.out.println("Could not display entry");
        }
    
    }
    void displayAddress(long pos) {
        
        try {
            //long pos = file.getFilePointer();
            long start = pos;
            //System.out.println("Position is " + file.getFilePointer());
            
           System.out.println("" + file.readUTF());
            file.seek(pos += 32);
            //System.out.println("Position is " + file.getFilePointer());
           System.out.println("" + file.readUTF());
            file.seek(pos += 32);
            //System.out.println("Position is " + file.getFilePointer());
           System.out.println("" + file.readUTF());
            file.seek(pos += 20);
            //System.out.println("Position is " + file.getFilePointer());
         System.out.println("" + file.readUTF());
            file.seek(pos += 4);
            //System.out.println("Position is " + file.getFilePointer());
          System.out.println("" + file.readUTF());
            file.seek(start + 95);
            
            //System.out.println("Position is " + file.getFilePointer());
            
        } catch(IOException ex) {
            System.out.println("Could not display entry");
        }
    
    }
    
    void clearFields() {
        for(TextField tf : fields)
            tf.setText("");
    }
    
    public FlowPane getPane() {
        return pane;
    }
}
