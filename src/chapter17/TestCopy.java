/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {


    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
       // long startTime = System.nanoTime();
        long startTime = System.currentTimeMillis();
 
        try 
        {
            //Open the input and out files for the streams
            fileInputStream = new FileInputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image\\china.gif");
            fileOutputStream = new FileOutputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image\\test_copy_us.gif");
            int data;

            //Read each byte and write it to the output file
            //value of -1 means end of file
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
            
        }
        catch (IOException e)
        {
            //Display or throw the error
            System.out.println("Eorr while execting the program: " + e.getMessage());
        }    
         finally 
        {
            //Close the resources correctly
            if (fileInputStream != null)
            {
                fileInputStream.close();
            }
            if (fileInputStream != null)
            {
                fileOutputStream.close();
            }
        }
    //    long endTime = System.nanoTime();

//long duration = (endTime - startTime); 
//System.out.println("total time==...." + duration);
        long endTime = System.currentTimeMillis();

System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }

}
