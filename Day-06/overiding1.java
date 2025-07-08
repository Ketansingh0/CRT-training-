class Animal {
  public void eat() {
    System.out.println("Animal eats");
  }

  public void sound() {
    System.out.println("Animal makes sound");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("Dog eats bones");
  }

  public void sound() {
    super.sound();
    System.out.println("Dog barks");
  }
}

class Horse extends Animal {
  public void eat() {
    System.out.println("Horse eat");
  }

  public void sound() {
    System.out.println("Horse neighs");
  }

}

public class overiding1 {
  public static void main(String[] args) {
    Dog a = new Dog();
    a.eat();
    a.sound();

    Animal b = new Dog();
    b.eat();
    b.sound();
  }
}
