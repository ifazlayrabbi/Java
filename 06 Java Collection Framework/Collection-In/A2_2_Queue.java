package packages;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class A2_2_Queue {
  public static void main (String[] args) {
    // Queue <Integer> queue = new PriorityQueue <> ();
    Queue <Integer> queue = new PriorityQueue <> (Comparator.reverseOrder());

    // priority queue is by default -> min heap
    // can be reversed to -> max heap

    queue.offer(50);
    queue.offer(30);
    queue.offer(40);
    queue.offer(20);

    System.out.println(queue);
    System.out.println("Queue peek: " + queue.peek());
    System.out.println("Queue poll: " + queue.poll());
    System.out.println(queue);
    System.out.println("Queue peek: " + queue.peek());
    

  }
}