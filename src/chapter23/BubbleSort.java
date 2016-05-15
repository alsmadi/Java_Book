package chapter23;

public class BubbleSort {
  /** Bubble sort method */
  public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    int counter=0;
     System.out.println("Original list");
      for(int m=0; m<list.length;m++){
          System.out.print(list[m]+"  ");
        }
       System.out.println();
    int swapscounter=0;
    for (int k = 1; k < list.length && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
           System.out.println("Current list"  + "swap number...." + swapscounter);
           counter++;
           for(int m=0; m<list.length;m++){
          System.out.print(list[m]+ "   ");
        }
       System.out.println();
          needNextPass = true; // Next pass still needed
          swapscounter++;
        }
        
      }
      System.out.println("The total number of cycles==" +counter );
    }
    
  }

  /** A test method */
  public static void main(String[] args) {
    int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    bubbleSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}
