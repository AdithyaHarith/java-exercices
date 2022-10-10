package oops;

public class House {
    public static void main(String[] args) {
        Dog d1 = new Dog("shiroo", 7);

        d1.bark();
        d1.run();

        System.out.println(d1.getName());

        Dog d2 = new Dog("staffy", 6);

        d2.bark();
        d2.run();

        Dog d3 = new Dog("shilo", 8);

        d3.bark();
        d3.run();


    }
}
