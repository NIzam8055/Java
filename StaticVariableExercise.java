import java.io.*;
 class student {
   static int age;
 }
public class Example4 {
    public static void main(String[] args) {
       
       student student1 = new student ();
       student student2 = new student ();
       student1.age = 20;
       student2.age = 17;
       student.age=23;
        
        System.out.println("Student 1: " + student1.age);
        System.out.println("Student 2: " + student2.age);
       
    }
}
