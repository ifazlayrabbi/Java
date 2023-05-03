package packages;



public class A2_arithmatic {
  public static void main (String[] args) {
    int num1 = 5, num2 = 0;
   
    try {
      int result = num1 / num2;
      System.out.println(result);
    } 
    catch (ArithmeticException e) {
      System.out.println("\nArithmeticException occured!");
    }
    catch (Exception err) {
      System.out.println(err);
    }

    System.out.println("Executed rest of the code.\n");
  
  }
}