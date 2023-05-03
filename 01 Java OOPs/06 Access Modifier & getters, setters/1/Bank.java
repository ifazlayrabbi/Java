package packages.bank;
import java.util.Random;

// public class Bank {
//   public static void main (String[] args) {
//     Account account1 = new Account();
//     account1.name = "Fazlay Rabbi 1";
//     account1.email = "fazlay.r@gmail.com";
    
//     // account1.password = "sdfsf";
//     account1.setPassword("1234");
//     System.out.println(account1.getPassword());

//   }
// }

// class Account {
//   public String name;
//   protected String email;
//   private String password;

//   // getters & setters    (used for accessing private variables.)
//   String getPassword () {
//     return password;
//   }

//   void setPassword (String password) {
//     this.password = password;
//   }

// }








public class Bank {
  public String name;

  public static void main (String[] args) {
    Account account1 = new Account();
    
    account1.name = "Fazlay Rabbi";
    account1.email = "fazlay.r@gmail.com";
    System.out.println("Account1 Name: " + account1.name);
    System.out.println("Account1 Email: " + account1.email);
    
    // account1.password = "sdfsf";
    System.out.println("Account1 Password: " + account1.getPassword());
  }
}

class Account {

  Random random = new Random();

  public String name;
  protected String email;
  String random_num = "" + random.nextInt(500);
  private String password;



  // getters & setters    (used for accessing private variables.)
  String getPassword () {
    setPassword(random_num);
    return password;
  }

  private void setPassword (String password) {
    this.password = password;
  }

}