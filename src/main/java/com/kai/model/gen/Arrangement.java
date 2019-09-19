package com.kai.model.gen;

import com.kai.model.Seat;

import java.util.List;

/**
 * An enum that represents how the seats in the classroom are placed/the size of the table groups.
 */
public enum Arrangement {

    //GROUPS4, GROUPS6, CIRCLE;


   SINGLE {
       /**
        * A "single" arrangement is when every seat in the classroom is only and laid out in rows and columns.
        */
       List<Seat> getSeats(int totalSeats) {
           return null;
       }
   }, PAIRS {
        /**
         * A "pair" arrangement is if all seats are laid out in columns and rows of pairs.
         */
        List<Seat> getSeats(int totalSeats) {
            return null;
        }
   };

    /**
     * Returns a list of seats that each know their location within the classroom.
     *
     * @param totalSeats The total number of seats to be placed in the classroom.
     * @return  The list of seats.
     */
    abstract List<Seat> getSeats(int totalSeats);
}
