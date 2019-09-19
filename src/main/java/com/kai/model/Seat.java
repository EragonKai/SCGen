package com.kai.model;

/**
 * Represents a seat in a classroom that can contain one student.
 */
public class Seat {

    /**
     * The location of the seat within the classroom/how a teacher might identify a seat.
     * This depends highly on the arrangement of seats in the classroom and will be generated in Arrangement.
     *
     * For example, if seats are laid out in pairs, several seats may have ids similar to:
     *      1A, 1B
     *      2A, 2B, and so on.
     * However, in a circular arrangement ids may be a single number:
     *      1, 2, 3, 4, and so on.
     *
     * @see com.kai.model.gen.Arrangement
     */
    private String seatID;

    /**
     * The student that is currently occupying the seat.
     * This is always null on initialization due to seats being generated in Arrangement.
     */
    private Student student;

    /**
     * Initializes a seat with a seat ID. This should only ever be called in Arrangement.
     *
     * @param seatID  The ID of the seat.
     */
    public Seat(String seatID) {
        this.seatID = seatID;
    }

    /**
     * Gets the seat's ID.
     *
     * @return The ID of the Seat
     */
    public String getSeatID() {
        return seatID;
    }

    /**
     * Gets the occupying student, which can be null.
     *
     * @return The occupying student.
     */
    public Student getStudent() {
        return student;
    }
}
