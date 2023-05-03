
// public class Class10 {
//   public static void main(String Args[]){
    
//     Student roll_1 = new Student();
//     roll_1.name = "Rahim";
//     roll_1.age = 22;
//     roll_1.printStudent();

    
//     Student_Schema r_1 = new Student_Schema();
//     r_1.printStudent("Karim", 25);
//     System.out.println(r_1.name + " " + r_1.age);
//   }
// }

// class Student {
//   String name;
//   int age;
//   void printStudent(){
//     System.out.println(name + " " + age);
//   }
// }

// class Student_Schema{
//   String name;
//   int age;
//   void printStudent(String name, int age){
//     this.name = name;
//     this.age = age;
//   }
// }






public class Class10 {
  public static void main(String Args[]){
    
    Student roll_1 = new Student();
    roll_1.name = "Rahim";
    roll_1.age = 22;
    roll_1.printStudent();

    
    Student roll_2 = new Student();
    roll_2.printStudent_Alternative("Karim", 27);
    System.out.println(roll_2.name + " " + roll_2.age);
  }
}

class Student {
  String name;
  int age;
  void printStudent(){
    System.out.println(name + " " + age);
  }
  void printStudent_Alternative(String name, int age){
    this.name = name;
    this.age = age;
  }
}
