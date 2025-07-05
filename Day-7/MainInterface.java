
public class MainInterface {
  public static void main(String[] args) {
    Student student = new Student();
    student.run();
    student.sleep();
    student.eat();
    student.work();
  }
}

interface Human1 {
  void run();

  void sleep();
}

interface Human2 {
  void eat();

  default void work() {
    System.out.println("Student is working");
  }

  void sleep();

}

class Student implements Human1, Human2 {
  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void sleep() {
    System.out.println("Student is sleeping");
  }

  @Override
  public void eat() {
    System.out.println("Student is eating");
  }

  @Override
  public void work() {
    System.out.println("Student is working very much");
  }
}
