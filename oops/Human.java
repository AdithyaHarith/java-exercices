package oops;

public class Human {
    private String name;
    private int age;
    private String color;
    private int height;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setHeight(int height){
        this.height=height;
    }


    public void smile(){
        System.out.println(name+ "is smiling");
    }

    public void eat(){
        System.out.println(name+ "is eating");
    }

}
