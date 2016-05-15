package chapter6;

import java.util.Scanner;

public class Hex2Dec {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();

    System.out.println("The decimal value for hex number "
      + hex + " is " + hexToDecimal(hex.toUpperCase()));
  }

  public static int hexToDecimal(String hex) {
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }
    
    Increment c1 = new Increment();
    c1.test1();
    Increment c2 = new Increment();
    c2.test1();
    int k=hexCharToDecimal("345",'r');
    
    test1(9,6);
    return decimalValue;
  }
   static int k;  
   public static void test1(int k, double k1){
       int k2=k+6;
   }
   public static void test1(int k, int k1){
       
   }
   public static void test1(double k, int k1){
       
   }
   public static int hexCharToDecimal(String ch) {
   return 3;
  }
    public static int hexCharToDecimal(String ch, char c) {
   return 3;
  }
  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else // ch is '0', '1', ..., or '9'
      return ch - '0';
  }
}
