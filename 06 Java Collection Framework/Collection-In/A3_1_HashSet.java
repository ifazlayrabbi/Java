package packages;
import java.util.HashSet;
import java.util.Iterator;

public class A3_1_HashSet {
  public static void main (String[] args) {
    HashSet <String> set = new HashSet <> ();
    // HashSet doesn't contain duplicate values.
    // HashSet stores values randomly.
    
    set.add("Rahim");
    set.add("Karim");
    set.add("Rahim");
    set.add("Sumaiya");
    set.add("Rukaiya");
    set.add("Koolsoom");
    set.add("Rukaiya");
    set.add("Fatima");
    // System.out.println(set);

    // set can't implement for loop
    Iterator <String> itr = set.iterator();
    while (itr.hasNext()){
      System.out.println(itr.next());
    }

    System.out.println("\n");
    set.remove("Fatima");

    Iterator <String> itr2 = set.iterator();
    while (itr2.hasNext()){
      System.out.println(itr2.next());
    }


    if(set.contains("Fatima"))
      System.out.println("Fatima found.");
    else
      System.out.println("Fatima not found.");
    
    System.out.println("Set size = " + set.size());
    System.out.println(set.isEmpty());
    set.clear();
    System.out.println(set.isEmpty());

  }
}