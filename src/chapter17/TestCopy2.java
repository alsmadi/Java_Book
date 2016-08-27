/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class TestCopy2 {


    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
         long startTime = System.currentTimeMillis();
        try 
        {
                
        //find the file size
        File fileHandle = new File("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image/china.gif");     
      //  /Open the input and out files for the streams
        //    fileInputStream = new FileInputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image/china.gif");
          //  fileOutputStream = new FileOutputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image\\test_copy_us.gif");
        long length = fileHandle.length();

            //Open the input and out files for the streams
            fileInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image/china.gif"));
            fileOutputStream = new FileOutputStream("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book\\build\\classes\\image\\test_copy_us.gif");
            int data;

            //Read data into buffer and then write to the output file
                        byte[] buffer = new byte[1024];                    
            int bytesRead;                                    
            while ((bytesRead = fileInputStream.read(buffer)) != -1)     
            {     
                fileOutputStream.write(buffer, 0, bytesRead);           
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
        
        long endTime = System.currentTimeMillis();

System.out.println("That took " + (endTime - startTime) + " milliseconds");
        
    }

}
