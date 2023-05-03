package packages;



public class A3_array_index {
  public static void main (String[] args) {
    
    int array1 [] = {1, 2, 3};

    try {
      int result = array1 [4] / 2;
      System.out.println(result);
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