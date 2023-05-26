public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student student = new Student();
        student.setStudent("Student1");
        student.printStudent();
    
        Teacher teacher = new Teacher();
        teacher.setName("teacher1");
        teacher.printName();
    }
}
