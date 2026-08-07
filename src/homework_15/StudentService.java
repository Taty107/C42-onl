package homework_15;

import java.util.List;

public class StudentService {
    public void processStudents(List<Student> students) {
        for (int index = students.size() - 1; index >= 0; index--) {
            Student student = students.get(index);

            if (student.getAverageScore() < 3) {
                students.remove(index);
                System.out.println(student.getFullName() + " was expelled");
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        System.out.println("Students on " + course + " course: ");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("~" + student.getFullName());
            }
        }
    }
}
