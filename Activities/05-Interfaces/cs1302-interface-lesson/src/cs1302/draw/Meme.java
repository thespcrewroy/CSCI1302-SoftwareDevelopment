package cs1302.draw;

import java.awt.Color;

public class Meme implements Drawable {

    private String text;
    private Color textColor;

    public Meme(String text, Color textColor) {
        this.text = text;
        this.textColor = textColor;
    } // Meme

    public void changeText(String newText) {
        this.text = newText;
        System.out.println("The meme's text has been changed to: " + newText);
    } // changeText

    public void changeTextColor(Color newColor) {
        this.textColor = newColor;
        System.out.println("The meme's text color has been changed to: " + newColor);
    } // changeTextColor

    // Getter methods
    public String getText() {
        return this.text;
    } // getText

    public Color getTextColor() {
        return this.textColor;
    } // getTextColor

    @Override
    public void draw() {
        System.out.println("**** Gathering info to draw Meme ****");
        System.out.printf("Getting meme text... %s\n", this.getText());
        System.out.printf("Getting meme text color... %s\n", this.getTextColor());
        System.out.println("**** Rendering Meme... ****");
        System.out.printf(
            "This meme has the text '%s' in color %s!\n",
            this.getText(),
            this.getTextColor()
        );
        System.out.printf("\"%s\"\n", this.getText());
        System.out.println("             / \\__");
        System.out.println("            (    @\\___");
        System.out.println("            /         O");
        System.out.println("           /   (_____/");
        System.out.println("          /_____/   U");
        System.out.println("             much wow");
    } // draw
    
}
