package HW1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    boolean isOpen;
    List<Student> studentList;

    Course(String courseName) {
        this.courseName = courseName;
        isOpen = false;
        studentList = new ArrayList<>();
    }
}
