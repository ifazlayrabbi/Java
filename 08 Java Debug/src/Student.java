public class Student {
  public static void main(String[] args) {
    Student student = new Student();
    student.setStudent("Student2");
    student.printStudent();
  
    Teacher teacher = new Teacher();
    teacher.setName("teacher2");
    teacher.printName();
  }

  private String student;

  void setStudent (String student) {
    this.student = student;
  }
  
  void printStudent() {
    System.out.println(this.student);
  }
}




class Teacher {
  private String teacher;

  void setName (String teacher) {
    this.teacher = teacher;
  }

  void printName () {
    System.out.println(this.teacher);
  }
}
