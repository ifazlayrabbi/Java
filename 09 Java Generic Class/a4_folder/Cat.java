package a4_folder;

public class Cat extends Animal {
  public String name;

  public Cat () {};
  
  public Cat (String name){
    this.name = name;
  };

  public void eat () {
    System.out.println("Cat eats milk.");
  }
}
