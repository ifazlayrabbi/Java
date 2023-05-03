package packages.a8_table_of_numbers;
import java.util.Scanner;

public class A8_table_of_numbers {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.printf("Enter a number: ");
    int n = scan.nextInt();

    int i = 1;
    do {
      System.out.println(n + " * " + i + " = " + n*i);
      i++;
    } while(i<=10);

  }
}
