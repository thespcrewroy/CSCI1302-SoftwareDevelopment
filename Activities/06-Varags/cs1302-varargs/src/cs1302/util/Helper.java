package cs1302.util;

/**
 * Helper class with some convenient static methods.
 */
public class Helper {

    /**
     * Return the smallest value in the array.
     *
     * @param numbers  arguments to print
     * @throws NullPointerException When {@code numbers} is {@code null}.
     * @throws IllegalArgumentException When {@code numbers.length} is zero.
     */
    public static int min(int... numbers) {

        if (numbers.length == 0) {
            throw new IllegalArgumentException("min: one or more numbers required");
        } // if

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } // if
        } // for

        return smallest;

    } // printlns

} // Helper
