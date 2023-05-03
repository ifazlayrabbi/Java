package packages;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class CollectionsClass {
  public static void main (String[] args) {
    ArrayList <Integer> list = new ArrayList <> ();

    list.add(54);
    list.add(44);
    list.add(24);
    list.add(64);
    list.add(24);
    list.add(24);
    list.add(74);
    list.add(14);

    System.out.println(list);
    System.out.println("Minimum element: " + Collections.min(list));
    System.out.println("Maximum element: " + Collections.max(list));
    System.out.println("Frequency of 24: " + Collections.frequency(list, 24));
    
    // Collections.sort(list);
    Collections.sort(list, Comparator.reverseOrder());
    System.out.println(list);


  }
}