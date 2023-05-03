package packages.static1;

public class Static1 {
  public static void main (String[] args) {
    Student.school = "RCN";          // static value is changeable, but after changing, common - for all the objects of that class.
    Student.changeSchool("BSN");     // static variables or functions - can be directly accessed by the class name, no need to create object.
    

    Student student1 = new Student();
    System.out.println("Student1 school: " + student1.school);

    Student student2 = new Student();
    System.out.println("Student2 school: " + student2.school);    // static value is common - for all the objects of a class.
  }
}

class Student {
  String name;
  static String school;    // static value is common - for all the objects of a class
  
  public static void changeSchool (String new_school) {
    school = new_school;
  }
}