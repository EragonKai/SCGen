package com.kai.model;

import com.kai.util.PriorityLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a single student in a class(room).
 * Contains all seating preferences and settings for that specific student.
 *
 * In the future this must be written as too be serializable.
 */
public class Student {

    /**
     * A Position enum with values indicating a specific segment of the room.
     * Contained inside Student as Student is the only case to access it.
     */
    enum Position {
        FRONT,
        BACK,
        LEFT,
        RIGHT,
        ANYWHERE
    }

    /**
     * The student's full name or an identifying String.
     * Used in equals and hashcode.
     */
    private String name;

    /**
     * Determines a particular seating preference for the student and its priority.
     */
    private Position position = Position.ANYWHERE;
    private PriorityLevel positionPriority = PriorityLevel.NULL;

    /**
     * Others that the student should be more or less likely to sit next to.
     */
    private Map<String, PriorityLevel> preferredStudents = new HashMap<>();
    private Map<String, PriorityLevel> distancedStudents = new HashMap<>();

    /**
     * Constructs a blank student besides the identifying name.
     *
     * @param name The name/identifier of the student.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Sets the position and priority of that position for the student.
     */
    public void position(Position pos, PriorityLevel priorityLevel) {
        this.position = pos;
        this.positionPriority = priorityLevel;
    }

    public void position(Position pos) {
        position(pos, PriorityLevel.MEDIUM);
    }

    /**
     * Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void addPreferredStudent(String name, PriorityLevel priority) {
        preferredStudents.put(name, priority);
    }

    public void addPreferredStudent(String name) {
        preferredStudents.put(name, PriorityLevel.MEDIUM);
    }

    public void addDistancedStudent(String name, PriorityLevel priority) {
        distancedStudents.put(name, priority);
    }

    public void addDistancedStudent(String name) {
        distancedStudents.put(name, PriorityLevel.MEDIUM);
    }

    public Map<String, PriorityLevel> getPreferredStudents() {
        return new HashMap<>(preferredStudents);
    }

    public Map<String, PriorityLevel> getDistancedStudents() {
        return new HashMap<>(distancedStudents);
    }

    /**
     * The equals and hashcode methods only rely on the name.
     *
     * @see #name
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", positionPriority=" + positionPriority +
                ", preferredStudents=" + preferredStudents +
                ", distancedStudents=" + distancedStudents +
                '}';
    }
}
