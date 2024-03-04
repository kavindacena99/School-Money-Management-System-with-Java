package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpend;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
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

    public static double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void setTotalMoneyEarned(double totalMoneyEarned) {
        School.totalMoneyEarned += totalMoneyEarned;
    }

    public static double getTotalMoneySpend() {
        return totalMoneySpend;
    }

    public static void updateTotalMoneySpend(double totalMoneySpend) {
        School.totalMoneySpend += totalMoneySpend;
    }
}