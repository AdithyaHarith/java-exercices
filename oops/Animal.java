package oops;

public class Animal {
    private String name;
    private int age;
    private String color;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;

    }
    public void setAge(int age){
        this.age=age;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void burk(){
        System.out.println(name+ "is burking");
    }

    public void run(){
        System.out.println(name+ "is running");
    }




}
