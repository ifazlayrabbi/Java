package a02_collection_framework;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueue1 {
  public static void main (String[] args) {
    PriorityQueue <Integer> queue = new PriorityQueue <> ();

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.peek());


  }
}



// public class PriorityQueue1 {
//   public static void main (String[] args) {
//     PriorityQueue <Integer> queue = new PriorityQueue <> (Comparator.reverseOrder());

//     queue.offer(1);
//     queue.offer(2);
//     queue.offer(3);
//     queue.offer(4);
//     queue.offer(5);

//     System.out.println(queue);
//     System.out.println(queue.peek());
//     System.out.println(queue.poll());
//     System.out.println(queue.peek());


//   }
// }