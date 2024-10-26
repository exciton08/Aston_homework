package HW1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Course> courseList;

    Student(String name) {
        this.name = name;
        courseList = new ArrayList<>();
    }


    void registrationToCourse(Course course) {
        if (course.isOpen) {
            course.studentList.add(this);
            courseList.add(course);
        } else {
            System.out.println("Курс закрыт");
        }
    }
}
