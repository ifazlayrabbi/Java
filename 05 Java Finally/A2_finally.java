package packages;



public class A2_finally {
  public static void main (String[] args) {
    int num1 = 10;
    int num2 = 3;

    while(true){
      try {
        System.out.println("try: " + num1/num2);
      }
      catch (Exception err) {
        System.out.println("catch: " + err);
        break;
      }
      finally {
        System.out.println("finally, num2 is " + num2);
      }
      num2--;
    }
  }
}