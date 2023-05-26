package a02_collection_framework;
import java.util.Stack;

public class Stack1 {
  public static void main (String[] args) {
    Stack <String> stack = new Stack <> ();

    stack.push("book-1");
    stack.push("book-2");
    stack.push("book-3");
    stack.push("book-4");

    System.out.println(stack);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
  }
}