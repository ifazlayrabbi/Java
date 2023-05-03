
// Multi-level Inheritance

public class Inheritance {
  public static void main (String[] args) {
    EqualTriangle triangle = new EqualTriangle();

    triangle.color = "Red";
    triangle.printColor(triangle.color);

    triangle.width = 4.6;
    triangle.height = 3.5;

    triangle.area (triangle.width, triangle.height);

  }
}



class Shape {
  String color;
}

class Triangle extends Shape {
  void printColor (String color) {
    System.out.println("Triangle color = " + color);
  }
  double width, height;
}

class EqualTriangle extends Triangle {
  void area (double width, double height) {

    // String area = String.format("%.2f", 0.5 * width * height);
    // System.out.println("Area = " + area);

    System.out.printf("Area = %.2f", 0.5 * width * height);
  }
}
