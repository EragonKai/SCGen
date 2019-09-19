package com.kai.model.gen;

import com.kai.model.Classroom;
import com.kai.model.Student;
import com.kai.model.StudentWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that access /gen/ and returns a list of generated charts.
 */
public class SChartGenerator {
    private SChartGenerator() {}

    public static SeatingChart[] generate(Classroom classroom, Parameters parameters) {

        //Initializes the list(s) of students that will be needed.
        List<Student> studentList = classroom.getStudentList();
        List<StudentWrapper> wrappedStudentList = new ArrayList<>(studentList.size());

        //Adds a wrapped version of each student to the new list.
        studentList.forEach((s) -> wrappedStudentList.add(new StudentWrapper(s)));




        return null;
    }

}
