package a01_all;
import java.util.Scanner;

public class A1_Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long first = 0;
    long second = 1;
    long next = first + second;

    System.out.print("Enter the number of elements you want to print: ");
    int n = scan.nextInt();

    for (int i=0; i<n; i++){
      System.out.print(next + "  ");
      first = second;
      second = next;
      next = first + second;
    }
  }
}
