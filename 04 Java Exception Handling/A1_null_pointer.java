package packages;



public class A1_null_pointer {

  private static void printLength (String myString) {    
    try {
      System.out.println("String Length = " + myString.length());
    }
    catch (NullPointerException err) {
      System.out.println("\nNullPointerException occured!");
    }
    catch (Exception err) {
      System.out.println(err);
    }
  }
  


  public static void main (String[] args) {
    String myString = null;
    printLength (myString);
    System.out.println("Executed till the end without any error.\n");
  }

}