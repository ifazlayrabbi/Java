package packages;



public class A1_finally {

  private static int divide () {
    int num1 = 7;
    int num2 = 0;
    
    try {
      int result = num1 / num2;
      return result;
    }
    catch (Exception err) {
      System.out.println(err);
      return -1;
    }
    finally {
      System.out.println("finally - End of function - fn");
    }
  }


  public static void main (String[] args) {
    int result = divide ();
    System.out.println("Divide: " + result);
  }
}