package com.kai.model;

import java.util.ArrayList;
import java.util.List;

/**
 * I would prefer to name this class "Class", but that seems unwise.
 *
 * A classrooms object is primarily made up of a list of students.
 * Students should not ever exist on their own and should always be interacted with through a classroom.
 */
public class Classroom {

    /**
     * A list of students in the class.
     */
    private List<Student> students;

    /**
     * A name for the classroom. Different periods are not supported and should be separate classrooms.
     */
    private String name;

    /**
     * Constructs a Classroom full of Students based upon a string.
     * Each student has no initial settings but are initialized solely with a name.
     * Each string followed or surrounded by linebreaks is initialized as a student.
     *
     * @param name The name of the classroom.
     * @param rawStudentString A raw string that has names of students separated by line breaks.
     */
    public Classroom(String name, String rawStudentString) {
        this(name);

        //TODO: This regex might be wrong or not the most efficient. God I hate regexes.
        for (String s: rawStudentString.split("\\n")) {
            if (!s.isEmpty()) students.add(new Student(s));
        }
    }

    /**
     * Creates an empty classroom.
     *
     * @param name The name of the classroom.
     */
    public Classroom(String name) {
        this.name = name;

        students = new ArrayList<>();
    }

    /**
     * Attempts to add a student. If the student already exists within the classroom, fails.
     *
     * @param c The student to be added.
     * @return boolean indicating if the student was added.
     */
    public boolean addStudent(Student c) {
        if (!students.contains(c)) {
            students.add(c);
            return true;
        }
        return false;
    }

    /**
     * Grabs a student from the classroom. Returns null if the student does not exist.
     *
     * @param name The name of the student to be retrieved.
     * @return The student or null if they do not exist.
     */
    public Student getStudent(String name) {
        for (Student s: students) {
            if (s.getName().equals(name)) return s;
        }
        return null;
    }

    /**
     * Returns a copy of the list of students.
     *
     * @return The list of students.
     */
    public List<Student> getStudentList() {
        return new ArrayList<>(students);
    }

    /**
     * toString prints out the list of students.
     */

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("Classroom{" +
                "name='" + name + '\'' +
                ",students=\n");

        students.forEach(st -> s.append("\t" + st + "\n"));

        return s.toString() + '}';
    }
}
