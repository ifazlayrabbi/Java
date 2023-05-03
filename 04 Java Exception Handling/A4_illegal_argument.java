package packages;
import java.util.Scanner;



public class A4_illegal_argument {

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("\nEnter your age: ");
    int age = scan.nextInt();
    // printAge(age);     // can't call non-static method from within a static method.
    A4_illegal_argument obj = new A4_illegal_argument();
    
    obj.printAge(age);
    System.out.println("Executed till the end.\n");
  }





  private void printAge (int age) {
    if ((age < 0) || (age >= 125)) {
      try {
        // creating custom exception / or modifying existing exception
        throw new IllegalArgumentException("Age must be greater than 0 and less then 200.");
        // throw new IllegalArgumentException();
      }
      catch (IllegalArgumentException err) {
        // System.out.println("IllegalArgumentException occured. \nAge must be greater than 0 and less then 200.");
        System.out.println(err);
        // System.out.println(err.getMessage());
        // err.printStackTrace();
      }
    }
    else {
      System.out.println("Your Age = " + age);
    }
  }

}

