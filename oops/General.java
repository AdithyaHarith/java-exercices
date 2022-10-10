package oops;

public class General {
    public static void main(String[] args) {
        Car car1 = new Car("i10"); // car1 is object
       // car1.name="i10";
      //  car1.brand="hyundai";

        car1.drive();
        car1.brake();

        Car car2 = new Car("xyz");
       // car2.name="xyz";
      //  car2.brand="benz";

        car2.drive();
        car2.brake();

  // syntax      class-name object-name = new class-name()
    }
}
