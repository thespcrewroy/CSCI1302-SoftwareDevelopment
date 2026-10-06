/**
 * An ordered list of strings.
 */
public interface List {

    /**
     * Returns the string at {@code index}.
     *
     * @param index the position of the string
     * @return the string at {@code index}
     * @throws IndexOutOfBoundsException if {@code index < 0 || index >= size()}
     */
    String get(int index);

    /**
     * Inserts {@code s} at {@code index}.
     *
     * @param index the insertion position
     * @param s the string to insert
     * @return {@code true} when the string is added
     * @throws IndexOutOfBoundsException if {@code index < 0 || index > size()}
     */
    boolean add(int index, String s);

    /**
     * Removes and returns the string at {@code index}.
     *
     * @param index the position to remove
     * @return the removed string
     * @throws IndexOutOfBoundsException if {@code index < 0 || index >= size()}
     */
    String remove(int index);

    /** Removes every string from this list. */
    void clear();

    /**
     * Returns the number of strings in this list.
     *
     * @return the list size
     */
    int size();

    /**
     * Joins the strings in this list using {@code sep}.
     *
     * @param sep the separator placed between strings
     * @return the joined strings
     */
    String makeString(String sep);
}
