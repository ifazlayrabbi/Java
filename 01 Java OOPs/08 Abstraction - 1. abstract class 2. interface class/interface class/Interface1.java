package packages.interface1;

public class Interface1 {
  public static void main (String[] args) {
    Deer deer = new Deer();
    deer.walk();
    deer.size();
    System.out.println("Deer eyes: " + deer.eyes);
    System.out.println("Deer eat: " + deer.eat);
  }
}

interface Animal {
  void walk ();   // by default public & abstract.
  int eyes = 2;   // by default public, static & final.
}

interface Herbivore {
  void size ();                       // by default public & abstract.
  String eat = "Only eat plants.";    // by default public, static & final.
}

class Deer implements Animal, Herbivore {
  public void walk () { System.out.println("Deer walks on 4 legs."); }
  public void size () { System.out.println("Deer is a Medium sized animal."); }
}
 