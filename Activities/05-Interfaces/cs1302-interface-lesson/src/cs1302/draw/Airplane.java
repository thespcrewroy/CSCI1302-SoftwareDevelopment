package cs1302.draw;

import java.awt.Color;

/**
 * Describes an airplane.
 */
public class Airplane implements Drawable {

    private Color paintColor;
    private int numberOfWheels;
    private double length;

    /**
     * Construct an {@code Airplane}.
     *
     * @param paintColor The body paint color.
     * @param numberOfWheels The number of wheels.
     * @param length The length of the plain.
     */
    public Airplane(Color paintColor, int numberOfWheels, double length) {
        this.paintColor = paintColor;
        this.numberOfWheels = numberOfWheels;
        this.length = length;
    } // Airplane

    /**
     * Make the airplane fly.
     */
    public void fly() {
        System.out.printf(
            "The %s airplane, with %d wheels and a length of ~ %.2f meters, is flying high!\n",
            this.paintColor,
            this.numberOfWheels,
            this.length
        );
    } // fly

    /**
     * Get the paint color.
     *
     * @return The paint color.
     */
    public Color getPaintColor() {
        return this.paintColor;
    } // getPaintColor

    /**
     * Get the number of wheels.
     *
     * @return The number of wheels.
     */
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    } // getNumberOfWheels

    /**
     * Get the length.
     *
     * @return The length.
     */
    public double getLength() {
        return this.length;
    } // getLength

    @Override
    public void draw() {
        System.out.println();
        System.out.println("**** Gathering info to draw Airplane ****");
        System.out.printf("Getting paint color... %s\n", this.getPaintColor());
        System.out.printf("Getting the number of wheels... %d\n", this.getNumberOfWheels());
        System.out.printf("Getting the length... ~ %.2f\n", this.getLength());
        System.out.println("**** Rendering Airplane... ****");
        this.fly();
        System.out.println("                                       __");
        System.out.println("                            __________/ /|");
        System.out.println("                ___________/          / /");
        System.out.println("      _________/                     / /");
        System.out.println("     <________________===0==================>");
        System.out.println("      \\_________          ______        \\ \\");
        System.out.println("                \\________/      \\________\\ \\");
        System.out.println("                                          \\_\\|");
    } // draw

} // Airplane
