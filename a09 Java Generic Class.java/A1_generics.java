
// To use generics in a java class
// you have to define a "Type Parameter"
// after the class name


public class A1_generics {
  public static void main(String[] args) {
    
    // Generic <Integer> generic1 = new Generic <> ();
    // generic1.var1 = 21;
    // generic1.print();

    // Generic <Double> generic2 = new Generic <> ();
    // generic2.var1 = 22.02;
    // generic2.print();

    // Generic <String> generic3 = new Generic <> ();
    // generic3.var1 = "Rahim Mia";
    // generic3.print();

    Generic generic = new Generic();

    generic.var1 = 22;
    generic.print();

    generic.var1 = 23.03;
    generic.print();

    generic.var1 = "Rahim";
    generic.print();
  }
}


class Generic <T> {
  T var1;

  void print () {
    System.out.println(var1);
  }
}