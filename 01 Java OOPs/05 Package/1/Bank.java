package packages.bank;

public class Bank {
    
  public int a = 1;
  protected int b = 2;
  int c = 3;
  private int d = 4;
  
  public void printValues () {
    System.out.println(a + ", " + b + ", " + c + ", " + d);
  }



  public static void main (String[] args) {
    Account_name acc_name = new Account_name();
    acc_name.name = "Rahim";
    acc_name.print_account_name();
  }

}



class Account_name {
  String name;
  void print_account_name () {
    System.out.println("Account Name: " + name);
  }
}

class Account_age {
  public int age = 23;
  void print_account_age () {
    System.out.println("Account Age: " + age);
  }
}