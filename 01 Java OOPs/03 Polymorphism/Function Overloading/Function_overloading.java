
public class Function_overloading {
  public static void main(String[] args){
    
    Student sid_1 = new Student();
    
    sid_1.set_student_info("Rahim");
    System.out.println(sid_1.name);

    sid_1.set_student_info(22);
    System.out.println(sid_1.age);

    sid_1.set_student_info("Karim", 27);
    System.out.println(sid_1.name + " " + sid_1.age);
  }
}



class Student {
  String name;
  int age;

  void set_student_info(String name){
    this.name = name;
  }
  void set_student_info(int age){
    this.age = age;
  }
  void set_student_info(String name, int age){
    this.name = name;
    this.age = age;
  }
}

