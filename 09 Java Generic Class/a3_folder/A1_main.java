package a3_folder;

public class A1_main <T> {
  public static void main(String[] args) {
    A1_main printer = new A1_main ();

    printer.var1 = 22;
    printer.print();

    printer.var1 = 23.03;
    printer.print();

    printer.var1 = "Rahim";
    printer.print();
  }



  public T var1;

  public void print () {
    System.out.println(var1);
  }
}
