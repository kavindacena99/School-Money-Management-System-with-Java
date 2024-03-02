package School;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Biyuni = new Teacher(0, "Biyuni", 45000);
        Teacher Ramani = new Teacher(1, "Ramani", 25000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Biyuni);
        teacherList.add(Ramani);

        Student Sumudu = new Student(0, "Sumudu", 2);
        Student Dasun = new Student(8, "Dasun", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Sumudu);
        studentList.add(Dasun);

        School school = new School(teacherList, studentList);

        Sumudu.payFees(29000);

        System.out.println(school.getTotalMoneyEarned());
    }
}