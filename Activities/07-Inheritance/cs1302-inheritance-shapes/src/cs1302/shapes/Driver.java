package cs1302.shapes;

/**
 * The driver program for our shapes example. This class
 * contains the main method and can be executed.
 */
public class Driver {

    public static void main(String[] args) {

        // Add two shapes of each type
        // Circle, Ellipse, Rectangle, and Square
        Shape[] shapes = new Shape[] {
            new Ellipse(1.1, 2.5),
            new Circle(1.5),
            new Rectangle(2.0, 3.0),
            new Square(2.5)
        };

        // Call the printInfo method below:
        printInfo(shapes);

        // Call the getLargestByArea method and print the result below:
        Shape largest = getLargestByArea(shapes);
        System.out.println("The largest shape by area is: " + largest.getName());

    } // main

    /**
     * Prints information about every shape in the specified array.
     * Loops over the array, and, for each element, prints the name of
     * the shape, the area, and the perimeter.
     *
     * @param shapes the array of shapes to print information about
     */
    public static void printInfo(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println("Name: " + shape.getName() + ", Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        } // for
    } // printInfo

    /**
     * Returns the largest shape by area. Compares all of
     * the provided shapes and returns the one with the largest area.
     *
     * @param shapes the array of shapes to compare
     * @return the largest shape
     */
    public static Shape getLargestByArea(Shape[] shapes) {
        Shape largest = null;
        double largestArea = Double.NEGATIVE_INFINITY;

        for (Shape shape : shapes) {
            double area = shape.getArea();
            if (area > largestArea) {
                largestArea = area;
                largest = shape;
            } // if
        } // for

        return largest;
    } // getLargestByArea

} // Driver
