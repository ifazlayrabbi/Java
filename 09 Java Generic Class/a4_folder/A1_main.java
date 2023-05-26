package a4_folder;

import java.util.ArrayList;

public class A1_main <T> {
  public static void main(String[] args) {
    A1_main printer = new A1_main ();

    printer.var1 = 22;
    printer.print();

    ArrayList <Cat> cats = new ArrayList <> ();

  }



  public T var1;

  public void print () {
    System.out.println(var1);
  }
}
