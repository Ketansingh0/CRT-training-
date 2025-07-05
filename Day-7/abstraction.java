// Abstract class
abstract class Vehicle {
  int topSpeed;
  int wheel;
  String fuelType;
  int door;

  // Constructor
  Vehicle(int topSpeed, int wheel, String fuelType, int door) {
    this.topSpeed = topSpeed;
    this.wheel = wheel;
    this.fuelType = fuelType;
    this.door = door;
  }

  // Abstract method
  abstract void displayInfo();
}

// Concrete subclass - Car
class Car extends Vehicle {
  Car() {
    super(220, 4, "Petrol", 4);
  }

  @Override
  void displayInfo() {
    System.out.println("Car Details:");
    System.out.println("Top Speed: " + topSpeed + " km/h");
    System.out.println("Wheels: " + wheel);
    System.out.println("Fuel Type: " + fuelType);
    System.out.println("Doors: " + door);
  }
}

// Concrete subclass - Bike
class Bike extends Vehicle {
  Bike() {
    super(150, 2, "Petrol", 0);
  }

  @Override
  void displayInfo() {
    System.out.println("Bike Details:");
    System.out.println("Top Speed: " + topSpeed + " km/h");
    System.out.println("Wheels: " + wheel);
    System.out.println("Fuel Type: " + fuelType);
    System.out.println("Doors: " + door);
  }
}

public class abstraction {
  public static void main(String[] args) {
    Vehicle myCar = new Car();
    Vehicle myBike = new Bike();

    myCar.displayInfo();
    System.out.println();
    myBike.displayInfo();
  }
}