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
     * Returns the length of each side of this {@link Square}.
     *
     * @return the length of each side of this {@link Square}
     */
    public double getSideLength() {
        return getLength(); // or getWidth(), since they are equal
    } // getSideLength

    /**
     * Returns the area of this {@link Square}.
     *
     * @return the area of this {@link Square}
     */
    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    } // getArea

    /**
     * Returns the perimeter of this {@link Square}. Formally, this method returns the length of the
     * continuous line forming the boundary of this shape.
     *
     * @return the perimeter of this {@link Square}
     */
    @Override
    public double getPerimeter() {
        return 4 * getSideLength();
    } // getPerimeter
}
