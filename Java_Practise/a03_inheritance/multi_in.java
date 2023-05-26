package a03_inheritance;

public class multi_in {
  public static void main(String[] args) {
    EqualTriangle triangle = new EqualTriangle();
    triangle.printColor("Yellow");
    triangle.printArea(4.5, 7.2);
    
    System.out.println(triangle.color);
    System.out.println(triangle.width);
    System.out.println(triangle.height);
  }
}


class Shape1 {
  String color;
}

class Triangle1 extends Shape1 {
  void printColor (String color) {
    this.color = color;
    System.out.println("Triangle color: " + this.color);
  }
  double width, height;    
}

class EqualTriangle extends Triangle1 {
  void printArea (double width, double height) {
    this.width = width;
    this.height = height;
    double area = 0.5 * this.width * this.height;
    System.out.printf("Area = %.2f\n", area);
  }
}






// package inheritanceex;

// public class multi_in {
//   public static void main(String[] args) {
//     EqualTriangle triangle = new EqualTriangle();
//     triangle.color = "Green";
//     triangle.printColor(triangle.color);
//     triangle.width = 3.5;
//     triangle.height = 7.4;
//     triangle.printArea(triangle.width, triangle.height);
//   }
// }


// class NewShape {
//   public String color;
// }

// class MyTriangle extends NewShape {
//   void printColor (String color) {
//     System.out.println("Triangle color: " + color);
//   }
//   public double width, height;    
// }

// class EqualTriangle extends MyTriangle {
//   void printArea (double width, double height) {
//     double area = 0.5 * width * height;
//     System.out.printf("Area = %.2f\n", area);
//   }
// }





