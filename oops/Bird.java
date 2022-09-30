package oops;

public class Bird {
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eating() {
        System.out.println(name + "is eating");
    }

    public void flying() {
        System.out.println(name + "is flying");
    }
}

