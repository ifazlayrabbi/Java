// Summation of 1st 10 natural numbers

package packages.a7_sum_10_natural_numbers;
import java.util.Scanner;

public class A7_sum_10_natural_numbers {
  public static void main (String[] args) {

    int i = 0, sum = 0;
    do {
      sum += i;
      i++;
    } while (i<10);

    System.out.println("Sum of 1st 10 natural numbers = " + sum);
  }
}