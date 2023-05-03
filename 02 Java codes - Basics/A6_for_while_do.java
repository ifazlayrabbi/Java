// print 0 to num

package packages.a6_for_while_do;
import java.util.Scanner;

public class A6_for_while_do {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = scan.nextInt();

    System.out.println("/////////  for  //////////");
    for (int i=0; i<num; i++){
      System.out.println(i);
    }

    System.out.println("/////////  while  //////////");
    int i=0;
    while (i<num){
      System.out.println(i);
      i++;
    }

    System.out.println("/////////  do while  //////////");
    int j=0;
    do {
      System.out.println(j);
      j++;
    } while (j<num);
  }
}