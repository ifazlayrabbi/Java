package packages;
import java.util.ArrayList;



public class A1_ArrayList1 {
  public static void main (String[] args) {
    Print_integer print_integer = new Print_integer();
    Print_all print_all = new Print_all();
    // print_integer.print();
    // print_all.print();



    Student student1 = new Student();
    student1.name = "Moin";
    student1.age = 27;
    student1.section = 'A';

    ArrayList list3 = new ArrayList();
    list3.add('M');
    list3.add(2.32);
    list3.add(student1);
    list3.add("Hello");
    
    System.out.println(list3);
    System.out.println(list3.get(0));
    // System.out.println(list3.get(1));
    Object obj = list3.get(1);
    System.out.println(obj);
    


    // Update List Element
    list3.set(3, 27);
    System.out.println(list3);

    // Delete List Element
    list3.remove(3);
    System.out.println(list3);

    // Delete All
    // list3.clear();
    // System.out.println(list3);



    // Search
    if(list3.contains('M')){
      System.out.println("Found M.");
    }
    else {
      System.out.println("M not found.");
    }
  }
}





class Print_integer {
  void print () {
    ArrayList <Integer> list1 = new ArrayList <> ();
    list1.add(10);
    list1.add(20);
    list1.add(30);
    // System.out.println(list1);
    // System.out.println(list1.get(1));

    for(int i=0; i<list1.size(); i++){
      System.out.println(list1.get(i));
    }
  }
}


class Print_all {
  void print (){
    ArrayList list2 = new ArrayList();
    list2.add("Moin");
    list2.add(2);
    System.out.println(list2);
  }
}


class Student {
  String name;
  int age;
  char section;
}

