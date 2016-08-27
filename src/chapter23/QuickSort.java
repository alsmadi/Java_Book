package chapter23;

public class QuickSort {
    static int counter=0;
  public static void quickSort(int[] list) {
      
    quickSort(list, 0, list.length - 1);
   // int counter=0;
  }
   int counter0;
  private static void quickSort(int[] list, int first, int last) {
      counter++;
    if (last > first) {
      counter++;
      System.out.println("list at counter..." + counter);
      for(int m=0; m<list.length;m++){
          System.out.print(list[m]+"  ");
        }
       System.out.println();
      int pivotIndex = partition(list, first, last);
      quickSort(list, first, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, last);
    }
  //  counter++;
      System.out.println("list at counter..." + counter);
      for(int m=0; m<list.length;m++){
          System.out.print(list[m]+"  ");
        }
       System.out.println();
  }

  /** Partition the array list[first..last] */
  private static int partition(int[] list, int first, int last) {
    int pivot = list[first]; // Choose the first element as the pivot
    int low = first + 1; // Index for forward search
    int high = last; // Index for backward search

    while (high > low) {
      // Search forward from left
      while (low <= high && list[low] <= pivot)
        low++;

      // Search backward from right
      while (low <= high && list[high] > pivot)
        high--;

      // Swap two elements in the list
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }

    while (high > first && list[high] >= pivot)
      high--;

    // Swap pivot with list[high]
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    }
    else {
      return first;
    }
  }

  /** A test method */
  public static void main(String[] args) {
   // int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    quickSort(list);
    System.out.println("The total number of counts...."+ counter);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}
