package a05_sort;

public class A1_bubbleSort {
  public static void main(String[] args) {
    int arr [] = {23, 2, 64, 21, 6, 74, 3};

    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr.length - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr [j];
          arr [j] = arr [j+1];
          arr [j+1] = temp;
        }
      }
    }

    System.out.println("Sorted array: ");
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
  }
}
