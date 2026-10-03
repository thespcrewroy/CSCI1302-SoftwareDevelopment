package cs1302.draw;

import java.awt.Color;

public class Flower implements Drawable {

    private Color petalColor;
    private int numberOfPetals;

    public Flower(Color petalColor, int numberOfPetals) {
        this.petalColor = petalColor;
        this.numberOfPetals = numberOfPetals;
    } // Flower

    public void bloom() {
        System.out.println("The flower with " +
                           numberOfPetals + " petals is blooming!");
    } // bloom

    public void changeColor(Color newColor) {
        this.petalColor = newColor;
        System.out.println("The flower's color has been changed to " + newColor);
    } // changeColor

    // Getter methods
    public Color getPetalColor() {
        return this.petalColor;
    } // getPetalColor

    public int getNumberOfPetals() {
        return this.numberOfPetals;
    } // getNumberOfPetals

    @Override
    public void draw() {
        System.out.println("**** Gathering info to draw Flower ****");
        System.out.printf("Getting petal color... %s\n", this.getPetalColor());
        System.out.printf("Getting the number of petals... %s\n", this.getNumberOfPetals());
        System.out.println("**** Rendering Flower... ****");
        System.out.printf(
            "This %s flower has %d petals!\n",
            this.getPetalColor(),
            this.getNumberOfPetals()
        );
        System.out.println("         .-.");
        System.out.println("   .--. (   ) .--.");
        System.out.println(" (    )  (@)  (    )");
        System.out.println("   `--' (   ) `--'");
        System.out.println("         `-'");
        System.out.println("          |");
        System.out.println("          |");
        System.out.println("         \\|/");
        System.out.println("          |");
        System.out.println("        --+--");
    } // draw

} // Flower
