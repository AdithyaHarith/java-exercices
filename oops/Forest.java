package oops;

public class Forest {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.setName("Lion");
        a1.setAge(4);
        a1.setColor("Orange");
        a1.burk();
        a1.run();

        System.out.println(a1.getName());

        Animal a2=new Animal();
        a2.setName("Elephant");
        a2.setAge(6);
        a2.setColor("Black");
        a2.burk();
        a2.run();


    }
}
