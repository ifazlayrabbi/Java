package a1_Collection_Interface;
import java.util.TreeSet;
import java.util.Iterator;

public class A3_3_TreeSet {
  public static void main (String[] args) {
    TreeSet <String> set = new TreeSet <> ();
    // TreeSet sort values Ascending order

    set.add("Rahim");
    set.add("Karim");
    set.add("Rahim");
    set.add("Sumaiya");
    set.add("Rukaiya");
    set.add("Koolsoom");
    set.add("Rukaiya");
    set.add("Fatima");
    // System.out.println(set);

    // can't implement for loop
    Iterator <String> itr = set.iterator();
    while (itr.hasNext()){
      String str = itr.next();
      System.out.println(str);
    }

    System.out.println("\n");
    set.remove("Fatima");
    
    Iterator <String> itr2 = set.iterator();
    while (itr2.hasNext()){
      String str = itr2.next();
      System.out.println(str);
    }


    if(set.contains("Fatima"))
      System.out.println("Fatima found.");
    else
      System.out.println("Fatima not found.");
    
    System.out.println("Set size = " + set.size());

  }
}
