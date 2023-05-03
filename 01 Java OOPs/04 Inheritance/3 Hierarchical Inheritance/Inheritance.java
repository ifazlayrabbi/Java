
// Hierarchical Inheritance

public class Inheritance {
  public static void main (String[] args) {
    Triangle triangle = new Triangle();
    Circle circle = new Circle();

    triangle.width = 5.7;
    triangle.height = 2.4;
    triangle.area (triangle.width, triangle.height);

    circle.radius = 3;
    circle.area (circle.radius);
  }
}

class Shape {
  double width, height, radius;
}

class Triangle extends Shape {
  void area (double width, double height) {
    System.out.printf("Triangle Area = %.2f\n", 0.5 * width * height);
  }
}

class Circle extends Shape {
  void area (double radius) {
    System.out.printf("Circle Area = %.2f\n", 2 * 3.1416 * radius);
  }
}