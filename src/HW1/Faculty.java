package HW1;

public class Faculty {
    public static void main(String[] args) {
        Archive archive = new Archive();
        Teacher teacher = new Teacher("Учитель");
        Course course = new Course("Нумерология");
        Student student1 = new Student("Вася");
        Student student2 = new Student("Петя");
        student1.registrationToCourse(course);
        teacher.addCourse(course);
        teacher.openRegistration(0);
        student1.registrationToCourse(course);
        student2.registrationToCourse(course);
        teacher.gradeStudents(archive, course);
    }
}
