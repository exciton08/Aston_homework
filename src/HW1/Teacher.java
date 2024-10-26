package HW1;

import java.util.*;

public class Teacher {
    String name;
    List<Course> courseList;

    Teacher(String name) {
        this.name = name;
        courseList = new ArrayList<>();
    }

    void openRegistration(int courseNumber) {
        courseList.get(courseNumber).isOpen = true;
    }

    Mark gradeOneStudent() {
        Random random = new Random();
        return new Mark(random.nextInt(2, 6));
    }

    void gradeStudents(Archive archive, Course course) {
        Map<String, Mark> courseGrades = new HashMap<>();
        for (Student student : course.studentList) {
            courseGrades.put(student.name, gradeOneStudent());
        }
        archive.courseGrades.put(course.courseName, courseGrades);
    }

    void addCourse(Course course) {
      courseList.add(course);
    }
}