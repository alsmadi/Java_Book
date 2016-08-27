/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.imageio.ImageIO;

/**
 *
 * @author IAlsmadi
 */
public class ReadImage {
    public static void main(String[] args){
        try {
     BufferedImage image = ImageIO.read(new File("us.gif"));
     ByteArrayOutputStream baos = new ByteArrayOutputStream();
     ImageIO.write(image, "gif", baos);
     String encodedImage = Base64.encode(baos.toByteArray());
     System.out.println(encodedImage);
   } catch (Exception e) {
     e.printStackTrace();
   }

}
}