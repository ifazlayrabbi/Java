package a1_normal_folder;
import a3_folder.*;

public class A0_main {
  public static void main(String[] args) {
    A1_integer_printer integer_p = new A1_integer_printer();
    integer_p.var1 = 23;
    integer_p.print();

    A2_double_printer double_p = new A2_double_printer();
    double_p.var1 = 24.04;
    double_p.print();

    A3_string_printer string_p = new A3_string_printer();
    string_p.var1 = "Rahim";
    string_p.print();



    A1_main generic = new A1_main ();
    generic.var1 = "Karim";
    generic.print();

  }
}
