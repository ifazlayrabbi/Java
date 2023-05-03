// if button == 1 => Good, button == 2 => Okay, button ==3 => Bad

package packages.a5_switch;
import java.util.Scanner;

public class A5_switch {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a button: 1, 2, or 3: ");
    int button = scan.nextInt();

    switch(button){
      case 1: System.out.println("Good"); break;
      case 2: System.out.println("Okay"); break;
      case 3: System.out.println("Bad"); break;
      default: System.out.println("Error!");
    }
  }
}