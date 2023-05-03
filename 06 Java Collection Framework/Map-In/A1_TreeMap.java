package packages;
import java.util.TreeMap;

public class A1_TreeMap {
  public static void main (String[] args) {
    TreeMap <String, Integer> map = new TreeMap <> ();
    // key-value pair
    // TreeMap = ascending order list


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

    map.remove("three");
    System.out.println(map);





    // for (TreeMap.Entry <String, Integer> element: map.entrySet()) {
    //   System.out.println(element);
    //   // System.out.println(element.getKey());
    //   // System.out.println(element.getValue());
    // }

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

