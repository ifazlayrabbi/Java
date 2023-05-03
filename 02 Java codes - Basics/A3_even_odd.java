// even odd

package packages.a3_even_odd;
import java.util.Scanner;

public class A3_even_odd {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    double num = scan.nextFloat();

    if (num % 2 == 0)
      System.out.printf("%.2f is an even number.\n", num);
    else
      System.out.printf("%.2f is an odd number.\n", num);

  }
}