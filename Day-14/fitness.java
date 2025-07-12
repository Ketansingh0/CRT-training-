public class fitness {
  public static void main(String[] args) {
    int t1r1 = 95, t1r2 = 92, t1r3 = 90;
    int t2r1 = 92, t2r2 = 90, t2r3 = 92;
    int t3r1 = 95, t3r2 = 92, t3r3 = 90;

    boolean t1Valid = (t1r1 >= 1 && t1r1 <= 100) && (t1r2 >= 1 && t1r2 <= 100) && (t1r3 >= 1 && t1r3 <= 100);
    boolean t2Valid = (t2r1 >= 1 && t2r1 <= 100) && (t2r2 >= 1 && t2r2 <= 100) && (t2r3 >= 1 && t2r3 <= 100);
    boolean t3Valid = (t3r1 >= 1 && t3r1 <= 100) && (t3r2 >= 1 && t3r2 <= 100) && (t3r3 >= 1 && t3r3 <= 100);

    int avg1 = t1Valid ? Math.round((t1r1 + t1r2 + t1r3) / 3.0f) : 0;
    int avg2 = t2Valid ? Math.round((t2r1 + t2r2 + t2r3) / 3.0f) : 0;
    int avg3 = t3Valid ? Math.round((t3r1 + t3r2 + t3r3) / 3.0f) : 0;

    int max = Math.max(avg1, Math.max(avg2, avg3));

    if (max < 70) {
      System.out.println("All trainees are unfit");
    } else {
      if (avg1 == max)
        System.out.println("Trainee Number: 1");
      if (avg2 == max)
        System.out.println("Trainee Number: 2");
      if (avg3 == max)
        System.out.println("Trainee Number: 3");
    }
  }
}