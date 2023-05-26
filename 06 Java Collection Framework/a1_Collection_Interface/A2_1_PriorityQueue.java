package a1_Collection_Interface;
import java.util.PriorityQueue;

public class A2_1_PriorityQueue {
  public static void main (String[] args) {
    PriorityQueue <Integer> queue = new PriorityQueue <> ();
    // priority queue is by default -> min heap
    // can be reversed to -> max heap

    for(int i=10; i>0; i--){
      queue.offer(i);
    }
    System.out.println(queue);

    System.out.println(queue.peek());   // top of Queue
    System.out.println(queue.poll());   // Delete top of Queue
    System.out.println(queue.peek());

  }
}