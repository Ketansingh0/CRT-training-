
public class Encapsulation {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setBranch("CSE");
    s1.setMarks(87);
    s1.setName("ABC");
    s1.setRoll_no(7);

    System.out.println("Student name is " + s1.getName());
    System.out.println("Student roll number is " + s1.getRoll_no());
    System.out.println("Student marks is " + s1.getMarks());
    System.out.println("Student branch is " + s1.getBranch());

  }
}

class Student {
  private String name;
  private int roll_no;
  private String branch;
  private float marks;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRoll_no() {
    return roll_no;
  }

  public void setRoll_no(int roll_no) {
    this.roll_no = roll_no;
  }

  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public float getMarks() {
    return marks;
  }

  public void setMarks(float marks) {
    this.marks = marks;
  }

}
