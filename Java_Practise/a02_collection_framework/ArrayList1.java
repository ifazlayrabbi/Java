package a02_collection_framework;
import java.util.ArrayList;

public class ArrayList1 {
  public static void main (String[] args) {
    ArrayList <Integer> list = new ArrayList <> ();

    list.add(1);
    list.add(8);
    list.add(3);
    list.add(9);
    list.add(2);

    System.out.println(list);
    System.out.println(list.get(2));
    
    list.set(2, 5);
    System.out.println(list);

    list.remove(2);
    System.out.println(list);

    System.out.println(list.contains(9));

  }
}