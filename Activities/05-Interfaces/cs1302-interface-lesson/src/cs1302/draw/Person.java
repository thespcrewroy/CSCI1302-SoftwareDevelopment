package cs1302.draw;

import java.awt.Color;

/**
 * Describes a person.
 */
public class Person implements Drawable {

    private Color eyeColor;
    private Color hairColor;

    /**
     * Constructs a {@code Person}.
     *
     * @param eyeColor The person's eye color.
     * @param hairColor The person's hair color.
     */
    public Person(Color eyeColor, Color hairColor) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    } // Person

    /**
     * Describe the appearance.
     */
    public void describeAppearance() {
        System.out.println("This person has " +
                           eyeColor.toString() + " eyes and " +
                           hairColor.toString() + " hair.");
    } // describeAppearance

    // Getter methods
    public Color getEyeColor() {
        return this.eyeColor;
    } // getEyeColor

    public Color getHairColor() {
        return this.hairColor;
    } // getHairColor

    @Override
    public void draw() {
        System.out.println("**** Gathering info to draw the Person ****");
        System.out.printf("Getting eye color... %s\n", this.getEyeColor());
        System.out.printf("Getting hair color... %s\n", this.getHairColor());
        System.out.println("**** Rendering Person... ****");
        System.out.printf(
            "This is a person with eye color %s and hair color %s.\n",
            this.getEyeColor(),
            this.getHairColor()
        );

        System.out.println("   O   ");
        System.out.println("  /|\\  ");
        System.out.println("  / \\  ");
    } // draw

} // Person
