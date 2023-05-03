
// public class OOPS {
//   public static void main(String[] args){
    
//     Pen pen1 = new Pen();
//     pen1.color = "Green";
//     pen1.printColor();

//     Pen pen2 = new Pen();
//     pen2.color = "Red";
//     pen2.printColor();
//   }
// }

// class Pen {
//   String color;
//   void printColor(){
//     System.out.println(this.color);
//   }
// }






public class OOPS {
  public static void main(String[] args){
    
    Pen pen1 = new Pen();
    pen1.printColor("Yellow");
    System.out.println(pen1.color);


    Pen pen2 = new Pen();
    pen2.printColor("Purple");
    System.out.println(pen2.color);
  }
}

class Pen {
  String color;
  void printColor(String color){
    this.color = color;
    // System.out.println(this.color);
  }
}






// public class OOPS {
//   public static void main(String[] args){
    
//     Pen pen1 = new Pen();
//     pen1.printColor("Yellow");
//     System.out.println(pen1.color);


//     Pen pen2 = new Pen();
//     pen2.printColor("Purple");
//     System.out.println(pen2.color);
//   }
// }

// class Pen {
//   String color;
//   void printColor(String clr){
//     color = clr;
//     // System.out.println(this.color);
//   }
// }
