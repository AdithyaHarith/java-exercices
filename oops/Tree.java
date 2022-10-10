package oops;


public class Tree {
    public static void main(String[] args) {
        Bird b1=new Bird("parrot", 7);

        b1.eating();
        b1.flying();

        System.out.println(b1.getName());
        System.out.println(b1.getAge());

        Bird b2=new Bird("peacock",5);

        b2.eating();
        b2.flying();
    }
}
