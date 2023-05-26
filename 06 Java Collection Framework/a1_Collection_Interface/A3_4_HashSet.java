package a1_Collection_Interface;
import java.util.HashSet;
import java.util.Objects;

public class A3_4_HashSet {
  public static void main (String[] args) {

    Student student1 = new Student("Rahim", 7);
    Student student2 = new Student("Karim", 7);
    System.out.println(student1.equals(student2));




    HashSet <Student> set = new HashSet <> ();

    set.add(student1);
    set.add(student2);
    set.add(new Student("Rahim", 1));
    set.add(new Student("Karim", 2));
    set.add(new Student("Koolsoom", 3));
    set.add(new Student("Rukaiya", 3));
    set.add(new Student("Fatima", 4));

    System.out.println(set + "\n");
  }
}





class Student {
  String name;
  int roll;

  Student (String name, int roll) {
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

}

