package a01_all;
import a04_search.A2_BinarySearch;

import java.util.Scanner;



public class Myfile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    A2_BinarySearch binSearch = new A2_BinarySearch();

    int n = 20;
    int arr [] = new int [n];
    for (int i=0; i<n; i++) arr[i] = i;
    
    int start = 0;
    int end = n-1;
    
    System.out.print("Enter the number you want to find: ");
    int find = scan.nextInt();

    binSearch.binarySearch(arr, start, end, find);
  }
}
