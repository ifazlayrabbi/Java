package packages;
import java.util.HashMap;

public class A1_HashMap {
  public static void main (String[] args) {
    HashMap <String, Integer> map = new HashMap <> ();
    // key-value pair
    // HashMap = un-ordered list

    map.put("one", 1);
    // map.put("two", 2);
    map.put("three", 3);
    


    // if(!map.containsKey("two"))
    //   map.put("two", 4);

    // System.out.println(map);

    map.putIfAbsent("two", 4);
    System.out.println(map);



    if(map.containsValue(3))
      map.put("four", 4);

    System.out.println(map);





    for (HashMap.Entry <String, Integer> element: map.entrySet()) {
      System.out.println(element);
      // System.out.println(element.getKey());
      // System.out.println(element.getValue());
    }

    // for (String key: map.keySet()) {
    //   System.out.println(key);
    // }

    // for (Integer value: map.values()) {
    //   System.out.println(value);
    // }

    System.out.println(map.isEmpty());
    map.clear();
    System.out.println(map.isEmpty());

  }
}