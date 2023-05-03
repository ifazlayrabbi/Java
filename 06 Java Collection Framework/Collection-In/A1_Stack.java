package packages;
import java.util.Stack;

public class A1_Stack {
  public static void main (String[] args) {
    Stack <String> stack = new Stack <> ();

    stack.push("book-1");
    stack.push("book-3");
    stack.push("book-4");
    stack.push("book-2");

    System.out.println(stack);

    System.out.println(stack.peek());   // top of stack
    System.out.println(stack.pop());    // delete top of stack
    System.out.println(stack.peek());

  }
}