// find greater number among three

package packages.a2_greater;
import java.util.Scanner;

public class A2_greater {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 3 numbers: ");
    double num1 = scan.nextFloat();
    double num2 = scan.nextFloat();
    double num3 = scan.nextFloat();

    double great;
    
    if(num1 > num2)
      if(num1 > num3)
        great = num1;
      else
        great = num3;
    else
      if(num2 > num3)
        great = num2;
      else
        great = num3;
    
    System.out.println("Greater number is: " + great);
  }
}