package a2_generic_folder;

public class A0_main {
  public static void main(String[] args) {
    Printer <Integer> i_printer = new Printer <> ();
    i_printer.var1 = 25;
    i_printer.print();

    Printer <Double> d_printer = new Printer <> ();
    d_printer.var1 = 26.06;
    d_printer.print();

    Printer <String> s_printer = new Printer <> ();
    s_printer.var1 = "Rahim";
    s_printer.print();



    System.out.println("\n");
    Printer printer = new Printer ();
    
    printer.var1 = 27;
    printer.print();

    printer.var1 = 27.07;
    printer.print();

    printer.var1 = "Karim";
    printer.print();
  }
}
