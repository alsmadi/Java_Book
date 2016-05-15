/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Recursive4 {

public static void main(String[] args) throws IOException {

    URL url = new URL("http://m.uploadedit.com/ba3a/1423978916244.txt"); 
    ArrayList<Integer> arrList = new ArrayList<Integer>(); 
    int searchValue;
    int low;
    int high;
    int mid;
    int NOT_FOUND = -1;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your number to search for:");
    searchValue = in.nextInt(); 
    System.out.println(searchValue);
    File file = new File("C:\\Users\\ialsmadi\\Desktop\\6617_Java_UNH\\Book_Resources\\book10ebychapters\\book10ebychapters\\src\\book.txt");

    try {

        Scanner scr = new Scanner(file);
    

        ///Scanner scr = new Scanner(url.openStream()); 

        while (scr.hasNextLine()) {
            int i = scr.nextInt();
            arrList.add(i);
        }
        scr.close();
        System.out.println(arrList);


    }

    catch (FileNotFoundException e) {
        e.printStackTrace();
    }




    low = arrList.get(0);                      
    System.out.println(low);
    high = arrList.get(arrList.size() - 1);
    System.out.println(high);
    mid = (low + high) / 2;

    while (low <= high && arrList.get(mid) != searchValue) {
        if (arrList.get(mid) < searchValue) {
            low = mid + 1;
        } else  {
            high = mid - 1;
        }
        mid = (low + high) / 2;
    }
    if (low > high) {
        mid = NOT_FOUND;
    }
    System.out.println(mid);

 }
}