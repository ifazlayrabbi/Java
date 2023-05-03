package packages.customer;
import packages.bank.Bank;

public class Customer {
  public static void main (String[] args) {
    System.out.println("In main function.");



    /////////////  public access  //////////////
    // Bank bank1 = new Bank();
    // bank1.printValues();
    // System.out.println(bank1.a);



    ////////////  protected access  ////////////
    Class1 class1 = new Class1();
    class1.printValues();
    class1.fn();

  }
}

class Class1 extends Bank {
  void fn () {
    System.out.println(a);    // public
    System.out.println(b);    // protected
    // System.out.println(c);    // default
    // System.out.println(d);    // private
  }
}


