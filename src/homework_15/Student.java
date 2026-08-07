package homework_15;

import java.util.List;

public class Student {
    private final String fullName;
    private final String group;
    private int course;
    private final List<Integer> grades;

    public Student(String fullName, String group, int course, List<Integer> grades) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }


    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageScore() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
