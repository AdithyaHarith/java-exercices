package oops;

public class House {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.setName("puppy");
        d1.setAge(5);
        d1.bark();
        d1.run();

        System.out.println(d1.getName());

        Dog d2=new Dog();
        d2.setName("staffy");
        d2.setAge(6);
        d2.bark();
        d2.run();

        Dog d3=new Dog();
        d3.setName("shilo");
        d3.setAge(8);
        d3.bark();
        d3.run();


    }
}
