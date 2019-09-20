package com.kai.model.gen;

/**
 * A config class passed to SChartGenerator that sets parameters for generating seating chart.
 * @see SChartGenerator
 */
public class Parameters {

    /**
     * How many seating charts in total to generate.
     */
    int totalcharts = 10;

    /**
     * What position the seats are in.
     */
    Arrangement seatArrangement = Arrangement.SINGLE;

    /**
     * The total number of seats in the classroom.
     */
    int totalSeats = 30;

    /**
     * The uh.. maximum times a student can sit with someone.
     *
     * Several other values are derived from this, mainly those concerning how likely it is for someone
     * to sit with the same person multiple times.
     */
    int maximumTimesStudentCanSitWithSomeone = 4;
}
