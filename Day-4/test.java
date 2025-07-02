
public class test {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.name = "abc";
    s1.rollNo = 123;
    s1.print();

  }
}

class Student {
  String name;
  int rollNo;

  public void print() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
  }
}
