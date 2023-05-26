package a3_folder;

public class A0_main {
  public static void main(String[] args) {
    
    Printer <Integer> printer1 = new Printer <> ();
    printer1.var1 = 21;
    printer1.print();

    Printer <Double> printer2 = new Printer <> ();
    printer2.var1 = 22.02;
    printer2.print();

    Printer <String> printer3 = new Printer <> ();
    printer3.var1 = "Rahim Mia";
    printer3.print();

    

    

    System.out.println("\n");
    Printer printer = new Printer();

    printer.var1 = 22;
    printer.print();

    printer.var1 = 23.03;
    printer.print();

    printer.var1 = "Rahim";
    printer.print();
  }
}


class Printer <T> {
  T var1;

  void print () {
    System.out.println(var1);
  }
}