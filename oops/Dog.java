package oops;

public class Dog {
    private String name;
    private int age;


    // setters and getters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println(name + "is barking");
    }

    public void run() {
        System.out.println(name + "is running");
    }
}
