package chapter5;
import chapter6.Increment;

public class FutureTuition {
  public static void main(String[] args) { 
    double tuition = 10000;   // Year 1
    int year = 1;
    while (tuition < 20000) {
      tuition = tuition * 1.07;
      year++;
    }
  Increment c1 = new Increment();
    c1.test1();
    System.out.println("Tuition will be doubled in " 
      + year + " years");
  }
}
