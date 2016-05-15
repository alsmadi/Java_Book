
import static chapter18.ComputeFactorial.factorial;
import java.util.Scanner;


public class Factorial1{
static long factorial (long n) {
    if (n == 1) {
        return 1;
    } else {
        return n*factorial(n-1);
    }
}

 public static void main(String[] args) {
 
       long n, c, fact = 1;
       
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
      
      long output=factorial(n);
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c = 1 ; c <= n ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+n+" is = "+fact);
          System.out.println("Factorial of "+n+" is = "+output);
      }
   
 }
 }