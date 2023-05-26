package a03_inheritance;

public class Single_in {
  public static void main(String[] args) {
    Triangle triangle = new Triangle();
    triangle.color = "Green";
    triangle.printColor();    
  }
}


class Shape {
  String color;
}

class Triangle extends Shape {
  void printColor () {
    System.out.println("Triangle color: " + color);
  }
}