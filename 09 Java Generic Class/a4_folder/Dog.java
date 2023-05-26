package a4_folder;

public class Dog extends Animal {
  public String name;

  public Dog () {};
  
  public Dog (String name){
    this.name = name;
  };

  public void eat () {
    System.out.println("Cat eats milk.");
  }
}
