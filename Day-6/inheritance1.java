
public class inheritance1 {
  public static void main(String[] args) {
  }
}

class One {
  One() {
    System.out.println("Constructor of One class");
  }
}

class Two extends One {
  Two() {
    System.out.println("Constructor of Two class");
  }
}

class Three extends Two {
  Three() {
    this(5); // Calling parameterized constructor
    System.out.println("Constructor of Three class");
  }

  Three(int a) {
    System.out.println("Parameterized constructor of Three class with value: " + a);
  }
}
