package com.kai.model;

import java.util.Objects;

/**
 * Represents a seat in a classroom that can contain one student.
 * This class is mainly used in SeatingChart.
 *
 * @see com.kai.model.gen.SeatingChart
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
    public String getSeatId() {
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

    /**
     * The equality of a seats are dependent on the id.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return Objects.equals(seatID, seat.seatID);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatID='" + seatID + '\'' +
                ", student=" + student +
                '}';
    }
}
