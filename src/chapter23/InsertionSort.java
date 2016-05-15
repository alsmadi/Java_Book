package chapter23;

import static chapter23.BubbleSort.bubbleSort;

public class InsertionSort {
    
    public static void main(String[] args) {
    double[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    insertionSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.println(list[i] + " ");
  }
  /** The method for sorting the numbers */
  public static void insertionSort(double[] list) {
       System.out.println("Original list");
      for(int m=0; m<list.length;m++){
          System.out.print(list[m]);
        }
       System.out.println();
    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
           list[0..i] is sorted. */
      double currentElement = list[i]; // save temp value of array element
      //compare currentElement with all  
      int k;
      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
        list[k + 1] = list[k]; // swap 
        for(int m=0; m<list.length;m++){
          System.out.print(list[m]+"  ");
        }
        System.out.println();
        //System.out.print("index ..." + k +"... value is" + list[k + 1] +"  ");
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    //  System.out.print("cycle ..." + k +"... value is" + list[k + 1] +"  ");
    }
  }
}
