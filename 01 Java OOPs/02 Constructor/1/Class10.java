
public class Class10 {
  public static void main(String[] args){
    Student id_1 = new Student();
    System.out.println(id_1.name + " " + id_1.age);

    Student id_2 = new Student("Karim", 27);
    System.out.println(id_2.name + " " + id_2.age);
    
    Student id_3 = new Student(id_2);
    System.out.println(id_3.name + " " + id_3.age);
  }
}

class Student{
  
  String name = "Rahim";
  int age = 22;

  Student(){
    // System.out.println(name + " " + age);
  }
  
  Student(String name, int age){
    this.name = name;
    this.age = age;
    // System.out.println(this.name + " " + this.age);
  }

  Student(Student id_2){
    this.name = id_2.name;
    this.age = id_2.age;
    // System.out.println(this.name + " " + this.age);
  }
}