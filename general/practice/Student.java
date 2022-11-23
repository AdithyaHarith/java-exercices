package general.practice;

public class Student {
    private   String name;
    private int age;
    private int totalMarks;

    public Student(String name, int age,  int totalMarks) {
        this.name = name;
        this.age = age;
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {

        return totalMarks;
    }
    public int getAge(){
        return age;
    }

}
