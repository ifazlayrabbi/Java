
// Single-level Inheritance

public class Inheritance {
  public static void main (String[] args) {
    Triangle triangle = new Triangle();
    triangle.color = "Red";
    triangle.printColor(triangle.color);
  }
}



class Shape {
  String color;
}

class Triangle extends Shape {
  void printColor (String color) {
    System.out.println(color);
  }
}

