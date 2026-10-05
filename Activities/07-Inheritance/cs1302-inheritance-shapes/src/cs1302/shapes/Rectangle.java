package cs1302.shapes;

/**
 * A rectangle is a shape with a length and a width.
 */
public class Rectangle extends Shape {

    /** Length of the Rectangle. **/
    private double length;
    /** Width of the Rectangle. **/
    private double width;

    /**
     * Constructs a {@link Rectangle} object with the specified length
     * and width.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(double length, double width) {
        // Call parent class constructor
        super("Rectangle");
        this.length = length;
        this.width = width;
    } // Rectangle

    /**
     * Returns the length of the rectangle.
     *
     * @return the length of the rectangle
     */
    public double getLength() {
        return this.length;
    } // getLength

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    } // getWidth

    /**
     * Returns the area of this rectangle.
     *
     * @return the area of this rectangle
     */
    public double getArea() {
        return this.length * this.width;
    } // getArea

    /**
     * Returns the perimeter of this rectangle. Formally, this method returns the length of the
     * continuous line forming the boundary of this shape.
     *
     * @return the perimeter of this rectangle
     */
    public double getPerimeter() {
        return 2.0 * this.length + 2.0 * this.width;
    } // getPerimeter

} // Rectangle
