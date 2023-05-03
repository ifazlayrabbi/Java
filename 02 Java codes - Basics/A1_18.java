// find if the user is adult or not

package packages.a1_18;
import java.util.Scanner;

public class A1_18 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = scan.nextInt();

    if (age >= 18)
      System.out.println("Adult.");
    else
      System.out.println("Not Adult.");

  }
}
