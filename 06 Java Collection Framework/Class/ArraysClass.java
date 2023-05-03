package packages;
import java.util.Arrays;


public class ArraysClass {
  public static void main (String [] args) {

    // binary search
    int numbers [] = {1, 2, 3, 4, 5, 6};
    // binary search works on sorted array.
    int index = Arrays.binarySearch(numbers, 5);
    System.out.println(index);



    // Array sort
    int numbers2 [] = {1, 6, 3, 2, 8, 4, 9};
    Arrays.sort(numbers2);

    for(int i: numbers2) {
      System.out.print(i + "\t");
    }



    // Array fill
    int numbers3 [] = new int[10];

    System.out.println("");
    Arrays.fill(numbers3, 27);

    for (int i: numbers3){
      System.out.print(i + "\t");
    }

  }
}