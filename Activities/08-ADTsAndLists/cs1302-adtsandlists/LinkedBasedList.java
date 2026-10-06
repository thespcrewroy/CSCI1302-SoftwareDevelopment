import cs1302.adt.Node;

/**
 * A linked-node implementation of the {@link List} ADT.
 */
public class LinkedBasedList implements List {

    private Node head;
    private int size;

   /**
    * Constructs an empty linked list.
    */
    public LinkedBasedList() {
        head = null;
        size = 0;
    } // LinkedBasedList

    @Override
    public String get(int index) {
        checkElementIndex(index);
        return nodeAt(index).getItem();
    } // get

    /**
     * Adds the specified element at the specified position in this list.
     * 
     * @param index
     * @param s
     * @return true if the element was added, false otherwise
     */
    @Override
    public boolean add(int index, String s) {
        checkPositionIndex(index);

        if (index == 0) {
            head = new Node(s, head);
        } else {
            Node previous = nodeAt(index - 1);
            previous.setNext(new Node(s, previous.getNext()));
        } // if

        size++;
        return true;
    } // add

    /**    (non-Javadoc)
     * {@inheritDoc}
     *
     * @return the number of elements in the list
     */
    @Override
    public int size() {
        return size;
    } // size


    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index
     * @return the element that was removed from the list
     */
    @Override
    public String remove(int index) {
        checkElementIndex(index);

        Node removed;
        if (index == 0) {
            removed = head;
            head = head.getNext();
        } else {
            Node previous = nodeAt(index - 1);
            removed = previous.getNext();
            previous.setNext(removed.getNext());
        } // if

        size--;
        return removed.getItem();
    } // remove

    /**    (non-Javadoc)
     * {@inheritDoc}
     *
     * @return the number of elements in the list
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    } // clear

    /**    (non-Javadoc)
     * {@inheritDoc}
     * 
     * @param sep
     * @return the string representation of the list with the specified separator
     */
    @Override
    public String makeString(String sep) {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            if (result.length() > 0) {
                result.append(sep);
            } // if
            result.append(current.getItem());
            current = current.getNext();
        } // while

        return result.toString();
    } // makeString

    /**
     * Returns the node at the specified index.
     * 
     * @param index
     * @return
     */
    private Node nodeAt(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        } // for
        return current;
    } // nodeAt

    /**
     * Checks an index used to access an existing element.
     * 
     * @param index
     */
    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is outside the range [0, %d)", index, size)
            );
        } // if
    } // checkElementIndex

    /**
     * Checks an index used to insert a new element.
     * 
     * @param index
     */
    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d is outside the range [0, %d]", index, size)
            );
        } // if
    } // checkPositionIndex
} // LinkedBasedList
