package a04_search;
import java.util.Scanner;

public class A2_BinarySearch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    A2_BinarySearch bSearch = new A2_BinarySearch();

    int n = 20;
    int arr [] = new int [n];
    for (int i=0; i<n; i++) arr[i] = i;
    
    int start = 0;
    int end = n-1;
    
    System.out.print("Enter the number you want to find: ");
    int find = scan.nextInt();
    
    bSearch.binarySearch(arr, start, end, find);
  }



  public void binarySearch (int arr [], int start, int end, int find) {
    if (start > end) 
      System.out.println("Number not found.");
    else {
      int mid = (start + end) / 2;
      if(arr[mid] == find)
        System.out.printf("%d found at array position %d", find, mid);
      else if (arr[mid] > find) {
        end = mid-1;
        binarySearch(arr, start, end, find);
      }
      else {
        start = mid + 1;
        binarySearch(arr, start, end, find);
      }
    }
  }

}
