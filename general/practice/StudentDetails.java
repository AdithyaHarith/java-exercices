package general.practice;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
//        Student student = new Student("anu",12,300);
//        studentList.add(student);
        int count = 0;
        studentList.add(new Student("anu", 12, 300));
        studentList.add(new Student("abc", 14, 400));
        studentList.add(new Student("xyz", 11, 200));
        studentList.add(new Student("aaa", 20, 234));
        studentList.add(new Student("bbb", 33, 340));
        studentList.add(new Student("ccc", 44, 590));
        studentList.add(new Student("ddd", 45, 600));
        studentList.add(new Student("eee", 12, 500));
        studentList.add(new Student("fff", 43, 200));
        studentList.add(new Student("ggg", 23, 300));

        for (Student student : studentList) {
//            if (student.getTotalMarks() >= 300) {
//                count = count + 1;
//            }
            if((student.getAge()>=30) && (student.getTotalMarks()>=300)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
