
// Hybrid Inheritance

public class Inheritance {
  public static void main (String[] args) {
    
    EqualTriangle triangle = new EqualTriangle();
    Circle circle = new Circle();

    triangle.color = "Green";
    triangle.width = 3.25;
    triangle.height = 7.2;

    triangle.triangleColor (triangle.color);
    triangle.area (triangle.width, triangle.height);

    circle.radius = 5.7;
    circle.area(circle.radius);
  }
}



class Shape {
  String color;
  double radius;
}

class Triangle extends Shape {
  void triangleColor (String color) {
    System.out.println("Triangle color = " + color);
  }
  double width, height;
}

class EqualTriangle extends Triangle {
  void area (double width, double height) {
    System.out.printf("Triangle Area = %.2f\n", 0.5 * width * height);
  }
}



class Circle extends Shape {
  void area (double radius) {
    System.out.printf("Circle Area = %.2f\n", 2 * 3.1416 * radius);
  }
}

