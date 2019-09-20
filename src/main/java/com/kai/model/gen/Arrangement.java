package com.kai.model.gen;

import com.kai.model.Seat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * An enum that represents how the seats in the classroom are placed/the size of the table groups.
 *
 * In the future users should be able to create their own arrangements.
 */
public enum Arrangement {

    //GROUPS4, GROUPS6, CIRCLE;


   SINGLE {
       /**
        * A "single" arrangement is when every seat in the classroom is only and laid out in rows and columns.
        */
       List<Seat> getSeats(int totalSeats) {
           List<Seat> seats = new ArrayList<>();
           IntStream.rangeClosed(1, totalSeats).forEach((i) -> seats.add(new Seat(String.valueOf(i))));
           return seats;
       }
   }, PAIRS {
        /**
         * A "pair" arrangement is if all seats are laid out in columns and rows of pairs.
         */
        List<Seat> getSeats(int totalSeats) {
            List<Seat> seats = new ArrayList<>();
            IntStream.rangeClosed(1, totalSeats).forEach((i) -> {
                if (i % 2 == 1) seats.add(new Seat(String.valueOf(i - i/2) + "A")); else {
                seats.add(new Seat(String.valueOf((i-1)-(i-1)/2) + "B")); }
            });
            return seats;
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
