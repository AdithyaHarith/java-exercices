package oops;

public class Home {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.setName("Anu");
        h1.setAge(6);
        h1.setColor("white");
        h1.setHeight(9);
        h1.smile();
        h1.eat();

        Human h2=new Human();
        h2.setName("Abi");
        h2.setAge(9);
        h2.setColor("black");
        h2.setHeight(13);
        h2.smile();
        h2.eat();
    }
}
