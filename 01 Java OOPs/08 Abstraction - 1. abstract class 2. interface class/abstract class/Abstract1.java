package packages.abstract_package;

public class Abstract1 {
  public static void main (String[] args) {
    
    System.out.println("In Main method.");
    Horse horse = new Horse();
    horse.eat();
    horse.walk();

    Chicken chicken = new Chicken();
    chicken.eat();
    chicken.walk();

    chicken.string1 = "AA";
    System.out.println(chicken.string1);
    System.out.println(chicken.string2);
  }
}

abstract class Animal {
  abstract void walk ();
  public void eat () {System.out.println("\nAnimal eat.");}
  Animal () {System.out.println("Constructor - Animal.");}
  
  String string1 = "my new string";
  final String string2 = "my new string";
}

class Horse extends Animal {
  void walk () {System.out.println("Horse walks on 4 legs.\n\n");}
  Horse () {System.out.println("\nConstructor - Horse.");}
}

class Chicken extends Animal {
  void walk () {System.out.println("Chicken walks on 2 legs.");}
  Chicken () {System.out.println("\nConstructor - Chicken");}
}