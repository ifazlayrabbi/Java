package packages;



public class A0_exception {
  public static void main (String[] args) {
    
    int num1 = 5, num2 = 0;
    int array1 [] = {1, 2, 3};
    
    int array2 [] = new int [5];
    array2 [4] = 12;

    String array3 [] = new String [5];
    array3 [2] = "Fazlay Rabbi";
    System.out.println(array3 [2]);

    // Protection from unexpected interruption

    try {
      // int result = num1 / num2;
      int result = array1 [4] / 2;
      System.out.println(result);
    } 
    catch (ArithmeticException e) {
      System.out.println("\nArithmeticException occured!");
    }
    catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("\nArrayIndexOutOfBoundsException occured!");
    }
    catch (Exception err) {
      System.out.println(err);
    }

    System.out.println("Executed rest of the code.\n");

  }
}