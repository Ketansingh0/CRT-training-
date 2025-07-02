
// Parent class (Super class)
class Animal {
  void eat() {
    System.out.println("Animal is eating");
  }
}

// Child class (Sub class)
class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking");
  }
}

// Main class to run the program
public class single_lvl_inheritance {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat(); // inherited method
    d.bark(); // subclass method
  }
}
