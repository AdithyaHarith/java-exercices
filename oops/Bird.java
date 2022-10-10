package oops;

public class Bird {
    private String name;
    private int age;

    public Bird(String name, int age) { // is used to construct an object.
        // No return type, constructor name is same as class name
        // Constructor is called automatically when an object is created.
        System.out.println("constructor is called");
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void eating() {
        System.out.println(name + " is eating");
    }

    public void flying() {
        System.out.println(name + " is flying");
    }
}

