package a1_Collection_Interface;
import java.util.ArrayDeque;

public class A2_3_ArrayDeque {
  public static void main (String[] args) {
    ArrayDeque <Integer> arr_deque = new ArrayDeque <> ();
    // ArrayDeque is a Double LinkedList
    
    arr_deque.offer(32);
    arr_deque.offerFirst(45);
    arr_deque.offerLast(23);
    arr_deque.offer(20);
    System.out.println(arr_deque);


    System.out.println(arr_deque.peek());
    System.out.println(arr_deque.peekFirst());
    System.out.println(arr_deque.peekLast());



    arr_deque.poll();
    System.out.println(arr_deque);

    arr_deque.pollFirst();
    System.out.println(arr_deque);

    arr_deque.pollLast();
    System.out.println(arr_deque);
  }
}