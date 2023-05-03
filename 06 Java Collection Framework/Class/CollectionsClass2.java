package packages;
import packages.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClass2 {
  public static void main (String[] args) {
    ArrayList <Student> list = new ArrayList <> ();

    list.add(new Student("Rahim", 1));
    list.add(new Student("Fatima", 4));
    list.add(new Student("Koolsoom", 3));
    list.add(new Student("Karim", 1));
    list.add(new Student("Rukaiya", 3));
    

    System.out.println(list + "\n");


    Student s1 = new Student("Sumaiya", 9);
    Student s2 = new Student("Fatima", 7);
    System.out.println(s1.compareTo(s2));

    // Collections.sort(list, new Comparator <Student> () {
    //   public int compare(Student o1, Student o2) {
    //     return o1.name.compareTo(o2.name);
    //   }
    // });

    Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

    System.out.println(list + "\n");



  }
}