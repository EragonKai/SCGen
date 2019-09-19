package com.kai.model;

import java.util.HashMap;
import java.util.Map;

/**
 * this should most likely go in /gen but I don't wanna make student public.
 *
 * A wrapper class that takes in a student and contains additional fields only used during generation.
 */
public class StudentWrapper {

    /**
     * The student this wrapper takes in and tracks.
     */
    private Student base;
    /**
     * A map of all previous students this student has sat next to along with how many times.
     */
    private Map<Student, Integer> previousSeatmates;

    /**
     * Initializes the wrapper with a student base.
     */
    public StudentWrapper(Student base) {
        this.base = base;
        previousSeatmates = new HashMap<>();
    }

    /**
     * Method that updates the wrapper when it's student sits with another.
     *
     * @param seatmate The student that it sat with.
     */
    public void satWith(Student seatmate) {
        int counter = 0;
        if (previousSeatmates.containsKey(seatmate)) {
            counter = previousSeatmates.get(seatmate) + 1;
            previousSeatmates.replace(seatmate, counter);
        } else {
            previousSeatmates.put(seatmate, counter);
        }
    }

}
