package com.lawrey.habittracking.data;

import android.provider.BaseColumns;

/**
 * Created by Lawrey on 3/1/17.
 */

public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single habit.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of database table for habits */
        public final static String TABLE_NAME = "habits";

        /**
         * Unique ID number for the habit (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the habit.
         *
         * Type: TEXT
         */
        public final static String COLUMN_HABIT_NAME ="name";

        /**
         * Time spent on the habit in minutes.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_TIME= "time";

        /**
         * Day of the habit starting from 1.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_HABIT_DAY= "day";




    }


}
