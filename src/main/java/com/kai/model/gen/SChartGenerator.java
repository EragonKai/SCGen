package com.kai.model.gen;

import com.kai.model.Classroom;
import com.kai.model.Student;
import com.kai.model.StudentWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that access /gen/ and returns a list of generated charts.
 *
 * Explanation:
 *      The goal of this class is take a classroom object such as:
 *              Classroom{name='Test',students=
 * 	                Student{name='john', position=BACK, positionPriority=MEDIUM, preferredStudents={}, distancedStudents={}}
 * 	                Student{name='lilly', position=ANYWHERE, positionPriority=NULL, preferredStudents={john=LOW}, distancedStudents={}}
 * 	                Student{name='dwecker', position=FRONT, positionPriority=HIGH, preferredStudents={}, distancedStudents={john=HIGH}}}
 *       and to then fit it into as much permutations of seating charts as specified by the user.
 *              SeatingChart{arrangement=PAIRS, seats=
 * 	                Seat{seatID='1A', student=null}
 * 	                Seat{seatID='1B', student=null}
 * 	                Seat{seatID='2A', student=null}
 * 	                Seat{seatID='2B', student=null}
 * 	     This is done according to configuration in a Parameters Object.
 *       @see Parameters
 *
 * 	     This is (or will be, hopefully) accomplished by the following process:
 * 	        - The given list of students is retrieved from the passed in classroom.
 * 	        - A list of StudentWrapper is created from the list of students.
 * 	        - A seating chart is created as many times as specified in Parameters. In the loop:
 * 	            -
 */
public class SChartGenerator {
    private SChartGenerator() {}

    public static SeatingChart[] generate(Classroom classroom, Parameters parameters) {

        //Initializes the list(s) of students that will be needed.
        List<Student> studentList = classroom.getStudentList();
        List<StudentWrapper> wrappedStudentList = new ArrayList<>(studentList.size());

        //Adds a wrapped version of each student to the new list.
        studentList.forEach((s) -> wrappedStudentList.add(new StudentWrapper(s)));

        System.out.println("==================== SINGLE");
        System.out.println(new SeatingChart(Arrangement.SINGLE, 5));
        System.out.println("==================== PAIRS");
        System.out.println(new SeatingChart(Arrangement.PAIRS, 8));


        return null;
    }

}
