package com.kai.model;

import com.kai.util.PriorityLevel;

public class CommandLineTest {

    public static void main(String[] args) {
        Classroom c = new Classroom("Test");

        Student john = new Student("john");
        Student lilly = new Student("lilly");
        Student dwecker = new Student("dwecker"); //fuck dwecker

        john.position(Student.Position.BACK);
        lilly.addPreferredStudent("john", PriorityLevel.LOW);
        dwecker.addDistancedStudent("john", PriorityLevel.HIGH);
        dwecker.position(Student.Position.FRONT, PriorityLevel.HIGH);

        c.addStudent(john);
        c.addStudent(lilly);
        c.addStudent(dwecker);

        System.out.println(c);
    }

}
