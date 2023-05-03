// if button == 1 => Good, button == 2 => Okay, button ==3 => Bad

package packages.a4_button;
import java.util.Scanner;

public class A4_button {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a button: 1, 2, or 3: ");
    int button = scan.nextInt();

    if (button == 1)
      System.out.println("Good");
    else if (button == 2)
      System.out.println("Okay");
    else if (button == 3)
      System.out.println("Bad");
    else
      System.out.println("Error!");
  }
}