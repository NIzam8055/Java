import java.io.*;
class DNT
{
 public String student;
 public int m;// Declared Instance Variable
 public DNT()
 { // Default Constructor
  this.student= "john";
  this.m=90; // initializing Instance Variable
 }
//Main Method
 public static void main(String[] args)
 {
  // Object Creation
  DNT name = new DNT();
  DNT m = new DNT();
  System.out.println("Student name is: " + name.student);
  System.out.println("Student MARK is: " + name.m);

 }
}
