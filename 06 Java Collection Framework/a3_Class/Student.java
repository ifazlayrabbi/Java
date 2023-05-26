package a3_Class;
import java.util.Objects;
import java.util.Comparator;

public class Student implements Comparable <Student> {
  public String name;
  public int roll;

  public Student (String name, int roll) {
    this.name = name;
    this.roll = roll;
  }



  public String toString () {
    return "Student{" +
              "name: " + name + ", " +
              "roll: " + roll +
           "}"; 
  }

  public boolean equals (Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    // return roll == student.roll && name ==student.name;
    return roll == student.roll;
  }

  public int hashCode () {
    // return Objects.hash(roll, name);
    return Objects.hash(roll);
  }

  /////////////  Compare on roll basis  ///////////
  public int compareTo(Student o){
    return this.roll - o.roll;
  }

  ////////////  Compare on name basis  ////////////
  // public int compareTo(Student o){
  //   return this.name.compareTo(o.name);
  // }

  public void printMe () {
    System.out.println("ME");
  }
}

