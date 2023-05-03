package packages;
import java.util.Scanner;



public class A6_custom_exception {

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter circle radius: ");
    int radius = scan.nextInt();
    
    try {
      circle_area(radius);
    }
    catch (NegativeRadiusException err){
      System.out.println(err);
    }
    System.out.println("Executed till the end.\n");
  }



  private static void circle_area (int r) throws NegativeRadiusException {
    if (r<0) {
      throw new NegativeRadiusException("Radius can't be negative.");
      // throw new NegativeRadiusException();
    }
    double circle_area = 3.1416 * r * r;
    System.out.printf("\nCircle Area: %.2f\n", circle_area);
  }

}





class NegativeRadiusException extends Exception {
  String msg;

  public String toString() {
    return "packages.NegativeRadiusException" + getMessage();
  }
  public String getMessage() {
    return msg;
  }
  NegativeRadiusException(){
    this.msg = "";
  }
  NegativeRadiusException(String msg){
    this.msg = ": " + msg;
  }
}








// public class A6_custom_exception {

//   public static void main (String[] args) {
//     Scanner scan = new Scanner(System.in);
//     System.out.print("Enter circle radius: ");
//     int radius = scan.nextInt();
    
//     circle_area(radius);
//     System.out.println("Executed till the end.\n");
//   }



//   private static void circle_area (int r) {
//     if (r<0) {
//       try {
//         throw new NegativeRadiusException("Radius can't be negative.");
//         // throw new NegativeRadiusException();
//       } 
//       catch (NegativeRadiusException err){
//         System.out.println(err);
//       }
//     }
//     else {
//       double circle_area = 3.1416 * r * r;
//       System.out.printf("\nCircle Area: %.2f\n", circle_area);
//     }
//   }

// }