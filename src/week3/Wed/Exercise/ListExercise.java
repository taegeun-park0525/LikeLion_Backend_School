package week3.Wed.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    List<String> students;

    public ListExercise(){
        // 생성자는
        this.students = new ArrayList<>();
        this.students.add("나");
        this.students.add("김미지");
        this.students.add("김미경");
        this.students.add("김경록");
    }

    public List<String> getStudents(){
        return this.students;
    }

}