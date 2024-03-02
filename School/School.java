package School;

import java.util.*;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpend;

    School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpend = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public double getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public static void setTotalMoneyEarned(double totalMoneyEarned) {
        totalMoneyEarned -= totalMoneyEarned;
    }

    public static void updateTotalMoneySpend(double totalMoneySpend) {
        totalMoneySpend -= totalMoneySpend;
    }
}
