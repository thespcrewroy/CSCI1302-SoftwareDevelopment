package cs1302.shapes;

public class Square extends Rectangle {

    /**
     * Constructs a {@link Square} object with the specified side length.
     *
     * @param sideLength the length of each side of the square
     */
    public Square(double sideLength) {
        // Call parent class constructor with length and width equal to side
        super(sideLength, sideLength);
        setName("Square");
    } // Square

    /**
     * Returns the length of each side of this square.
     *
     * @return the length of each side of this square
     */
    public double getSideLength() {
        return getLength(); // or getWidth(), since they are equal
    } // getSideLength
}
