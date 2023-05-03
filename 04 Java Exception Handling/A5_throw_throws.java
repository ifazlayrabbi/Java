package packages;



public class A5_throw_throws {

  private void devide (int num1, int num2) throws ArithmeticException {
    int result = num1/num2;
    System.out.println("Divide: " + result );
  }


  public static void main (String[] args) {
    A5_throw_throws obj = new A5_throw_throws();
    try {
      obj.devide(5, 0);
    }
    catch (ArithmeticException err) {
      System.out.println(err);
    }
    System.out.println("Executed till the end.\n");
  }

}