
public class inheritence {
  public static void main(String[] args) {
    Demo3 d3 = new Demo3();
  }
}

class Demo {
  Demo() {
    System.out.println("Constructor of Demo class");
  }
}

class Demo1 extends Demo {
  String name = "Adarsh Singh";
}

class Demo2 extends Demo1 {
  String name1 = "Ketan Singh";
}

class Demo3 extends Demo2 {

}
